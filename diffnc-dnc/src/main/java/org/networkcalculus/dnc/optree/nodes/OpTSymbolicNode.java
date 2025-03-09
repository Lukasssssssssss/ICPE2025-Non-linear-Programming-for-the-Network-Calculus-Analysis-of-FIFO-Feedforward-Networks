package org.networkcalculus.dnc.optree.nodes;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.Variable;
import org.networkcalculus.dnc.optree.bounds.Bound;
import org.networkcalculus.dnc.optree.constraints.Constraint;
import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lukas Herll
 *
 * Represents the root, flow, and server nodes of a binary operator tree in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 *
 * Recommended use: via the OpTreeAnalysis class
 * Alternatively:
 *  construct using an existing nesting tree: new OpTNode(nestingTree)
 *  compute the symbolic term, bounds etc: deriveSymbolics(plugin)
 *
 * A binary operator tree can also be assembled manually by explicitly creating the needed OpTNodes and manually adding
 * parent/child relationships. But take care not to violate the structure of the binary operator tree (e.g. the delay node
 * is the root node and has only a right child which is a H operator node etc)
 *
 * TODO fix the IDs: if a child is added, note that the IDs need to be changed. When do you change the IDs? Everytime a child
 *  is added?
 */

public abstract class OpTSymbolicNode implements AbsOpTNode{
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //assign each node an id for better identification (in particular, this makes printing the tree to console less ambiguous)
    //the id of each node is parent.id + 1 for a left child, + 2 for a right child
    protected int id;

    protected OpTOperatorNode child;

    //the last plugin used to compute the symbolic plus-times-algebraic terms (the same plugin is used for partial recomputes)
    BinOperatorPlugin plusTimesPlugin;
    //contains the symbolic term
    protected SymbolicTerm symbolicTerm;

    //time variable, parameters and bounds of the entire subtree rooted at this node
    protected Variable<DoubleReal> t;
    protected ArrayList<Variable<DoubleReal>> parameters;
    //local parameters are the parameters, which were derived from this node (e.g. the rate R of a service curve at the
    //node corresponding to the service curve)
    protected ArrayList<Variable<DoubleReal>> localParameters;
    protected ArrayList<Bound> bounds;
    protected ArrayList<Constraint> constraints;

    //for partial re-computations: remember whether changes have been made to this node since the last computation
    protected boolean madeChangesSinceLastSymbolicsComputation;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public OpTSymbolicNode(){
        this.id = -1;

        this.symbolicTerm = null;
        this.t = null;
        this.parameters = new ArrayList<>();
        this.localParameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();

        this.madeChangesSinceLastSymbolicsComputation = false;

        this.child = null;
    }

