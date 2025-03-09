package org.networkcalculus.dnc.optree.symbolic;


import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.DifferentialFunction;
import nilgiri.math.autodiff.Variable;
import nilgiri.math.autodiff.Zero;

import java.util.ArrayList;

/**
 * Represents a rate-latency service curve in symbolic notation in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 *
 * @author Lukas Herll
 */
public class RLServiceSymbolic extends PASymbolic{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //the term and important sub-terms (beta(t) = R[t-L]^+)
    private DifferentialFunction<DoubleReal> term;
    private DifferentialFunction<DoubleReal> R;
    private DifferentialFunction<DoubleReal> L;
    private Zero zero;
    private Variable<DoubleReal> t;



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public RLServiceSymbolic(DifferentialFunction<DoubleReal> R,
                             DifferentialFunction<DoubleReal> L,
                             Variable<DoubleReal> t,
                             Zero zero){
        super(L, new ArrayList<>(), false);
        this.R = R;
        this.L = L;
        this.zero = zero;
        this.t = t;
        this.stages.add(new TBArrivalSymbolic(R, zero, t, zero));
        computeTerm();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * getter for the term
     * @return  the symbolic term
     */
    public DifferentialFunction<DoubleReal> getTerm(){
        return this.term;
    }


    /**
     * computes the token-bucket arrival curve from the given curve parameters (gamma = B+rt)
     */
    @Override
    protected void computeTerm(){
        this.term = R.mul(t.minus(L).minz(zero));
    }


    /**
     * sets the R parameter of the rate-latency service curve: R[t-L]^+
     * @param new_R
     *                          the R parameter
     */
    public void set_R(DifferentialFunction<DoubleReal> new_R){
        this.R = new_R;
        computeTerm();
    }


    /**
     * getter for the R parameter of the rate-latency service curve: R[t-L]^+
     * @return  the R parameter
     */
    public DifferentialFunction<DoubleReal> get_R(){
        return this.R;
    }


    /**
     * sets the L parameter of the rate-latency service curve: R[t-L]^+
     * @param new_L
     *                          the L parameter
     */
    public void set_L(DifferentialFunction<DoubleReal> new_L){
        this.L = new_L;
        computeTerm();
    }


    /**
     * getter for the L parameter of the rate-latency service curve: R[t-L]^+
     * @return  the L parameter
     */
    public DifferentialFunction<DoubleReal> get_L(){
        return this.L;
    }


    @Override
    public String toString(){
        return String.format("beta_{%s, %s}(%s)", R, L, t);
    }
}
