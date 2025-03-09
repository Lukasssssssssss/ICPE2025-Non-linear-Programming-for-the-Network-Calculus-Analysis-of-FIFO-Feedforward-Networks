package org.networkcalculus.dnc.optree.nodes;

import org.networkcalculus.dnc.tandem.fifo.TNode;

/**
 * @author Lukas Herll
 *
 * Represents a delay node of an operator tree. A delay node is always a root node.
 *
 * Recommended uses:
 * 1. via the OpTreeAnalysis class
 * 2. via the third constructor with an existing nesting tree
 * 3. Build the operator tree manually with one of the first two constructors.
 */
public class OpTDelayNode extends OpTRootNode{

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private double delay;


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTDelayNode(){
        //initialise symbolics and the id (to -1)
        super();
        this.delay = -1;

        this.child = null;
    }


    public OpTDelayNode(OpTHNode child){
        //initialise symbolics and the id (recursively from 0)
        super(child);
        this.delay = -1;
    }


    public OpTDelayNode(TNode nestingTreeNode){
        //initialise symbolics and the id (recursively from 0)
        super(new OpTHNode(nestingTreeNode));
        this.delay = -1;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setChild(OpTHNode opNode){

    }


    /**
     * Computes the delay based on the current values of the open parameters.
     * @return  the computed delay
     */
    public double computeDelayFromCurrentParamValues(){
        this.delay = this.symbolicTerm.getTerm().getValue().doubleValue();
        return delay;
    }


    /**
     * @return the delay
     */
    public double getDelay(){
        return this.delay;
    }


    @Override
    protected String getContentString() {
        return "delay = " + this.delay;
    }



}
