package org.networkcalculus.dnc.optree.toolchain;


import jogamp.opengl.glu.nurbs.Bin;
import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.DifferentialFunction;
import nilgiri.math.autodiff.Variable;

import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;
import org.networkcalculus.dnc.optree.bounds.Bound;
import org.networkcalculus.dnc.optree.constraints.Constraint;
import org.networkcalculus.dnc.optree.nodes.OpTNode;
import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.tandem.fifo.NestedTandemAnalysis;
import org.networkcalculus.dnc.tandem.fifo.TNode;
import org.networkcalculus.num.Num;

import org.nlopt4j.optimizer.NLopt;
import org.nlopt4j.optimizer.NLoptResult;

import java.io.*;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

/**
 * @author Lukas Herll
 *
 * Runs a DNC analysis using a binary operator tree on the given network.
 * Recommended use:
 * initialise with second constructor (provide the nesting tree): new OpTreeAnalysis(TNode nestingTree)
 * run the analysis: runAnalysis(plugin, resultFilePath, initialGuess)
 *
 * the first constructor has not been tested
 *
 * TODO the function getMapParamIdToParamValue maps the parameter id's (in their names) to their respective values
 *  this function is essential to the DiffLUDB analysis, but only works properly if the plugin names the parameters accordingly
 *  and if the operator tree passes the correct id to the plugin
 *  => surely there is a more resilient solution
 */
public class OpTreeAnalysis {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ServerGraph sg;
    private Flow foi;
    private TNode nestingTree;
    private Server foiSource, foiSink;

    private OpTNode opTree;
    //TODO new version:
    //private AbsOpTNode opTree;
    private SymbolicTerm symbolicTerm;
    private Variable<DoubleReal> t;
    private ArrayList<Variable<DoubleReal>> openParameters;
    private ArrayList<Bound> bounds;
    private ArrayList<Constraint> constraints;
    private ArrayList<Double> initialGuess;
    private ArrayList<Double> paramValues;
    private double result;

    private FileManager fileManager;

    //if set to false, only occurring errors will be printed to console (no results etc. Results will still be written to files)
    public static boolean printToConsole;

    public static int nlopt_alg = 40; // 40 == SLSQP default
    public static int iterations_max = -1; // -1 == no limit
    //the maximum time in seconds after which the analysis timeouts
    // public static long maxIterationTimeInSec;

    //set the NLopt relative tolerance
    public static double nloptRelativeTolerance = 1e-4;
    //timestamps
    public static long timestampObjFuncDerived;
    public static long timestampSolverStarted;

    //only the algorithms with the following codes use the gradient => do not compute the gradient for the rest
    private final ArrayList<Integer> gradientBasedAlgs = new ArrayList<>(Arrays.asList(8,9,10,11,13,14,15-18,21,23,24,31,33,40,41,100,500));

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTreeAnalysis(ServerGraph sg, Flow foi){
        this.sg = sg;
        this.foi = foi;
        if(!setSourceSink()){
            System.out.println("Could not automatically find the nesting tree.");
        }
        else {
            nestingTree = getNestingTree(foiSource, foiSink);
        }
        this.fileManager = FileManager.getInstance();
    }

