package org.networkcalculus.dnc.optree.constraints;

/**
 * Represents the possible types of constraints in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 *
 * EQ corresponds to constraints whose term must be equal to zero (e.g. x+y=0)
 * INEQ corresponds to constraints whose term must be greater than zero (e.g. x+y>0)
 *
 * @author Lukas Herll
 */
public enum ConstraintType {
    EQ,
    INEQ;
}
