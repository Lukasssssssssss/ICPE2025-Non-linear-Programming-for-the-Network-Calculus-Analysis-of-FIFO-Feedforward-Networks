package org.networkcalculus.dnc.optree.nodes;

import org.networkcalculus.dnc.tandem.fifo.TNode;

public class OpTHNode extends OpTOperatorNode{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTHNode(TNode nestingTreeRoot){
        super(nestingTreeRoot.getChildren(), nestingTreeRoot);
    }

    public OpTHNode(OpTServerNode leftChild, OpTFlowNode rightChild){
        super(leftChild, rightChild);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setLeftChild(OpTServerNode child){
        super.setLeftChild(child);
    }

    public void setRightChild(OpTFlowNode child){
        super.setRightChild(child);
    }

    @Override
    public String getOperator() {
        return "H";
    }
}
