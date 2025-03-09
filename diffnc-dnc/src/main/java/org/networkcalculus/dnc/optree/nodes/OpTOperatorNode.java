package org.networkcalculus.dnc.optree.nodes;


import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.tandem.fifo.TNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lukas Herll
 *
 * Represents an operator node of an operator tree.
 *
 * Recommended uses:
 * 1. via the OpTreeAnalysis class
 * 2. via the recommended constructor of a OpTRootNode
 * 3. Build the operator tree manually by using a manual constructor of a child-class (e.g. OpTHNode)
 */
public abstract class OpTOperatorNode implements AbsOpTNode {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected int id;
    protected OpTSymbolicNode parent;   //OpTRootNode or OpTServerNode
    protected OpTContentNode leftChild;
    protected OpTContentNode rightChild;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTOperatorNode(OpTContentNode leftChild, OpTContentNode rightChild){
        this.parent = null; //parent is set automatically, once this node is declared another node's child
        setLeftChild(leftChild);
        setRightChild(rightChild);
    }

    public OpTOperatorNode(){
        this.parent = null; //parent is set automatically, once this node is declared another node's child
    }

    /**
     * Creates an operator node. Transforms the right child and left children into appropriate operator nodes. Since the
     * left children are given as a list, they are recursively transformed into the corresponding operator subtree.
     * @param leftChildren
     *                      a non-empty list of left children
     * @param rightChild
     *                      the operator node's right child
     */
    public OpTOperatorNode(ArrayList<TNode> leftChildren, TNode rightChild){

        //resulting structure: parent -> operator (this) -> subtree(leftChildren), rightChild
        assert(rightChild != null && leftChildren != null);
        assert(leftChildren.size() > 0);

        //transform the right child into an operator tree content node
        OpTContentNode optRightChild;
        if(rightChild.getInf() instanceof Flow){
            optRightChild = new OpTFlowNode((Flow) rightChild.getInf(), null);
        }
        else{
            optRightChild = new OpTServerNode(new ArrayList<Server>((List<Server>) rightChild.getInf()), null);
        }
        //set the right child
        setRightChild(optRightChild);

        //transform the list of left children into a list of server nodes
        ArrayList<OpTServerNode> optLeftChildren = createOpTServerNodes(leftChildren);
        //create the operator node's left child from the list of left children
        //if the given list of left children is non-empty, create a convolution subtree from them and store this subtree
        //as a possible left child
        OpTServerNode possibleLeftChild = null;
        if(optLeftChildren.size() > 0){
            possibleLeftChild = new OpTServerNode(optLeftChildren, null);
        }

        //if the right child is a flow and covers more servers than are included in the possible left child,
        //then these additional servers need to be explicitly included in another convolution subtree
        if(optRightChild instanceof OpTFlowNode){
            //create a list of all servers on the flow's path
            ArrayList<Server> missingServers = new ArrayList<Server>(((OpTFlowNode) optRightChild).getFlow().getPath().getServers());
            //remove all servers that are already included in the possible left child
            if(possibleLeftChild != null){ missingServers.removeAll(possibleLeftChild.getServers()); }
            //if no servers remain, the possible left child is complete => add it as the left child
            if(missingServers.size() == 0){
                setLeftChild(possibleLeftChild);
            }
            //otherwise, more servers need to be added to the left child
            else{
                //create another convolution subtree from the missing servers
                OpTServerNode secondLeftChild = new OpTServerNode(missingServers);
                //to obtain the left child, merge the two convolution subtrees
                ArrayList<OpTServerNode> subtrees = new ArrayList<>();
                subtrees.add(possibleLeftChild);
                subtrees.add(secondLeftChild);
                setLeftChild(new OpTServerNode(subtrees, null));
            }
        }
        //if the right child is not a flow, but a server, add the convolution subtree obtained from the given left children
        //as the operator node's left child
        else{
            setLeftChild(possibleLeftChild);
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * takes a list of TNodes and transforms it into a list of OpTNodes. Generates all relevant subtrees.
     * @param nodes
     *              a non-empty ArrayList of TNodes
     * @return the corresponding list of OpTNodes
     */
    protected ArrayList<OpTServerNode> createOpTServerNodes(ArrayList<TNode> nodes){
        assert(nodes.size() > 0);
        //transform each TNode from nodes into an OpTServerNode (transform flow nodes into subtrees)
        ArrayList<OpTServerNode> optNodes = new ArrayList<>();
        for(TNode node : nodes){
            //if the node is a flow node, create a tree (server node -> operator node -> servers, flow)
            //where the content of the first server node depends on the content of the server node two nodes down the line
            //and the operator is the leftover operator
            if(node.getInf() instanceof Flow){
                //create the first (empty) server node
                OpTServerNode flowSubtreeRoot = new OpTServerNode(new ArrayList<Server>(), null);

                //create the operator node (leftover operator) and add it as a child to the first server node
                //first, create the operator node's left child by convolving all children of the flow node
                List<OpTServerNode> flowChildren = createOpTServerNodes(new ArrayList<TNode>(node.getChildren()));
                OpTServerNode serverNode = flowChildren.size() > 1 ?
                        new OpTServerNode(flowChildren, null) :
                        flowChildren.get(0);

                OpTOperatorNode opNode = new OpTLeftoverNode(serverNode, new OpTFlowNode((Flow) node.getInf()));
                flowSubtreeRoot.setChild(opNode);
                //set the content of the first server node according to the content of the server node two nodes down the line
                flowSubtreeRoot.addServers(((OpTServerNode) opNode.getLeftChild()).getServers());
                //add the first server node to the OpTNode list
                optNodes.add(flowSubtreeRoot);
            }
            //if the node is a server node, turn it into a  OpTServerNode and add it to the OpTNode list
            else{
                ArrayList<Server> servers;
                //store the node's servers in an ArrayList (the node could contain a single server, but we need a list)
                if(node.getInf() instanceof Server){
                    optNodes.add(new OpTServerNode((Server) node.getInf()));
                }
                else{
                    optNodes.add(new OpTServerNode((List<Server>) node.getInf()));
                }
            }
        }
        return optNodes;
    }


    public OpTSymbolicNode getParent(){
        return this.parent;
    }


    /**
     * Note: expects the parent to already know the child
     */
    public void setParent(OpTSymbolicNode parent){
        this.parent = parent;
        assert parent.getChild() == this;
    }


    public OpTContentNode getLeftChild(){
        return this.leftChild;
    }


    protected void setLeftChild(OpTContentNode child){
        this.leftChild = child;
        this.leftChild.setParent(this);

        if(this.parent != null){
            this.parent.notifyUpstreamNodesOfSymbolicsChange();
        }
    }


    public OpTContentNode getRightChild(){
        return this.rightChild;
    }


    protected void setRightChild(OpTContentNode child){
        this.rightChild = child;
        this.rightChild.setParent(this);

        if(this.parent != null){
            this.parent.recomputeIDs();
            this.parent.notifyUpstreamNodesOfSymbolicsChange();
        }
    }


    @Override
    public void setId(int id){
        if(this.parent != null){
            if(id != this.id){
                this.id = id;
                //IDs can determine parameter names. After changing the IDs, the symbolics might not correspond to the tree's
                //nodes anymore
                this.parent.notifyUpstreamNodesOfSymbolicsChange();
            }
        }
        else{
            this.id = id;
        }
    }


    @Override
    public int getId(){
        return this.id;
    }


    @Override
    public int setAllIDs(int rootId){
        this.setId(rootId);

        int maxID = rootId;

        //if both children exist, set both their ids
        //(the id of the right child is larger than all ids in the left child's subtree)
        if(this.leftChild != null){
            maxID = this.leftChild.setAllIDs(maxID+1);
        }
        if(this.rightChild != null){
            maxID =  this.rightChild.setAllIDs(maxID+1);
        }

        return maxID;
    }


    /**
     * Recomputes all IDs in the tree.
     */
    public void recomputeIDs(){
        if(this.parent != null){
            this.parent.recomputeIDs();
        }
        else{
            this.setAllIDs(0);
        }
    }

    @Override
    public String toString(){
        return this.id + ": Operator " + this.getOperator();
    }


    public abstract String getOperator();


    @Override
    public void printOpTree(){
        if(this.leftChild != null){
            System.out.println(String.format("%s -> left child: %s", this, leftChild));
            this.leftChild.printOpTree();
        }
        if(this.rightChild != null){
            System.out.println(String.format("%s -> right child: %s", this, rightChild));
            this.rightChild.printOpTree();
        }
    }

}