    public OpTSymbolicNode(OpTOperatorNode child){
        this();

        setChildFromConstructor(child);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods for recursively creating the operator tree + IDs
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Assigns an ID to each node of the operator tree rooted at this node, starting with the given start value.
     * Uses a DFS strategy to assign IDs
     * @param root_id
     *                  the ID of the root node of the given subtree (this node)
     * @return  the largest ID of the subtree rooted at this node
     */
    @Override
    public int setAllIDs(int root_id){
        this.setId(root_id);

        if(this.child == null){
            return this.child.setAllIDs(root_id+1);
        }
        else return root_id;
    }


    /**
     *
     * @return the node's id
     */
    @Override
    public int getId(){
        return this.id;
    }


    /**
     * sets the child nodes ID (parent + 1 for left child, + 2 for right child)
     * @param id
     *          the new ID of this node
     */
    @Override
    public void setId(int id){
        if(id != this.id){
            this.id = id;
            //IDs can determine parameter names. After changing the IDs, the symbolics might not correspond to the tree's
            //nodes anymore
            notifyUpstreamNodesOfSymbolicsChange();
        }
    }


    /**
     * Recomputes all IDs in the tree. Sets the <code>madeChangesSinceLastSymbolicsComputation</code> attribute to true for
     * all nodes, whose ID was changed (Parameter names could depend on the node's ID)
     */
    public abstract void recomputeIDs();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: symbolic term, parameters, bounds, constraints
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Derives the function variable, the open parameters, their bounds, the constraints, and computes the symbolic term
     * using the provided plugin. This is the recommended function for general use.
     * Note: the Symbolics are only derived, when they have not been derived before, when changes have been made to the
     * subtree rooted in this node in the meantime, or when a different plugin is used
     * @param plugin
     *                  a Plugin specifying the concrete operations of the given problem (use a predefined one or
     *                  define a new one)
     */
    public void deriveSymbolics(BinOperatorPlugin plugin){
        //in case the IDs have not been properly set (e.g. if the tree was build manually), recompute them
        if(!(this.id >= 0)){
            recomputeIDs();
        }

        if(madeChangesSinceLastSymbolicsComputation || plugin != this.plusTimesPlugin){
            this.plusTimesPlugin = plugin;

            //derive the symbolics of the child nodes
            this.getChild().getLeftChild().deriveSymbolics(plugin);
            this.getChild().getRightChild().deriveSymbolics(plugin);

            deriveSymbolicTerm(plugin);
            collectParameters();
            assert deriveConstraints(plugin);
            collectConstraints();

            this.madeChangesSinceLastSymbolicsComputation = false;
        }
    }


    /**
     * Recursively computes the symbolic term of the OpTNode and stores it in the node.
     * @param plugin
     *                  a Plugin specifying the concrete operations of the given problem (use a predefined one or
     *                  define a new one)
     * @return  the symbolic term
     */
    protected SymbolicTerm deriveSymbolicTerm(BinOperatorPlugin plugin){
        //there has to be a child node (for leaf nodes see OpTContentNode)
        assert this.getChild() != null;

        //structure: this node -> -, operator node -> node1(left_term), node2(right term)
        OpTOperatorNode operatorNode = this.getChild();
        SymbolicTerm leftTerm = operatorNode.getLeftChild().getSymbolicTerm();
        SymbolicTerm rightTerm = operatorNode.getRightChild().getSymbolicTerm();

        OpTContentNode crossFlowNode = operatorNode.getRightChild();
        this.symbolicTerm = plugin.computeSymbolicTerm(operatorNode, leftTerm, rightTerm);

        //retrieve the variable, parameters, bounds, and constraints of the most recent curve operation from the plugin
        this.t = plugin.getVariable();
        assert this.addParameters(plugin.getParameters());
        this.localParameters.addAll(plugin.getParameters());
        assert this.addBounds(plugin.getBounds());
        assert this.addConstraints(plugin.getConstraints());

        return this.symbolicTerm;
    }


    /**
     * If not already included in the list of parameters, adds the given parameter to the list.
     * @param parameter
     *                  the new parameter to be added
     * @return  true if the parameter was added successfully, false if the parameter already exists or could not be added
     *          for other reasons
     */
    protected boolean addParameters(Variable<DoubleReal> parameter){
        for(Variable<DoubleReal> p : this.parameters){
            if(p.getName().equals(parameter.getName())){
                return false;
            }
        }
        return this.parameters.add(parameter);
    }


    /**
     * Adds the parameters to the list of parameters, if the list does not already contain a parameter with the same name
     * @param parameters
     *                      the new parameters to be added
     * @return  true if all parameters were added successfully, false otherwise
     */
    protected boolean addParameters(ArrayList<Variable<DoubleReal>> parameters){
        boolean all_added = true;
        for(Variable<DoubleReal> parameter : parameters){
            all_added &= addParameters(parameter);
        }
        return all_added;
    }


    /**
     * Adds the bound to the list of bounds, if no other bound for the same parameter (same parameter name rather than
     * object) exists in the list already.
     * @param bound
     *              the new bound to be added
     * @return  true if the bound was added successfully, false if the bound already exists or could not be added
     *          for other reasons
     */
    protected boolean addBounds(Bound bound){
        for(Bound b : this.bounds){
            if(b.getVariable().getName().equals(bound.getVariable().getName())){
                return false;
            }
        }
        boolean parameter_exists = false;
        for(Variable<DoubleReal> parameter : this.parameters){
            parameter_exists |= (parameter == bound.getVariable());
        }
        return this.bounds.add(bound) && parameter_exists;
    }


    /**
     * Adds the bounds to the list of the bounds. Does not add bounds for already bounded parameters.
     * @param bounds
     *                  the new bounds to be added
     * @return  true if all bounds were added successfully, false if at least one bound could not be added
     *          (e.g. because it tried to bound an already bounded parameter)
     */
    protected boolean addBounds(List<Bound> bounds){
        boolean allDdded = true;
        for(Bound bound : bounds){
            allDdded &= addBounds(bound);
        }
        return allDdded;
    }


    /**
     * Collects all parameters and bounds from its child nodes and adds them to this node.
     * Also, checks whether all parameters that are present in this node before collecting from its children are
     * properly bounded. If called on the root node, all parameters need to be properly bounded.
     */
    protected void collectParameters(){
        //all parameters that already exist in this node need to be bounded
        assert verifyBounds();
        if(getChild() != null){
            OpTSymbolicNode leftChild = getChild().getLeftChild();
            OpTSymbolicNode rightChild = getChild().getRightChild();

            if(leftChild != null){
                //possible reason for assertion errors: the assertion fails if two parameter names in the same network are
                //identical. In FIFO networks, the FIFO parameters are named after their respective flow's aliases. An assertion
                //error might indicate that two flows in the same network share an alias.
                assert addParameters(leftChild.getParameters());
                assert addBounds(leftChild.getBounds());
            }
            if(rightChild != null){
                assert addParameters(rightChild.getParameters());
                assert addBounds(rightChild.getBounds());
            }
        }
    }


    /**
     * Checks whether all parameters are bounded and whether all bounds belong to a parameter.
     * @return  true if there is exactly one bound for each parameter
     */
    protected boolean verifyBounds(){
        for(Variable<DoubleReal> parameter : parameters){
            boolean parameter_bounded = false;
            for(Bound bound : bounds){
                if(bound.getVariable() == parameter){
                    parameter_bounded = true;
                    break;
                }
            }
            if(!parameter_bounded){
                return false;
            }
        }
        return parameters.size() == bounds.size();
    }


    /**
     * Adds a list of constraint to the list of constraints.
     * @param constraints
     *                      the constraints to be added
     * @return  true if all constraints were added successfully, false otherwise
     */
    public boolean addConstraints(ArrayList<Constraint> constraints){
        return this.constraints.addAll(constraints) || constraints.size() == 0;
    }


    /**
     * Derives constraints.
     * @param plugin
     *                  the used plugin
     * @return  true if the derived constraint was successfully added to this node
     */
    protected boolean deriveConstraints(BinOperatorPlugin plugin){
        List<Constraint> cs = plugin.deriveConstraints(this);
        return cs.size() == 0 ? true : this.constraints.addAll(cs);
    }


    /**
     * Collects all constraints from its child nodes and adds them to this node.
     * Does NOT check, whether the constraints are valid!
     */
    protected void collectConstraints(){
        if(getChild() != null) {
            if(getChild().getLeftChild() != null){
                assert addConstraints(getChild().getLeftChild().getConstraints());
            }
            if(getChild().getRightChild() != null){
                assert addConstraints(getChild().getRightChild().getConstraints());
            }
        }
    }


    /**
     * If changes are made to this node (or the subtree rooted at this node) that affect the symbolics, store this information
     * in <code>madeChangesSinceLastSymbolicsComputation</code> and propagate this information up the tree to the root
     */
    protected abstract void notifyUpstreamNodesOfSymbolicsChange();


    /**
     * Recomputes all symbolics that are affected by previous changes in the tree.
     */
    public abstract void partialRecompute();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getters, setters, print
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Adds <code>opNode</code> as the child node.
     * Note: this can be used to manually build the operator tree
     * @param opNode
     *                  the child node
     */
    private void setChildFromConstructor(OpTOperatorNode opNode){
        this.child = opNode;
        this.child.setParent(this);
    }

    /**
     * Adds <code>opNode</code> as the child node and subsequently recomputes all IDs in the optree.
     * Note: this can be used to manually build the operator tree
     * @param opNode
     *                  the child node
     */
    public void setChild(OpTOperatorNode opNode){
        setChildFromConstructor(opNode);

        recomputeIDs();
    }


    public OpTOperatorNode getChild(){
        return this.child;
    }


    /**
     * getter for the node's symbolic term
     * @return the symbolic term
     */
    public SymbolicTerm getSymbolicTerm(){
        return this.symbolicTerm;
    }


    /**
     *
     * @return  the function variable t
     */
    public Variable<DoubleReal> getVariable(){
        return this.t;
    }


    /**
     *
     * @return  the list of all open parameters
     */
    public ArrayList<Variable<DoubleReal>> getParameters(){
        return this.parameters;
    }


    /**
     *
     * @return  the list of all bounds.
     */
    public ArrayList<Bound> getBounds(){
        return this.bounds;
    }


    /**
     *
     * @return  the list of all constraints
     */
    public ArrayList<Constraint> getConstraints(){
        return this.constraints;
    }


    /**
     * @return  true iff changes to the subtree rooted at this node have been made since the symbolics were computed
     */
    public boolean madeChangesSinceLastSymbolicsComputation() {
        return madeChangesSinceLastSymbolicsComputation;
    }


    /**
     * prints the operator tree
     */
    @Override
    public void printOpTree(){
        if(getChild() != null){
            System.out.println(String.format("%s -> child: %s", this, getChild()));
            getChild().printOpTree();
        }
    }
}