    public OpTreeAnalysis(TNode nestingTree){
        this.nestingTree = nestingTree;
        this.fileManager = FileManager.getInstance();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: obtaining the nesting tree
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Sets the source and sink server of the foi if unambiguously possible.
     * @return  true iff there are unambiguous source and sink servers (only one in the source and sink set)
     */
    private boolean setSourceSink(){
        Set<Server> sourceSet = sg.getSourceSet();
        Set<Server> sinkSet = sg.getSinkSet();

        if(!(sourceSet.size() == 1 && sinkSet.size() == 1)){
            return false;
        }

        foiSource = (Server) sourceSet.toArray()[0];
        foiSink = (Server) sinkSet.toArray()[0];

        return true;
    }

    /**
     * Derives the nesting tree from the class`server graph and foi.
     * @return  the nesting tree
     */
    private TNode getNestingTree(Server source, Server sink){
        TNode nestingTree = null;

        try{
            //compute the nesting tree
            //sg.getShortestPath(Server src, Server snk) returns Path from src to snk
            NestedTandemAnalysis nta = new NestedTandemAnalysis(sg.getShortestPath(source, sink), foi, sg.getFlows());
            //use method NestedTandemAnalysis().onlyComputeNestingTree() to retrieve the nesting tree as a TNode object
            nestingTree = nta.onlyComputeNestingTree();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return nestingTree;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: running the analysis
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * TODO the matching of parameter to parameter name relies solely on the crossflow's alias => find a more resilient way
     * Runs the DNC analysis on the given network using the provided plugin.
     * @param plugin
     *                          the plugin specifying the parameters, bounds, constraints, as well as (possibly) modifying
     *                          some operations. Define a new one or use a pre-existing one.
     * @param initialGuess
     *                          an ArrayList containing the initial values of the parameters
     *                          otherwise it is deleted after the analysis is run
     * @return  the computed delay bound
     */
    public double runDelayBoundAnalysis(BinOperatorPlugin plugin, Map<Flow, Num> initialGuess){
        deriveOpTree(plugin);

        //the parameters have already been derived in deriveOpTree(plugin)
        //thus, construct a list of double values from the provided map serving as the initial guesses for the parameters
        //and matching the order of the list of parameters
        //first, transform the provided map into a map <String, Double> (Flow alias, value)
        Map<String, Double> initialGuessTransformed = new HashMap<>();
        for(Flow flow : initialGuess.keySet()){
            initialGuessTransformed.put(flow.getAlias(), initialGuess.get(flow).doubleValue());
        }

        this.initialGuess = new ArrayList<>();
        for(int i = 0; i < this.openParameters.size(); i++){
            String parameterName = openParameters.get(i).getName(); //"s_<crossflowName>"
            String flowAlias = parameterName.substring(2); //"<crossflowName>"
            Double initialParamValue = initialGuessTransformed.get(flowAlias);
            this.initialGuess.add(initialParamValue);
        }


        //there needs to be an initial value for each parameter
        if(this.openParameters.size() != initialGuess.size()){
            assert this.openParameters.size() == initialGuess.size();
            return -1;
        }

        return analysis();
    }


    /**
     * Runs the DNC analysis on the given network using the provided plugin.
     * @param plugin
     *                          the plugin specifying the parameters, bounds, constraints, as well as (possibly) modifying
     *                          some operations. Define a new one or use a pre-existing one.
     * @param initialGuess
     *                          an ArrayList containing the initial values of the parameters
     * @return  the computed delay bound
     */
    public double runDelayBoundAnalysis(BinOperatorPlugin plugin, ArrayList<Double> initialGuess){
        deriveOpTree(plugin);

        this.initialGuess = initialGuess;
        //there needs to be an initial value for each parameter
        if(this.openParameters.size() != initialGuess.size()){
            assert this.openParameters.size() == initialGuess.size();
            return -1;
        }

        return analysis();
    }


    /**
     * Runs the DNC analysis on the given network using the provided plugin. Sets the initial guesses for all parameters
     * to zero.
     * @param plugin
     *                          the plugin specifying the parameters, bounds, constraints, as well as (possibly) modifying
     *                          some operations. Define a new one or use a pre-existing one.
     * @return  the computed delay bound
     */
    public double runDelayBoundAnalysis(BinOperatorPlugin plugin){
        deriveOpTree(plugin);

        initialGuess = new ArrayList<>();
        //create an initial guess for each parameter and set it to zero
        for(Object o : openParameters){
            initialGuess.add(0d);
        }
        //there needs to be an initial value for each parameter
        if(this.openParameters.size() != initialGuess.size()){
            assert this.openParameters.size() == initialGuess.size();
            return -1;
        }

        return analysis();
    }


    /**
     * Omits the delay bound analysis and instead tests for convexity of the objective function.
     * @param plugin
     * @return  true iff convex
     */
    public boolean runConvexityAnalysis(BinOperatorPlugin plugin){
        deriveOpTree(plugin);
        return convexityTest();
    }


    /**
     * Derives the binary operator tree from the given nesting tree (provided by the constructor). Also computes and
     * extracts the symbolic term, and the open parameters from the optree.
     * @param plugin
     *                  the plugin specifying the parameters, bounds, constraints, as well as (possibly) modifying
     *                  some operations. Define a new one or use a pre-existing one.
     *
     */
    private void deriveOpTree(BinOperatorPlugin plugin){
        //transform the nesting tree into an operator tree
        onlyDeriveOpTree();
        //derive the symbolic term, the parameters, bounds, and constraints
        this.opTree.deriveSymbolics(plugin);
        //extract the relevant quantities
        this.symbolicTerm = this.opTree.getSymbolicTerm();
        this.t = this.opTree.getVariable();
        this.openParameters = this.opTree.getParameters();
        this.bounds = this.opTree.getBounds();
        this.constraints = this.opTree.getConstraints();

        //create a timestamp
        timestampObjFuncDerived = System.nanoTime();
    }


    /**
     * Uses the OpTNode constructor to transform the given nesting tree (given in this class's attributes) into a binary
     * operator tree. Stores the result internally in the attribute optree.
     * @return  the creates binary operator tree
     */
    public OpTNode onlyDeriveOpTree(){
        //transform the nesting tree into an operator tree
        this.opTree = new OpTNode(this.nestingTree);
        //TODO new version:
        //this.opTree = new OpTDelayNode(this.nestingTree);
        //opTree.printOpTree();

        return this.opTree;
    }


    /**
     * Extracts the bounds and constraints from the binary operator tree, runs the analysis, and creates the output file.
     * @return  the computed delay bound
     */
    private double analysis(){

        //solve the NLP
        //first check, whether there are any open parameters in the current tandem
        if(this.openParameters.size() == 0){
            //there are no open parameters, therefore the NLP can be solved immediately
            this.result = this.symbolicTerm.getTerm().getValue().doubleValue();
            timestampSolverStarted = System.nanoTime();
        }
        else {
            solveNLopt4j();

            if(printToConsole){
                //print the found parameters to console
                System.out.println("The found parameter values are:");
                for(Variable<DoubleReal> param : openParameters){
                    System.out.println(param.getName() + " = " + param.getValue());
                }
            }

            //compute the result
            this.result = computeResult(paramValues);
        }

        if(printToConsole){
            //print the results to console
            System.out.println("The result is: " + result + "\n\n");
        }

        return this.result;
    }


    /**
     * Solves the NLP by using the NLopt wrapper nlopt4j. Sets the paramValues attribute.
     *
     * Note: this.nlopt_alg = 100 indicates SLSQPminSBPLX
     * TODO: Check if the returned result is valid (otherwise: error code -1)
     */
    private void solveNLopt4j(){
        NLoptResult result;

        //store the initial guesses in an array
        double[] x = new double[this.initialGuess.size()];
        for(int i = 0; i < this.initialGuess.size(); i++){
            x[i] = this.initialGuess.get(i);
        }

        //if any solver code other than 100 (SLSQPminSBPLX) is selected, execute the solver as usual
        if(nlopt_alg != 100){
            result = solveNLoptAlg(nlopt_alg, x);
        }
        else{
            //run both, SLSQP and SBPLX, and take the minimum

            //copy the initial parameter values
            double[] x_sbplx = new double[this.initialGuess.size()];
            for(int i = 0; i < this.initialGuess.size(); i++){
                x_sbplx[i] = this.initialGuess.get(i);
            }

            //run slsqp
            result = solveNLoptAlg(40, x); //SLSQP

            //run sbplx
            NLoptResult result_sbplx = solveNLoptAlg(29, x_sbplx); //SBPLX

            double min_slsqp = result.minValue();
            double min_sbplx = result_sbplx.minValue();

            //compare the results
            if(result_sbplx.minValue() < result.minValue()){
                //SBPLX was better => copy the result and parameters to x and result
                result = result_sbplx;
                x = x_sbplx;
            }

            assert result.minValue() <= Math.min(min_slsqp, min_sbplx);
        }


        // TODO explicitly check Netid, Fid = 13, 56
        // NLP (min at each step) is better than SBPLX, but worse then SLSQP

        //TODO delete, if the version above works equally well or better
        /*
        if(nlopt_alg != 100) {
            result = solveNLoptAlg(nlopt_alg, x);
        } else {
            for(int i = 0; i < this.initialGuess.size(); i++){
                x[i] = this.initialGuess.get(i);
            }
            result = solveNLoptAlg(40, x); // SLSQP

            double[] x_alg2 = new double[this.initialGuess.size()];
            for(int i = 0; i < this.initialGuess.size(); i++){
                x_alg2[i] = this.initialGuess.get(i);
            }
            NLoptResult result_alg2 = solveNLoptAlg(29, x_alg2); // SBPLX

            if( result_alg2.minValue() <= result.minValue() ) {
                result = result_alg2;
                x = x_alg2;
            }
        }
        */

        //set the paramValues attribute
        this.paramValues = new ArrayList<>();
        for(int i = 0; i < x.length; i++){
            this.paramValues.add(x[i]);
        }
    }


    /**
     * Solves the optimisation problem defined by <code>symbolicTerm</code>. The resulting parameter values are stored in
     * <code>x_param</code>
     *
     * Note: As of now, no constraints are defined, even if they exist in <code>constraints</code>
     *
     * @param nlopt_alg_method
     *                          the code of the nlopt solver to be used
     * @param x_params
     *                          an array with initial parameter guesses. After this function has terminated, x_param holds
     *                          the parameter values corresponding to the found minimum.
     * @return  the resulting NLoptResult
     */
    private NLoptResult solveNLoptAlg(int nlopt_alg_method, double[] x_params){
        NLopt optimiser = new NLopt(nlopt_alg_method, openParameters.size());
        optimiser.setRelativeToleranceOnX(nloptRelativeTolerance);
        if(OpTreeAnalysis.iterations_max > 0 ) {
            optimiser.setMaxEval(iterations_max);
        }
       //  optimiser.setMaxTime(maxIterationTimeInSec);

        Hashtable<Variable<DoubleReal>, DifferentialFunction<DoubleReal>> jacobi = new Hashtable<>();
        if(gradientBasedAlgs.contains(nlopt_alg_method)){
            for(Variable<DoubleReal> param : openParameters){
                jacobi.put(param, symbolicTerm.getTerm().diff(param));
            }
        }

        //define the objective function in NLopt notation
        NLopt.NLopt_func objectiveFunction = new NLopt.NLopt_func() {
            @Override
            public double execute(double[] x, double[] gradient) {
                //copy the param values provided by the arguments to the open parameters in the OpTree
                assert openParameters.size() == x.length;
                for(int i = 0; i < openParameters.size(); i++){
                    openParameters.get(i).set(new DoubleReal(x[i]));
                }

                if(gradientBasedAlgs.contains(nlopt_alg_method)){
                    //set the gradient values (the initial binary conditional is required) (only for gradient-based solvers)
                    if(gradient.length == x.length){
                        for(int i = 0; i < gradient.length; i++){
                            //TODO test the effect of differentiation outside of execute() (see above)
                            //gradient[i] = symbolicTerm.getTerm().diff(openParameters.get(i)).getValue().doubleValue();
                            gradient[i] = jacobi.get(openParameters.get(i)).getValue().doubleValue();
                        }
                    }
                }

                return symbolicTerm.getTerm().getValue().doubleValue();
            }
        };

        optimiser.setMinObjective(objectiveFunction);


        //define the bounds in NLopt notation
        double[] lowerBounds = new double[this.bounds.size()];
        double[] upperBounds = new double[this.bounds.size()];

        for(int i = 0; i < bounds.size(); i++){
            Integer lb = bounds.get(i).getLowerBound();
            lowerBounds[i] = lb == null ? Double.NEGATIVE_INFINITY : lb;
            Integer ub = bounds.get(i).getUpperBound();
            upperBounds[i] = ub == null ? Double.POSITIVE_INFINITY : ub;
        }

        optimiser.setLowerBounds(lowerBounds);
        optimiser.setUpperBounds(upperBounds);

        //TODO create a wrapper for constraints


        //take a timestamp
        timestampSolverStarted = System.nanoTime();


        //solve the NLP
        NLoptResult result = new NLoptResult(-1, Double.NEGATIVE_INFINITY);
        try {
            result = optimiser.optimize(x_params);
            optimiser.release();
        }
        catch(Exception e) {
            if(printToConsole){
                System.out.println(e);
            }
            optimiser.release();
        }

        return result;
    }


    /**
     * Computes the result from the symbolic term and the parameter values returned by the NLP solver
     * @param paramValues
     *                      the parameter values returned by the NLP solver
     * @return  the resulting value
     */
    private double computeResult(ArrayList<Double> paramValues){
        //there must be exactly one value for each parameter
        if(this.openParameters.size() != paramValues.size()){
            assert this.openParameters.size() == paramValues.size();
            return -1;
        }

        //assign the values from the NLP solver to the corresponding parameters
        for(int i = 0; i < paramValues.size(); i++){
            openParameters.get(i).set(new DoubleReal(paramValues.get(i)));
        }
        opTree.computeDelayFromCurrentParamValues();
        return symbolicTerm.getTerm().getValue().doubleValue();
    }


    /**
     * Omits the analysis, but tests the objective function for convexity.
     * Tests the condition z^T H z >= 0,
     * where H represents the Hessian, and z represents a random real-valued vector. The condition is tested numerically.
     *
     * @return  true iff convex
     */
    private boolean convexityTest(){
        final int numberOfRandomThetaSettings = 100;
        final int maxRandomThetaValue = 10;
        final int numberOfRandomVectors = 100;
        final int minRandomVectorValue = -10;
        final int maxRandomVectorValue = 10;

        //compute the Hessian and check the condition z^T*M*z >= 0 for arbitrary real-valued vectors z
        Hashtable<Variable<DoubleReal>, Hashtable<Variable<DoubleReal>, DifferentialFunction<DoubleReal>>> hessian =
                computeHessian();

        for(int thetaSetting = 0; thetaSetting < numberOfRandomThetaSettings; thetaSetting++){
            //set thetas to random values
            setParametersToRandomValues(maxRandomThetaValue);

            for(int randomVector = 0; randomVector < numberOfRandomVectors; randomVector++){
                //compute random vector z
                Hashtable<Variable<DoubleReal>, DoubleReal> z = getRandomVector(minRandomVectorValue, maxRandomVectorValue);
                //compute z^T H z and test whether the result is >= 0
                if(!checkConvexityCondition(hessian, z)){
                    return false;
                }
            }
        }

        return true;
    }


    private Hashtable<Variable<DoubleReal>, DifferentialFunction<DoubleReal>> computeJacobi(){
        Hashtable<Variable<DoubleReal>, DifferentialFunction<DoubleReal>> jacobi = new Hashtable<>();
        for(Variable<DoubleReal> param : openParameters){
            jacobi.put(param, symbolicTerm.getTerm().diff(param));
        }
        return jacobi;
    }


    /**
     * Computes the Hessian of the objective function.
     * The first Hashtable key refers to the parameter that is used for the first partial derivative, and the second key
     * refers to the variable that is used for the second derivative.
     * E.g. to retrieve d^2f/(dxdy) use hessian.get(x).get(y).
     * Here, x refers to the row and y refers to the column of the hessian.
     * @return
     */
    private Hashtable<Variable<DoubleReal>, Hashtable<Variable<DoubleReal>,
            DifferentialFunction<DoubleReal>>> computeHessian(){
        Hashtable<Variable<DoubleReal>, Hashtable<Variable<DoubleReal>, DifferentialFunction<DoubleReal>>> hessian = new Hashtable<>();
        //fill the hessian with empty hash-tables
        for(Variable<DoubleReal> param : openParameters){
            hessian.put(param, new Hashtable<>());
        }

        //fill the hessian
        Hashtable<Variable<DoubleReal>, DifferentialFunction<DoubleReal>> jacobi = computeJacobi();
        for(Variable<DoubleReal> x : openParameters){
            //fill each row element
            //extract the Hessian row representing df/dx
            Hashtable<Variable<DoubleReal>, DifferentialFunction<DoubleReal>> hessianRowX = hessian.get(x);
            //extract df/dx from the Jacobi
            DifferentialFunction<DoubleReal> dfdx = jacobi.get(x);

            for(Variable<DoubleReal> y : openParameters){
                //fill each column
                //compute d^2f/dxdy
                DifferentialFunction<DoubleReal> d2fdxdy = dfdx.diff(y);
                //add the result to the Hessian
                hessianRowX.put(y, d2fdxdy);
            }
        }
        return hessian;
    }


    /**
     * Note: mainly used for debugging purposes.
     * @param hessian
     * @return  the hessian as a 2d array consisting of the numerical values derived from the current parameter settings
     */
    private double[][] computeHessianWithCurrentParamSettings(Hashtable<Variable<DoubleReal>, Hashtable<Variable<DoubleReal>,
            DifferentialFunction<DoubleReal>>> hessian){

        double[][] numericalHessian = new double[openParameters.size()][openParameters.size()];

        for(Variable<DoubleReal> x : openParameters){
            for(Variable<DoubleReal> y : openParameters){
                numericalHessian[openParameters.indexOf(x)][openParameters.indexOf(y)] = hessian.get(x).get(y).getValue().doubleValue();
            }
        }
        return numericalHessian;
    }


    /**
     *
     * @param min   the minimum allowed value (inclusive)
     * @param max   the maximum allowed value (inclusive)
     * @return
     */
    private double getRandomNumber(double min, double max){
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }


    /**
     * Sets all open parameters to a random value x, where x >= the minimum bound of the variable and
     * x <= max(minimum bound of the variable, min(maxParamValue, maximum bound of the variable))
     * @param maxParamValue the maximum value the parameters are supposed to be set to
     */
    private void setParametersToRandomValues(int maxParamValue){
        for(int i = 0; i < openParameters.size(); i++){
            double min = bounds.get(i).getLowerBound() != null ? bounds.get(i).getLowerBound() : 0;
            double maxValue;
            if(bounds.get(i).getUpperBound() != null){
                maxValue = Math.min(maxParamValue, bounds.get(i).getUpperBound());
            }
            else {
                maxValue = maxParamValue;
            }
            double max = Math.max(min, maxValue);

            Variable<DoubleReal> param = openParameters.get(i);
            param.set(new DoubleReal(getRandomNumber(min, max)));
        }
    }


    /**
     * Creates a vector with random entries in the range [minRandomVectorValue, maxRandomVectorValue]. The number of entries
     * is equal to the number of parameters.
     * @param minRandomVectorValue  the minimal allowed value of each entry
     * @param maxRandomVectorValue  the maximal allowed value of each entry
     * @return
     */
    private Hashtable<Variable<DoubleReal>, DoubleReal> getRandomVector(double minRandomVectorValue, double maxRandomVectorValue){
        Hashtable<Variable<DoubleReal>, DoubleReal> vector = new Hashtable<>();
        for(Variable<DoubleReal> param : openParameters){
            vector.put(param, new DoubleReal(getRandomNumber(minRandomVectorValue, maxRandomVectorValue)));
        }
        return vector;
    }


    /**
     * Checks the convexity condition for the provided hessian matrix and the given vector: z^T H z >= 0
     * @param hessian   the hessian matrix H
     * @param vector    a real-valued vector z
     * @return  true iff z^T H z >= 0
     */
    private boolean checkConvexityCondition(Hashtable<Variable<DoubleReal>, Hashtable<Variable<DoubleReal>,
            DifferentialFunction<DoubleReal>>> hessian,
                                            Hashtable<Variable<DoubleReal>, DoubleReal> vector){

        //compute (z^T H)_column = sum_row ((z^T)_row * H_row_column)
        Hashtable<Variable<DoubleReal>, Double> zTimesH = new Hashtable<>();
        for(Variable<DoubleReal> column : openParameters){
            double zTimesHEntry = 0;
            for(Variable<DoubleReal> row : openParameters){
                DifferentialFunction<DoubleReal> hessianElement = hessian.get(row).get(column);
                zTimesHEntry += vector.get(row).doubleValue() * hessianElement.getValue().doubleValue();
            }
            zTimesH.put(column, zTimesHEntry);
        }

        //compute the result (z^T H) * z = sum_column ((z^T H)_column * z_column)
        double result = 0;
        for(Variable<DoubleReal> column : openParameters){
            result += zTimesH.get(column).doubleValue() * vector.get(column).doubleValue();
        }

        return result >= 0;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getters, setters
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * @return  the binary operator tree derived from the given nesting tree or server graph
     */
    public OpTNode getOpTree(){
        return this.opTree;
    }


    /**
     *
     * @return  the symbolic term
     */
    public SymbolicTerm getSymbolicTerm(){
        return symbolicTerm;
    }


    /**
     *
     * @return  the function variable t
     */
    public Variable<DoubleReal> getVariable(){
        return this.t;
    }


    /**
     *
     * @return  a list of all open parameters
     */
    public ArrayList<Variable<DoubleReal>> getOpenParameters(){
        return openParameters;
    }


    /**
     *
     * @return  a list of all bounds
     */
    public ArrayList<Bound> getBounds(){
        return bounds;
    }


    /**
     *
     * @return  a list of all constraints
     */
    public ArrayList<Constraint> getConstraints(){
        return constraints;
    }


    /**
     *
     * @return  a list containing the initial values of the open parameters as used in the analysis
     */
    public ArrayList<Double> getInitialGuess(){
        return initialGuess;
    }


    /**
     *
     * @return  the list of all open parameters
     */
    public ArrayList<Variable<DoubleReal>> getParameters(){
        return this.opTree.getParameters();
    }


    /**
     *
     * @return  a list containing the found values for the parameters
     */
    public ArrayList<Double> getParamValues(){
        return paramValues;
    }


    /**
     * Maps the cross-flow aliases of each parameter to their values. (The name of each FIFO parameter comprises "s_" followed
     * by the alias of the respective cross-flow of the corresponding leftover operation.)
     * @return  a map <param alias, param value>
     */
    public Map<String, Double> mapCrossFlowAliasToParamValue(){
        Map<String, Double> paramMap = new HashMap<>();

        ArrayList<Variable<DoubleReal>> parameters = getParameters();
        for(Variable<DoubleReal> parameter : parameters){
            //extract the parameter's id from its name ("s_id", e.g. "s_crossflow_subst{f3,f5}")
            String paramAlias = parameter.getName().substring(2);
            paramMap.put(paramAlias, Double.valueOf(parameter.getValue().doubleValue()));
        }
        return paramMap;
    }


    /**
     *
     * @return  the resulting value
     */
    public double getResult(){
        return result;
    }

}
