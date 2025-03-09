package org.networkcalculus.dnc.optree.plugins;

import nilgiri.math.DoubleReal;
import nilgiri.math.DoubleRealFactory;
import nilgiri.math.autodiff.*;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.optree.nodes.*;
import org.networkcalculus.dnc.optree.bounds.Bound;
import org.networkcalculus.dnc.optree.constraints.Constraint;
import org.networkcalculus.dnc.optree.constraints.ConstraintType;
import org.networkcalculus.dnc.optree.symbolic.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lukas Herll
 *
 * An abstract class for a BinOperatorPlugin representing DNC operations for arbitrary multiplexing
 * in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 *
 * This class captures the basic DNC operations assuming arbitrary multiplexing, rate-latency service curves,
 * and token-bucket arrival curves.
 * A concrete implementation of this class can be used in conjunction with OpTNode to compute the symbolic DNC terms
 * corresponding to a binary operator tree, as well as the corresponding bounds and constraints.
 *
 * Recommended use: create a (non-abstract) class representing the plugin for a specific application.
 * Only implement the three abstract methods. To create new parameters and constants use createOpenParameter(name, initial_value)
 * and createConstant(name, value).
 * Set a bound for each parameter you create using createBound(parameter, lowerBound, upperBound). Be careful to bound
 * each parameter sensibly.
 * All constraints must be set by the deriveConstraints(OpTNode root) method.
 *
 * TODO I'm not sure about the methods using PA curves (ARB MUX)
 * TODO assertions concerning the type of symbolic terms are inelegant
 */
public abstract class AbstractArbMulPlugin implements BinOperatorPlugin{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //needed to create functions compatible with JAutoDiff
    protected final DoubleRealFactory RNFactory;
    protected final DifferentialRealFunctionFactory<DoubleReal> DFFactory;

    protected Variable<DoubleReal> t;
    protected Zero zero;

