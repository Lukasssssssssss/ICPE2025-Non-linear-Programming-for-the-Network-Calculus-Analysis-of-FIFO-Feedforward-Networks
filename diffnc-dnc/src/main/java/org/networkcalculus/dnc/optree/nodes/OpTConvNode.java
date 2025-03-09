package org.networkcalculus.dnc.optree.nodes;


import org.networkcalculus.dnc.network.server_graph.Server;

import java.util.List;

public class OpTConvNode extends OpTOperatorNode{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTConvNode(OpTServerNode leftChild, OpTServerNode rightChild){
        super(leftChild, rightChild);
    }

    /**
     * Creates a convolution subtree rooted at a convolution node (this) from the list of OpTServerNodes.
     * Note: serverNodes cannot be empty!
     * @param serverNodes
     *                      the list of server nodes
     */
    public OpTConvNode(List<OpTServerNode> serverNodes){
        super(serverNodes.subList(1, serverNodes.size()-1).size() > 1 ?
                new OpTServerNode(serverNodes.subList(1, serverNodes.size()-1), null) :
                serverNodes.subList(1, serverNodes.size()-1).get(0),
                serverNodes.get(0));
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setLeftChild(OpTServerNode child){
        super.setLeftChild(child);
    }

    public void setRightChild(OpTServerNode child){
        super.setRightChild(child);
    }

    @Override
    public String getOperator() {
        return "Leftover";
    }
}
