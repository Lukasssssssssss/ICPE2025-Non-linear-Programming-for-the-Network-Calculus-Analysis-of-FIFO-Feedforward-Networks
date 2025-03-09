package org.networkcalculus.dnc.optree.symbolic;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.DifferentialFunction;

import java.util.List;

/**
 * @author Lukas Herll
 *
 * Represents a symbolic pseudoaffine curve using the notation from JAutoDiff.
 */
public class PASymbolic implements  SymbolicTerm{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected DifferentialFunction<DoubleReal> latency;
    protected List<TBArrivalSymbolic> stages;
    protected DifferentialFunction<DoubleReal> term;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public PASymbolic(DifferentialFunction<DoubleReal> latency, List<TBArrivalSymbolic> stages, boolean computeTerm){
        assert stages != null;
        this.latency = latency;
        this.stages = stages;
        this.term = null;
        if(computeTerm){
            computeTerm();
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Computes the term (excluding the latency) pi' = min_{1<=x<=n}(gamma_{sigma_x, rho_x})
     */
    protected void computeTerm(){
        //only compute the term if there are valid stages
        if(stages.size() == 0){
            return;
        }
        for(TBArrivalSymbolic gamma : stages){
            if(term == null){
                term = gamma.getTerm();
            }
            else{
                term = term.minimum(gamma.getTerm());
            }
        }
    }


    /**
     * @return  the latency of the PA curve
     */
    public DifferentialFunction<DoubleReal> getLatency(){
        return latency;
    }


    /**
     * @return  all stages of the PA curve as a list of TBArrivalSymbolic
     */
    public List<TBArrivalSymbolic> getStages(){
        return stages;
    }


    @Override
    public DifferentialFunction<DoubleReal> getTerm() {
        return term;
    }
}
