package org.networkcalculus.dnc.optree.nodes;

import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;

/**
 * @author Lukas Herll
 *
 * Represents a root node of a binary operator tree (e.g. a delay node or a backlog bound).
 *
 * Recommended uses:
 * 1. via the OpTreeAnalysis class
 * 2. Initialise the operator tree by calling the constructor of a sub-class (e.g. OpTDelayNode) with a
 * nesting tree root.
 * 3. Build the operator tree manually with the remaining constructors of a sub-class.
 */
public abstract class OpTRootNode extends OpTSymbolicNode {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTRootNode(){
        //initialise symbolics and the id
        super();
    }


    public OpTRootNode(OpTOperatorNode child){
        //initialise symbolics and the id
        super(child);
        setAllIDs(0);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: symbolics
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void recomputeIDs(){
        setAllIDs(0);
    }

    @Override
    public void partialRecompute(){
        //a partial recompute is only possible after a 'normal' computation
        assert plusTimesPlugin != null;
        this.deriveSymbolics(this.plusTimesPlugin);
    }


    @Override
    protected void notifyUpstreamNodesOfSymbolicsChange(){
        this.madeChangesSinceLastSymbolicsComputation = true;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getters, setters, IDs
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString(){
        return String.format("%d: Root: %s", this.id, getContentString());
    }


    /**
     * @return  a String containing the type of the node and its value, e.g. delay = 2.0
     */
    protected abstract String getContentString();

}