    protected ArrayList<Variable<DoubleReal>> parameters;
    protected ArrayList<Bound> bounds;
    protected ArrayList<Constraint> constraints;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public AbstractArbMulPlugin(){
        this.RNFactory = DoubleRealFactory.instance();
        this.DFFactory = new DifferentialRealFunctionFactory<DoubleReal>(RNFactory);

        //initialise t as a variable with value 0 (the value should be irrelevant)
        this.t = DFFactory.var("t", new DoubleReal(0));

        this.zero = DFFactory.zero();

        this.parameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: symbolic terms
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    //TODO delete eventually
    public SymbolicTerm computeSymbolicTerm(TreeOperator operator, String id, SymbolicTerm left_term, SymbolicTerm right_term){
        //the operation needs to be the delay bound, a convolution, or a leftover operation (in case more tree operators
        //get added later on)
        assert operator == TreeOperator.H_OPERATOR || operator == TreeOperator.CONVOLUTION || operator == TreeOperator.LEFTOVER;

        //wipe the stored parameters, bounds, and constraints from the previous node
        wipeSymbolics();

        if(operator == TreeOperator.H_OPERATOR){
            assert right_term instanceof TBArrivalSymbolic;
            assert left_term instanceof PASymbolic && !(left_term instanceof TBArrivalSymbolic);
            return computeDelayTerm((TBArrivalSymbolic) right_term,
                    left_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) left_term : (PASymbolic) left_term);
        }
        if(operator == TreeOperator.CONVOLUTION){
            assert left_term instanceof PASymbolic && !(left_term instanceof TBArrivalSymbolic);
            assert right_term instanceof PASymbolic && !(right_term instanceof TBArrivalSymbolic);
            return computeConvolutionTerm(left_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) left_term : (PASymbolic) left_term,
                    right_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) right_term : (PASymbolic) right_term);
        }
        else{
            assert right_term instanceof TBArrivalSymbolic;
            assert left_term instanceof PASymbolic && !(left_term instanceof TBArrivalSymbolic);
            return computeLeftoverTerm(left_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) left_term : (PASymbolic) left_term,
                    (TBArrivalSymbolic) right_term, id);
        }
    }


    @Override
    public SymbolicTerm computeSymbolicTerm(OpTOperatorNode opNode, SymbolicTerm left_term, SymbolicTerm right_term){
        //the operation needs to be the delay bound, a convolution, or a leftover operation (in case more tree operators
        //get added later on)
        assert opNode instanceof OpTHNode || opNode instanceof OpTConvNode || opNode instanceof OpTLeftoverNode;

        //wipe the stored parameters, bounds, and constraints stored from the previous node
        wipeSymbolics();

        if(opNode instanceof OpTHNode){
            assert right_term instanceof TBArrivalSymbolic;
            assert left_term instanceof PASymbolic && !(right_term instanceof TBArrivalSymbolic);
            return computeDelayTerm((TBArrivalSymbolic) right_term,
                    left_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) left_term : (PASymbolic) left_term);
        }
        if(opNode instanceof OpTConvNode){
            assert left_term instanceof PASymbolic && !(left_term instanceof TBArrivalSymbolic);
            assert right_term instanceof PASymbolic && !(right_term instanceof TBArrivalSymbolic);
            return computeConvolutionTerm(left_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) left_term : (PASymbolic) left_term,
                    right_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) right_term : (PASymbolic) right_term);
        }
        else{
            assert right_term instanceof TBArrivalSymbolic;
            assert left_term instanceof PASymbolic && !(left_term instanceof TBArrivalSymbolic);
            return computeLeftoverTerm(left_term instanceof RLServiceSymbolic ? (RLServiceSymbolic) left_term : (PASymbolic) left_term,
                    (TBArrivalSymbolic) right_term, ((OpTFlowNode) opNode.getRightChild()).getFlow().getAlias());
        }
    }


    /**
     * Computes the delay term (excluding the constant D) h(alpha, pi) - D of a leftover operation of a tb curve
     * and a PA curve
     * @param sigma     the bucket size of the arrival curve
     * @param stages    the stages (gamma_{sigma_x, rho_x}) of the PA curve
     * @return  the term [max_{stages}((sigma-sigma_x)/rho_x)]^+
     */
    protected DifferentialFunction<DoubleReal> computeMaxStagesTerm(DifferentialFunction<DoubleReal> sigma,
                                                                    List<TBArrivalSymbolic> stages){
        DifferentialFunction<DoubleReal> delayTerm = null;
        for(TBArrivalSymbolic stage : stages){
            DifferentialFunction<DoubleReal> sigma_x = stage.get_B();
            DifferentialFunction<DoubleReal> rho_x = stage.get_r();
            DifferentialFunction<DoubleReal> stageTerm = sigma.minus(sigma_x).div(rho_x);

            if(delayTerm == null){
                delayTerm = stageTerm;
            }
            else{
                delayTerm = delayTerm.maximum(stageTerm);
            }
        }
        delayTerm = delayTerm.minz(zero);
        return delayTerm;
    }


    /**
     * Computes the symbolic term of a H operation.
     * @param alpha
     *                      the term of a token-bucket arrival curve
     * @param beta
     *                      the term of a rate-latency service curve
     * @return  H(gamma, beta)
     */
    protected DelayTermSymbolic computeDelayTerm(TBArrivalSymbolic alpha, RLServiceSymbolic beta){
        return new DelayTermSymbolic(alpha.get_B().div(beta.get_R()).plus(beta.get_L()));
    }


    /**
     * Computes the symbolic term of a H operation.
     * @param alpha
     *                      the term of a token-bucket arrival curve
     * @param pi
     *                      the term of a pseudoaffine curve
     * @return  H(gamma, beta)
     */
    protected DelayTermSymbolic computeDelayTerm(TBArrivalSymbolic alpha, PASymbolic pi){
        if(pi instanceof RLServiceSymbolic){
            return computeDelayTerm(alpha, (RLServiceSymbolic) pi);
        }

        DifferentialFunction<DoubleReal> D = pi.getLatency();
        DifferentialFunction<DoubleReal> sigma = alpha.get_B();

        DifferentialFunction<DoubleReal> delayTerm = computeMaxStagesTerm(sigma, pi.getStages());

        delayTerm = D.plus(delayTerm);
        return new DelayTermSymbolic(delayTerm);
    }


    /**
     * Computes the symbolic term of a convolution operation.
     * @param beta_left
     *                      the term of a rate-latency service curve
     * @param beta_right
     *                      the term of a rate-latency service curve
     * @return  left_term \oplus right_term
     */
    protected PASymbolic computeConvolutionTerm(RLServiceSymbolic beta_left, RLServiceSymbolic beta_right){
        DifferentialFunction<DoubleReal> R_1 = beta_left.get_R();
        DifferentialFunction<DoubleReal> L_1 = beta_left.get_L();
        DifferentialFunction<DoubleReal> R_2 = beta_right.get_R();
        DifferentialFunction<DoubleReal> L_2 = beta_right.get_L();

        //new R = min(R_1, R_2)
        DifferentialFunction<DoubleReal> new_R = R_1.minimum(R_2);
        //new L = L_1+L_2
        DifferentialFunction<DoubleReal> new_L = L_1.plus(L_2);

        return new RLServiceSymbolic(new_R, new_L, this.t, this.zero);
    }


    /**
     * Computes the symbolic term of a convolution operation.
     * @param pi_left
     *                      the term of a pseudoaffine curve
     * @param pi_right
     *                      the term of a pseudoaffine curve
     * @return  left_term \oplus right_term
     */
    protected PASymbolic computeConvolutionTerm(PASymbolic pi_left, PASymbolic pi_right){
        if(pi_left instanceof RLServiceSymbolic && pi_right instanceof RLServiceSymbolic){
            return computeConvolutionTerm((RLServiceSymbolic) pi_left, (RLServiceSymbolic) pi_right);
        }

        //the latencies add up
        DifferentialFunction<DoubleReal> latency = pi_left.getLatency().plus(pi_right.getLatency());

        //combine the stages
        List<TBArrivalSymbolic> stages = pi_left.getStages();
        stages.addAll(pi_right.getStages());

        return new PASymbolic(latency, stages, true);
    }


    /**
     * Computes the symbolic term of a leftover operation for arbitrary multiplexing.
     * @param beta
     *                      the term of a rate-latency service curve
     * @param alpha
     *                      the term of a token-bucket arrival curve
     * @param id
     *                      the id-String of the operator node; will be used to name any free parameters arising from the
     *                      leftover operation
     * @return  the left-over service curve: left_term \ominus right_term
     */
    protected PASymbolic computeLeftoverTerm(RLServiceSymbolic beta, TBArrivalSymbolic alpha, String id){
        DifferentialFunction<DoubleReal> R = beta.get_R();
        DifferentialFunction<DoubleReal> L = beta.get_L();
        DifferentialFunction<DoubleReal> r = alpha.get_r();
        DifferentialFunction<DoubleReal> B = alpha.get_B();

        //new R = R-r
        DifferentialFunction<DoubleReal> new_R = R.minus(r);
        //new L = (B+R*L)/(R-r)
        DifferentialFunction<DoubleReal> new_L = B.plus(R.mul(L)).div(R.minus(r));

        return new RLServiceSymbolic(new_R, new_L, this.t, this.zero);
    }


    /**
     * Computes the symbolic term of a leftover operation for arbitrary multiplexing.
     * @param pi
     *                      the term of a pseudoaffine curve
     * @param alpha
     *                      the term of a token-bucket arrival curve
     * @param id
     *                      the id-String of the operator node; will be used to name any free parameters arising from the
     *                      leftover operation
     * @return  the left-over service curve: left_term \ominus right_term
     */
    protected PASymbolic computeLeftoverTerm(PASymbolic pi, TBArrivalSymbolic alpha, String id){
        if(pi instanceof RLServiceSymbolic){
            return computeLeftoverTerm((RLServiceSymbolic) pi, alpha, id);
        }

        DifferentialFunction<DoubleReal> maxStagesTerm = computeMaxStagesTerm(alpha.get_B(), pi.getStages());
        DifferentialFunction<DoubleReal> latency  = pi.getLatency().plus(maxStagesTerm);

        List<TBArrivalSymbolic> stages = new ArrayList<>();
        for(TBArrivalSymbolic stage : pi.getStages()){
            DifferentialFunction<DoubleReal> sigma = stage.get_r().mul(maxStagesTerm).minus(alpha.get_B().minus(stage.get_B()));
            DifferentialFunction<DoubleReal> rho = stage.get_r().minus(alpha.get_r());
            TBArrivalSymbolic newStage = new TBArrivalSymbolic(rho, sigma, t, zero);
            stages.add(newStage);
        }

        return new PASymbolic(latency, stages, true);
    }


    @Override
    public SymbolicTerm computeSymbolicTerm(Flow flow){
        //wipe the stored parameters, bounds, and constraints from the previous node
        wipeSymbolics();
        return computeSymbolicTermFromFlow(flow);
    }


    /**
     * Computes the symbolic term corresponding to a flow. Any created open parameters should use the index of the flow.
     * @param flow
     *                  the node containing the flow
     * @return  the corresponding symbolic term
     */
    protected abstract SymbolicTerm computeSymbolicTermFromFlow(Flow flow);


    @Override
    public SymbolicTerm computeSymbolicTerm(Server server){
        //wipe the stored parameters, bounds, and constraints from the previous node
        wipeSymbolics();
        return computeSymbolicTermFromServer(server);
    }


    /**
     * Computes the symbolic term corresponding to a server. Any created open parameters should use the index of the server.
     * @param server
     *                  the node containing the server
     * @return  the corresponding symbolic term
     */
    protected abstract SymbolicTerm computeSymbolicTermFromServer(Server server);


    /**
     * Creates a new open parameter and adds it to the OpTNode's list of variables.
     * @param name
     *                      the name of the open parameter
     * @param initial_value
     *                      the initial value of the open parameter (should be irrelevant)
     * @return
     */
    protected Variable<DoubleReal> createOpenParameter(String name, double initial_value){
        Variable<DoubleReal> param = DFFactory.var(name, new DoubleReal(initial_value));
        parameters.add(param);
        return param;
    }


    /**
     * Creates a new constant.
     * @param value
     *                  the value of the constant
     * @return  the constant
     */
    protected Constant<DoubleReal> createConstant(double value){
        return DFFactory.val(new DoubleReal(value));
    }


    /**
     * Wipes all stored parameters, bounds, and constraints to prepare for the next node. (When a symbolic term is
     * computed using this plugin, the called function returns the symbolic term and additionally stores the created
     * parameters, bounds, and constraints. These need to be explicitly retrieved by the node. When computing the
     * symbolic term for a new node, the old stored values need to be wiped first)
     */
    protected void wipeSymbolics(){
        this.parameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: bounds
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Creates a new bound and adds it to the OpTNode's list of bounds
     * @param param
     *                      the open parameter to be bounded
     * @param lower_bound
     *                      the lower bound (lower_bound <= param)
     * @param upper_bound
     *                      the upper bound (param <= upper_bound)
     * @return  the created bound
     */
    protected Bound createBound(Variable<DoubleReal> param, Integer lower_bound, Integer upper_bound){
        Bound bound = new Bound(param, lower_bound, upper_bound);
        bounds.add(bound);
        return bound;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: constraints
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Creates a new constraint and adds it to the OpTNode's list of constraints.
     * @param type
     *              the type of the constraint
     * @param term
     *              the constraint term
     * @return  the created constraint
     */
    protected Constraint createConstraint(ConstraintType type, DifferentialFunction<DoubleReal> term){
        Constraint constraint = new Constraint(type, term);
        constraints.add(constraint);
        return constraint;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getter and setter
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public Variable<DoubleReal> getVariable(){
        return this.t;
    }

    @Override
    public ArrayList<Variable<DoubleReal>> getParameters(){
        return this.parameters;
    }

    @Override
    public ArrayList<Bound> getBounds(){
        return this.bounds;
    }

    @Override
    public ArrayList<Constraint> getConstraints(){
        return this.constraints;
    }

}
