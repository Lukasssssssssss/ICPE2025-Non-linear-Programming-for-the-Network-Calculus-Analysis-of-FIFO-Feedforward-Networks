package org.networkcalculus.dnc.optree.symbolic;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.DifferentialFunction;

/**
 * Represents the symbolic term in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 *
 * @author Lukas Herll
 */
public interface SymbolicTerm {

    DifferentialFunction<DoubleReal> getTerm();
}
