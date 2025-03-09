package org.networkcalculus.dnc.optree.symbolic;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.Constant;
import nilgiri.math.autodiff.DifferentialFunction;
import nilgiri.math.autodiff.Variable;
import nilgiri.math.autodiff.Zero;

import java.util.ArrayList;

/**
 * Represents a token-bucket arrival curve in symbolic notation in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 *
 * @author Lukas Herll
 */
public class TBArrivalSymbolic extends PASymbolic{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private DifferentialFunction<DoubleReal> r;
    private DifferentialFunction<DoubleReal> B;
    private Variable<DoubleReal> t;
    private Zero zero;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public TBArrivalSymbolic(DifferentialFunction<DoubleReal> r,
                             DifferentialFunction<DoubleReal> B,
                             Variable<DoubleReal> t,
                             Zero zero){
        //initialise the superclass PASymbolic. The latency is zero and at this point there are no stages. The subsequently
        //computed term will be null, since no stages are currently present
        super(zero, new ArrayList<>(), false);
        this.r = r;
        this.B = B;
        this.t = t;
        this.zero = zero;
        //compute the term according to the TB formula
        computeTerm();
        //add this TBArrivalSymbolic to the (currently empty) list of stages
        this.stages.add(this);
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
     * computes the token-bucket arrival curve from the given curve parameters (alpha = B+rt)
     */
    @Override
    protected void computeTerm(){
        this.term = B.plus(r.mul(t));
    }

    /**
     * sets the r parameter of the token-bucket arrival curve: B+r*t
     * @param new_r
     *                          the r parameter
     */
    public void set_r(DifferentialFunction<DoubleReal> new_r){
        this.r = new_r;
        computeTerm();
    }


    /**
     * getter for the r parameter of the token-bucket arrival curve: B+r*t
     * @return  the r parameter
     */
    public DifferentialFunction<DoubleReal> get_r(){
        return this.r;
    }


    /**
     * sets the B parameter of the token-bucket arrival curve: B+r*t
     * @param new_B
     *                          the B parameter
     */
    public void set_B(DifferentialFunction<DoubleReal> new_B){
        this.B = new_B;
        computeTerm();
    }


    /**
     * getter for the B parameter of the token-bucket arrival curve: B+r*t
     * @return  the B parameter
     */
    public DifferentialFunction<DoubleReal> get_B(){
        return this.B;
    }


    @Override
    public String toString(){
        return String.format("alpha_{%s, %s}(%s)", r, B, t);
    }
}
