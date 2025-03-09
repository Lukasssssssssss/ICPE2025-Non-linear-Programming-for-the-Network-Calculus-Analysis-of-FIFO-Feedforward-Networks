package org.networkcalculus.dnc.optree.plugins;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.DifferentialFunction;
import nilgiri.math.autodiff.Variable;
import org.networkcalculus.dnc.optree.constraints.ConstraintType;
import org.networkcalculus.dnc.optree.symbolic.PASymbolic;
import org.networkcalculus.dnc.optree.symbolic.RLServiceSymbolic;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.optree.symbolic.TBArrivalSymbolic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lukas Herll
 * 
 * An abstract class for a BinOperatorPlugin representing DNC operations for FIFO multiplexing
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
 */
public abstract class AbstractFIFOMulPlugin extends AbstractArbMulPlugin{

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public AbstractFIFOMulPlugin(){
        super();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Computes the symbolic term of a leftover operation for arbitrary multiplexing.
     * @param beta
     *                      the term of a rate-latency service curve
     * @param gamma
     *                      the term of a token-bucket arrival curve
     * @param id
     *                      the id-String of the cross-flow; will be used to name any free parameters arising from the
     *                      leftover operation
     * @return  the left-over service curve: left_term \ominus right_term (a one-stage pseudoaffine curve)
     */
    @Override
    protected PASymbolic computeLeftoverTerm(RLServiceSymbolic beta, TBArrivalSymbolic gamma, String id){
        DifferentialFunction<DoubleReal> R = beta.get_R();
        DifferentialFunction<DoubleReal> T = beta.get_L();
        DifferentialFunction<DoubleReal> r = gamma.get_r();
        DifferentialFunction<DoubleReal> b = gamma.get_B();

        //create a free FIFO parameter
        Variable<DoubleReal> s = createOpenParameter("s_" + id, 0);
        //add a lower bound to the free s parameter
        createBound(s, 0, null);

        //new latency s+T+b/R
        DifferentialFunction<DoubleReal> latency = s.plus(T.plus(b.div(R)));
        //new R = R-r
        DifferentialFunction<DoubleReal> new_R = R.minus(r);
        //new L = Rs
        DifferentialFunction<DoubleReal> new_L = R.mul(s);

        //create the stage of the resulting PA curve
        TBArrivalSymbolic stage = new TBArrivalSymbolic(new_R, new_L, t, zero);
        List<TBArrivalSymbolic> stages = new ArrayList<>();
        stages.add(stage);

        return new PASymbolic(latency, stages, true);
    }


    /**
     * Computes the symbolic term of a leftover operation for arbitrary multiplexing.
     * @param pi
     *                      the term of a pseudoaffine curve
     * @param alpha
     *                      the term of a token-bucket arrival curve
     * @param id
     *                      the id-String of the cross-flow; will be used to name any free parameters arising from the
     *                      leftover operation
     * @return  the left-over service curve: left_term \ominus right_term
     */
    @Override
    protected PASymbolic computeLeftoverTerm(PASymbolic pi, TBArrivalSymbolic alpha, String id){
        //function calls computeLeftoverTerm(RLServiceSymbolic,...) from AbstractArbMulPlugin also end here, so we have
        //to redirect them for better performance
        if(pi instanceof RLServiceSymbolic){
            return computeLeftoverTerm((RLServiceSymbolic) pi, alpha, id);
        }
        //define the free s parameter and add it to the maxStagesTerm
        Variable<DoubleReal> s = createOpenParameter("s_" + id, 0);
        //add a lower bound to the free s parameter
        createBound(s, 0, null);

        DifferentialFunction<DoubleReal> maxStagesTerm = computeMaxStagesTerm(alpha.get_B(), pi.getStages()).plus(s);
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

}
