package org.networkcalculus.dnc.optree.nodes;


import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;

public abstract class OpTContentNode extends OpTSymbolicNode {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected OpTOperatorNode parent;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTContentNode(){
        //initialise symbolics and the id
        super();
        this.parent = null;
    }

    public OpTContentNode(OpTOperatorNode child){
        super(child);
        this.parent = null;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: symbolics
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Recursively computes the symbolic term of the OpTNode and stores it in the node.
     * Note: overwritten to account for leaf nodes.
     * @param plugin
     *                  a Plugin specifying the concrete operations of the given problem (use a predefined one or
     *                  define a new one)
     * @return  the symbolic term
     */
    @Override
    protected SymbolicTerm deriveSymbolicTerm(BinOperatorPlugin plugin){
        //if there is no child, this node is a leaf node
        if(this.getChild() == null){
            this.symbolicTerm = deriveSymbolicTermFromLeaf(plugin);
            return this.symbolicTerm;
        }
        else return super.deriveSymbolicTerm(plugin);
    }


    protected abstract SymbolicTerm deriveSymbolicTermFromLeaf(BinOperatorPlugin plugin);


    @Override
    public void recomputeIDs(){
        if(this.parent == null){
            setAllIDs(0);
        }
        else{
            this.parent.recomputeIDs();
        }
    }


    @Override
    protected void notifyUpstreamNodesOfSymbolicsChange(){
        //if this node is already marked for symbolics re-computation, then there is nothing more to do
        if(this.madeChangesSinceLastSymbolicsComputation == false){
            this.madeChangesSinceLastSymbolicsComputation = true;

            //propagate the changes up the tree
            if(getParent() != null && getParent().getParent() != null){
                this.getParent().getParent().notifyUpstreamNodesOfSymbolicsChange();
            }
        }
    }


    @Override
    public void partialRecompute(){
        if(this.parent == null){
            this.deriveSymbolics(this.plusTimesPlugin);
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getters, setters, IDs
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTOperatorNode getChild(){
        return this.child;
    }

    public void setChild(OpTOperatorNode child){
        this.child = child;
        this.child.setParent(this);
    }

    public OpTOperatorNode getParent(){
        return this.parent;
    }


    /**
     * Note: expects the parent to already know the child
     */
    public void setParent(OpTOperatorNode parent){
        this.parent = parent;
        assert parent.getRightChild() == this || parent.getLeftChild() == this;
    }


    @Override
    public String toString(){
        return String.format("%d: %s", this.id, getContentString());
    }


    /**
     * @return  a String containing the type of the node and its value, e.g. Flow = ...
     */
    protected abstract String getContentString();

}
