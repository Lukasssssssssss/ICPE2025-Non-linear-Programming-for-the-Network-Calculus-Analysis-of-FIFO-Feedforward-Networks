package org.networkcalculus.dnc.optree.constraints;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.DifferentialFunction;

/**
 * Represents a constraint in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 * Constraints can be of two types:
 * EQ if term = 0
 * INEQ if term > 0
 *
 * Constraints should be set automatically by the used plugin.
 *
 * @author Lukas Herll
 */
public class Constraint {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ConstraintType type;
    private DifferentialFunction<DoubleReal> term;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Constraint(ConstraintType type, DifferentialFunction<DoubleReal> term){
        this.type = type;
        this.term = term;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getters, setters, toString
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * @return  the type of the constraint (EQ: constraint term must be equal to zero, INEQ: greater than zero)
     */
    public ConstraintType getType(){
        return this.type;
    }


    /**
     *
     * @return  the constraint term
     */
    public DifferentialFunction<DoubleReal> getTerm(){
        return this.term;
    }


    /**
     * Displays the terms in a readable form.
     * @return
     */
    @Override
    public String toString(){
        return this.type.toString() + ": " + this.term.toString();
    }

}
