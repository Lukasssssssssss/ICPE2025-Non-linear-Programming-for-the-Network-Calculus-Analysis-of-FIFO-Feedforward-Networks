package org.networkcalculus.dnc.optree.plugins;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.Variable;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.optree.nodes.OpTSymbolicNode;
import org.networkcalculus.dnc.optree.nodes.OpTNode;
import org.networkcalculus.dnc.optree.nodes.OpTOperatorNode;
import org.networkcalculus.dnc.optree.nodes.TreeOperator;
import org.networkcalculus.dnc.optree.bounds.Bound;
import org.networkcalculus.dnc.optree.constraints.Constraint;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;

import java.util.ArrayList;

/**
 * @author Lukas Herll
 *
 * An interface for plugins that can be used to compute symbolic terms in an OpTreeAnalysis
 * (a DNC analysis using a binary operator tree).
 *
 * Define a specific plugin for a given problem (e.g. one for FIFO LUDB operations) and use it in conjunction with
 * the OpTNode class
 *
 * TODO find a more elegant solution for the id's in computeSymbolicTerm (usually, I use the operator node's id, but for
 *  DiffLUDB leftover operations this needs to be the crossflow node's id)
 */

public interface BinOperatorPlugin {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: computing the symbolic term
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * TODO delete eventually
     * Computes a symbolic term from an operator and two other symbolic terms, e.g. convolve(left_term, right_term).
     * When an open parameter is created in an operator node rather than a leaf node (e.g. the theta's of LUDB FIFO),
     * the operator node's id is used to name the parameter (e.g. operator node 5 creates theta_5).
     * @param operator
     *                      the operator that is applied to both symbolic terms
     * @param id
     *                      an id-String that should be used to name any arising parameters (usually the operator node's id,
     *                      in case of a DiffLUDB leftover operation, this has to be the ALIAS of the CROSSFLOW!)
     * @param left_term
     *                      a symbolic term (rate-latency service curve or token-bucket arrival curve)
     * @param right_term
     *                      a rate-latency service curve or a token-bucket arrival curve dependent on the operator
     * @return  the symbolic term following from operator(left_term, right_term) with all relevant parameters
     */
    SymbolicTerm computeSymbolicTerm(TreeOperator operator, String id, SymbolicTerm left_term, SymbolicTerm right_term);


    /**
     * Computes a symbolic term from an operator and two other symbolic terms, e.g. convolve(left_term, right_term).
     * When an open parameter is created in an operator node rather than a leaf node (e.g. the theta's of LUDB FIFO),
     * the operator node's id is used to name the parameter (e.g. operator node 5 creates theta_5).
     * @param opNode
     *                      the operator node of the corresponding operator
     * @param left_term
     *                      the symbolic term of the opNode's left child
     * @param right_term
     *                      the symbolic term of the opNode's right child
     * @return  the symbolic term following from operator(left_term, right_term) with all relevant parameters
     */
    SymbolicTerm computeSymbolicTerm(OpTOperatorNode opNode, SymbolicTerm left_term, SymbolicTerm right_term);


    /**
     * Computes the symbolic term corresponding to a flow. Any created open parameters should use the index of the flow.
     * @param flow
     *                  the node containing the flow
     * @return  the corresponding symbolic term
     */
    SymbolicTerm computeSymbolicTerm(Flow flow);


    /**
     * Computes the symbolic term corresponding to a server. Any created open parameters should use the index of the server.
     * @param server
     *                  the node containing the server
     * @return  the corresponding symbolic term
     */
    SymbolicTerm computeSymbolicTerm(Server server);


    /**
     * Retrieves the function variable t.
     * @return  the variable t
     */
    Variable<DoubleReal> getVariable();


    /**
     *
     * @return  all parameters used in the most recently computed symbolic term.
     */
    ArrayList<Variable<DoubleReal>> getParameters();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: computing the bounds
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * @return  all bounds used in the most recently computed symbolic term.
     */
    ArrayList<Bound> getBounds();


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: computing the constraints
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     * @return  all constraints used in the most recently computed symbolic term.
     */
    ArrayList<Constraint> getConstraints();


    /**
     * Derives constraints on the operator tree root. (e.g. constraints involving parameters from different nodes)
     * @param root
     *              the root of the operator tree
     * @return
     *              a list of derived constraints
     */
    ArrayList<Constraint> deriveConstraints(OpTNode root);


    /**
     * Derives constraints on the operator sub-tree root. (e.g. constraints involving parameters from different nodes)
     * @param root
     *              the root of the operator sub-tree
     * @return
     *              a list of derived constraints
     */
    ArrayList<Constraint> deriveConstraints(OpTSymbolicNode root);

}
