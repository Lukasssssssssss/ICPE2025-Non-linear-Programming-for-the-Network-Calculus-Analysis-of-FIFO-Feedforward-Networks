package org.networkcalculus.dnc.optree.bounds;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.Variable;

/**
 * Represents a bound of an open parameter in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 * Bounds should be set automatically by the used plugin.
 *
 * @author Lukas Herll
 */
public class Bound {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private Variable<DoubleReal> variable;
    //Integer instead of int to allow instantiation to null (null corresponds to unbounded)
    private Integer lower_bound, upper_bound;


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Bound(Variable<DoubleReal> variable, Integer lower_bound, Integer upper_bound){
        this.variable = variable;
        this.lower_bound = lower_bound;
        this.upper_bound = upper_bound;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getters, setters, toString
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * @return  the bounded variable
     */
    public Variable<DoubleReal> getVariable(){
        return this.variable;
    }


    /**
     *
     * @return  the lower bound (null if unbounded)
     */
    public Integer getLowerBound(){
        return this.lower_bound;
    }


    /**
     *
     * @return  the upper bound (null if unbounded)
     */
    public Integer getUpperBound(){
        return this.upper_bound;
    }


    /**
     * Adheres to the required input format of the NLP wrapper.
     * @return
     */
    @Override
    public String toString(){
        String l_bound = lower_bound != null ? lower_bound.toString() : "None";
        String u_bound = upper_bound != null ? upper_bound.toString() : "None";
        return String.format("%s: (%s,%s)", variable.getName(), l_bound, u_bound);
    }

}
