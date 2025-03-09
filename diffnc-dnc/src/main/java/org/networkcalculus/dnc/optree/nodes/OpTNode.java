package org.networkcalculus.dnc.optree.nodes;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.Variable;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.optree.bounds.Bound;
import org.networkcalculus.dnc.optree.constraints.Constraint;
import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;
import org.networkcalculus.dnc.optree.symbolic.PASymbolic;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.tandem.fifo.TNode;

import java.util.*;


/**
 * @author Lukas Herll
 *
 * Represents the binary operator tree in an OpTreeAnalysis (a DNC analysis using a binary operator tree).
 *
 * Recommended use: via the OpTreeAnalysis class
 * Alternatively:
 *  construct using an existing nesting tree: new OpTNode(nestingTree)
 *  compute the symbolic term, bounds etc: deriveSymbolics(plugin)
 *
 * A binary operator tree can also be assembled manually by explicitly creating the needed OpTNodes and manually adding
 * parent/child relationships. But take care not to violate the structure of the binary operator tree (e.g. the delay node
 * is the root node and has only a right child which is a H operator node etc)
 */

//TODO possibly split up the node types into sub-classes, e.g. OpTNode as the main class and DelayNode etc inheriting from it

public class OpTNode {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //type of the node (delay, list of servers, flow, or operator)
    private OpTNodeType type;

    private double delay;
    private ArrayList<Server> servers;
    private Flow flow;
    private TreeOperator operator;

    //contains the symbolic term
    private SymbolicTerm symbolic_term;

    //parent (null if non-existent) and children
    //an only-child is always a right child
    private OpTNode parent;
    private OpTNode left_child, right_child;

    //assign each node an id for better identification (in particular, this makes printing the tree to console less ambiguous)
    //the id of each node is parent.id + 1 for a left child, + 2 for a right child
    private int id = -1;

    //time variable, parameters and bounds of the entire subtree rooted at this node
    private Variable<DoubleReal> t;
    private ArrayList<Variable<DoubleReal>> parameters;
    //local parameters are the parameters, which were derived from this node (e.g. the rate R of a service curve at the
    //node corresponding to the service curve)
    private ArrayList<Variable<DoubleReal>> local_parameters;
    private ArrayList<Bound> bounds;
    private ArrayList<Constraint> constraints;


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //one constructor per possible type of node and an additional constructor to generate an operator tree from a
    //nesting tree

    /**
     * creates a delay node of an operator tree
     * @param delay
     *              the delay of the flow of interest
     */
    public OpTNode(double delay){
        this.type = OpTNodeType.DELAY;

        this.delay = delay;
        this.servers = null;
        this.flow = null;
        this.operator = null;

        this.symbolic_term = null;

        this.parent = null;
        this.left_child = null;
        this.right_child = null;

        this.t = null;
        this.parameters = new ArrayList<>();
        this.local_parameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    /**
     * creates a server node of an operator tree
     * @param servers
     *              an ArrayList of servers as the content of this node
     * @param parent
     *              the parent node
     */
    public OpTNode(ArrayList<Server> servers, OpTNode parent){
        this.type = OpTNodeType.SERVERS;

        this.delay = -1;
        this.servers = servers;
        this.flow = null;
        this.operator = null;

        this.symbolic_term = null;

        this.parent = parent;
        this.left_child = null;
        this.right_child = null;

        this.t = null;
        this.parameters = new ArrayList<>();
        this.local_parameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    /**
     * creates a flow node of an operator tree
     * @param flow
     *              a Flow as the content of this node
     * @param parent
     *              the parent node
     */
    public OpTNode(Flow flow, OpTNode parent){
        this.type = OpTNodeType.FLOW;

        this.delay = -1;
        this.servers = null;
        this.flow = flow;
        this.operator = null;

        this.symbolic_term = null;

        this.parent = parent;
        this.left_child = null;
        this.right_child = null;

        this.t = null;
        this.parameters = new ArrayList<>();
        this.local_parameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    /**
     * creates an operator node of an operator tree
     * @param operator
     *              an operator as the content of this node
     * @param parent
     *              the parent node
     */
    public OpTNode(TreeOperator operator, OpTNode parent){
        this.type = OpTNodeType.OPERATOR;

        this.delay = -1;
        this.servers = null;
        this.flow = null;
        this.operator = operator;

        this.symbolic_term = null;

        this.parent = parent;
        this.left_child = null;
        this.right_child = null;

        this.t = null;
        this.parameters = new ArrayList<>();
        this.local_parameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    /**
     * creates an operator tree from a nesting tree
     * @param nesting_tree_root
     *              the root of a nesting tree
     */
    public OpTNode(TNode nesting_tree_root){
        //nesting_tree_root must represent a flow
        assert(nesting_tree_root.getInf() instanceof Flow);

        this.type = OpTNodeType.DELAY;

        this.delay = -1;
        this.servers = null;
        this.flow = null;
        this.operator = null;

        this.symbolic_term = null;

        this.parent = null;
        this.left_child = null;
        this.addRightChild(createOperatorNode(TreeOperator.H_OPERATOR, this, nesting_tree_root, new ArrayList<>(nesting_tree_root.getChildren())));
        setAllIDs(0);

        this.t = null;
        this.parameters = new ArrayList<>();
        this.local_parameters = new ArrayList<>();
        this.bounds = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods for recursively creating the operator tree + IDs
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Creates an operator node. Then recursively creates the rest of the operator tree. The left children are possibly
     * supplemented by additional servers
     * @param parent
     *              the parent of the operator node
     * @param operator
     *              the operator of this node
     * @param right_child
     *              the right child of the operator node
     * @param left_children
     *              a (possibly empty) list of left children of the operator node
     * @return the operator node
     */
    private OpTNode createOperatorNode(TreeOperator operator, OpTNode parent, TNode right_child, ArrayList<TNode> left_children){
        //resulting structure: parent -> operator -> subtree(left_children), right_child
        assert(right_child != null && left_children.size() > 0);

        //transform the right child into an operator tree node
        OpTNode opt_right_child;
        if(right_child.getInf() instanceof Flow){
            opt_right_child = new OpTNode((Flow) right_child.getInf(), null);
        }
        else{
            opt_right_child = new OpTNode(new ArrayList<Server>((List<Server>) right_child.getInf()), null);
        }

        //transform the list of left children into a list of operator nodes
        ArrayList<OpTNode> opt_left_children = createOpTNodes(left_children);

        //invoke createOperatorNode with OpTNode arguments
        return createOperatorNode(operator, parent, opt_right_child, opt_left_children);
    }


    /**
     * Creates an operator node. Then recursively creates the rest of the operator tree. The left children are possibly
     * supplemented by additional servers
     * @param parent
     *              the parent of the operator node
     * @param operator
     *              the operator of this node
     * @param right_child
     *              the right child of the operator node
     * @param left_children
     *              a (possibly empty) list of left children of the operator node
     * @return the operator node
     */
    private OpTNode createOperatorNode(TreeOperator operator, OpTNode parent, OpTNode right_child, ArrayList<OpTNode> left_children){
        //resulting structure: parent -> operator -> subtree(left_children), right_child

        //The right child and the list of left children need to exist
        assert(right_child != null && left_children != null && left_children.size() > 0);
        //if the right child is a flow node, the operator must be either H or Leftover
        if(right_child.getType() == OpTNodeType.FLOW){
            assert(operator == TreeOperator.LEFTOVER || operator == TreeOperator.H_OPERATOR);
        }
        //if the right child is a server node, the operator must be the Convolution operator
        else{
            assert(operator == TreeOperator.CONVOLUTION);
        }

        //create the operator node
        OpTNode op_node = new OpTNode(operator, parent);

        //add the operator node's right child
        op_node.addRightChild(right_child);
        right_child.setParent(op_node);

        //create the operator node's left child from the list of left children
        //if the given list of left children is non-empty, create a convolution subtree from them and store this subtree
        //as a possible left child
        OpTNode possible_left_child = null;

        if(left_children.size() > 0){ possible_left_child = convolveOpTNodes(left_children, op_node); }

        //if the right child is a flow and covers more servers than are included in the possible left child,
        //then these additional servers need to be explicitly included in another convolution subtree
        if(right_child.getType() == OpTNodeType.FLOW){
            //create a list of all servers on the flow's path
            ArrayList<Server> missing_servers = new ArrayList<Server>(right_child.getFlow().getPath().getServers());
            //remove all servers that are already included in the possible left child
            if(possible_left_child != null){ missing_servers.removeAll(possible_left_child.getServers()); }
            //if no servers remain, the possible left child is complete => add it as the left child
            if(missing_servers.size() == 0){
                op_node.addLeftChild(possible_left_child);
            }
            //otherwise, more servers need to be added to the left child
            else{
                //create another convolution subtree from the missing servers
                OpTNode second_left_child = convolveServers(missing_servers, null);
                //to obtain the left child, merge the two convolution subtrees
                ArrayList<OpTNode> subtrees = new ArrayList<>();
                subtrees.add(possible_left_child);
                subtrees.add(second_left_child);
                op_node.addLeftChild(convolveOpTNodes(subtrees, op_node));
            }
        }
        //if the right child is not a flow, but a server, add the convolution subtree obtained from the given left children
        //as the operator node's left child
        else{
            op_node.addLeftChild(possible_left_child);
        }

        return op_node;
    }


    /**
     * takes a list of TNodes and transforms it into a list of OpTNodes. Generates all relevant subtrees.
     * @param nodes
     *              a non-empty ArrayList of TNodes
     * @return the corresponding list of OpTNodes
     */
    private ArrayList<OpTNode> createOpTNodes(ArrayList<TNode> nodes){
        assert(nodes.size() > 0);
        //transform each TNode from nodes into an OpTNode (transform flow nodes into subtrees)
        //then convolve the nodes by invoking convolveOpTNodes()
        ArrayList<OpTNode> opt_nodes = new ArrayList<>();
        for(TNode node : nodes){
            //if the node is a flow node, create a tree (server node -> operator node -> servers, flow)
            //where the content of the first server node depends on the content of the server node two nodes down the line
            //and the operator is the leftover operator
            if(node.getInf() instanceof Flow){
                //create the first server node
                OpTNode flow_subtree_root = new OpTNode(new ArrayList<Server>(), null);
                //create the operator node (leftover operator) and add it as a right child to the first server node

                OpTNode op_node = createOperatorNode(TreeOperator.LEFTOVER, flow_subtree_root, node, new ArrayList<>(node.getChildren()));
                flow_subtree_root.addRightChild(op_node);
                //set the content of the first server node according to the content of the server node two nodes down the line
                flow_subtree_root.addServers(op_node.getLeftChild().getServers());
                //add the first server node to the OpTNode list
                opt_nodes.add(flow_subtree_root);
            }
            //if the node is a server node, turn it into a server OpTNode and add it to the OpTNode list
            else{
                ArrayList<Server> servers;
                //store the nodes servers in an ArrayList (the node could contain a single server, but we need a list)
                if(node.getInf() instanceof Server){
                    servers = new ArrayList<>();
                    servers.add((Server) node.getInf());
                }
                else{
                    servers = new ArrayList<>((LinkedList<Server>) node.getInf());
                }

                //if the TNode contains more than one server, add a convolution subtree instead of just one server OpTNode
                if(servers.size() > 1){
                    opt_nodes.add(convolveServers(servers, null));
                }
                //otherwise, add the server as a single server OpTNode
                else{
                    opt_nodes.add(new OpTNode(servers, null));
                }
            }
        }
        return opt_nodes;
    }


    /**
     * Creates a convolution subtree from a list of OpTNodes
     * @param opt_nodes
     *              the nodes to be convolved
     * @param parent
     *              the parent node of the convolution subtree
     * @return the root of the convolution subtree
     */
    private OpTNode convolveOpTNodes(ArrayList<OpTNode> opt_nodes, OpTNode parent){
        assert(opt_nodes.size() > 0);

        //if there is just one node, return it
        if(opt_nodes.size() == 1){
            return opt_nodes.get(0);
        }
        //otherwise, recursively create a convolution subtree
        else{
            //structure of the convolution subtree: root -> op_node -> server0, server1
            //create a server OpTNode as the subtree root
            OpTNode root = new OpTNode(new ArrayList<>(), parent);

            //create a convolution operator node from all opt_nodes but the first one
            OpTNode op_node = createOperatorNode(TreeOperator.CONVOLUTION, root, opt_nodes.get(0), new ArrayList<>(opt_nodes.subList(1, opt_nodes.size())));
            root.addRightChild(op_node);
            //generate the root node's servers from the servers two nodes down the line
            root.addServers(op_node.getLeftChild().getServers());
            root.addServers(op_node.getRightChild().getServers());
            return root;
        }
    }


    /**
     * creates a convolution subtree from the given servers
     * @param servers
     *              a non-empty ArrayList of Servers
     * @param parent
     *              the parent node of the convolution subtree
     * @return the root of the convolution subtree
     */
    private OpTNode convolveServers(ArrayList<Server> servers, OpTNode parent){
        assert(servers.size() > 0);
        //create a list of TNodes from the list of servers
        ArrayList<TNode> tnodes = new ArrayList<>();
        for(Server server : servers){
            tnodes.add(new TNode(server, null));
        }
        //transform the TNodes into OpTNodes and convolve them
        return convolveOpTNodes(createOpTNodes(tnodes), parent);
    }


    /**
     * Assigns an ID to each node of the operator tree rooted at this node, starting with the given start value.
     * Uses a DFS strategy to assign IDs
     * @param root_id
     *                  the ID of the root node of the given subtree (this node)
     * @return  the largest ID of the subtree rooted at this node
     */
    public int setAllIDs(int root_id){
        this.setId(root_id);

        OpTNode rightChild = getRightChild();
        OpTNode leftChild = getLeftChild();
        //if this node is a leave node, return its id
        if(leftChild == null && rightChild == null){
            return root_id;
        }

        //if there is only one child, set its ids
        if(leftChild == null){
            return rightChild.setAllIDs(root_id+1);
        }

        //if both children exist, set both their ids
        //(the id of the right child is larger than all ids in the left child's subtree)
        return rightChild.setAllIDs(leftChild.setAllIDs(root_id+1)+1);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: symbolic term, parameters, bounds, constraints
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Derives the function variable, the open parameters, their bounds, the constraints, and computes the symbolic term
     * using the provided plugin. This is the recommended function for general use.
     * @param plugin
     *                  a Plugin specifying the concrete operations of the given problem (use a predefined one or
     *                  define a new one)
     */
    public void deriveSymbolics(BinOperatorPlugin plugin){
        deriveSymbolicTerm(plugin);
        collectParameters();
        boolean couldDeriveConstraints = deriveConstraints(plugin);
        assert couldDeriveConstraints;
        collectConstraints();
    }


    /**
     * Recursively computes the symbolic term of the OpTNode and stores it in the node.
     * @param plugin
     *                  a Plugin specifying the concrete operations of the given problem (use a predefined one or
     *                  define a new one)
     * @return  the symbolic term
     */
    public SymbolicTerm deriveSymbolicTerm(BinOperatorPlugin plugin){
        //operator nodes do not have a symbolic term
        assert(this.type != OpTNodeType.OPERATOR);

        //each node that is not an operator node has at most a right child, which is an operator node
        //if there is no right child, this node is a leaf node
        if(this.right_child == null){
            //the delay node must have a child
            assert(this.type != OpTNodeType.DELAY);
            if(this.type == OpTNodeType.FLOW){
                this.symbolic_term = plugin.computeSymbolicTerm(this.getFlow());
            }
            if(this.type == OpTNodeType.SERVERS){
                //leaf nodes only consist of one server
                assert(this.getServers().size() == 1);
                this.symbolic_term = plugin.computeSymbolicTerm(this.getServers().get(0));
            }
        }
        else
        {
            //structure: this node -> -, operator node -> node1(left_term), node2(right term)
            OpTNode operator_node = this.right_child;
            TreeOperator tree_op = operator_node.getOperator();
            SymbolicTerm left_term = operator_node.getLeftChild().deriveSymbolicTerm(plugin);
            SymbolicTerm right_term = operator_node.getRightChild().deriveSymbolicTerm(plugin);

            //For leftover operations, the id of the cross-flow has to be used instead of the operator node's id
            OpTNode cross_flow_node = operator_node.getRightChild();
            if(operator_node.getOperator() == TreeOperator.LEFTOVER){
                //leftover node
                this.symbolic_term = plugin.computeSymbolicTerm(tree_op, cross_flow_node.getFlow().getAlias(), left_term, right_term);
            }
            else{
                //convolution node
                this.symbolic_term = plugin.computeSymbolicTerm(tree_op, String.valueOf(operator_node.getId()), left_term, right_term);
            }
        }

        //retrieve the variable, parameters, bounds, and constraints from the plugin
        this.t = plugin.getVariable();
        boolean couldAddParameters = this.addParameters(plugin.getParameters());
        assert couldAddParameters;
        this.local_parameters.addAll(plugin.getParameters());
        boolean couldAddBounds = this.addBounds(plugin.getBounds());
        assert couldAddBounds;
        boolean couldAddConstraints = this.addConstraints(plugin.getConstraints());
        assert couldAddConstraints;

        return this.symbolic_term;
    }


    /**
     * If not already included in the list of parameters, adds the given parameter to the list.
     * @param parameter
     *                  the new parameter to be added
     * @return  true if the parameter was added successfully, false if the parameter already exists or could not be added
     *          for other reasons
     */
    public boolean addParameters(Variable<DoubleReal> parameter){
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
    public boolean addParameters(ArrayList<Variable<DoubleReal>> parameters){
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
    public boolean addBounds(Bound bound){
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
    public boolean addBounds(List<Bound> bounds){
        boolean all_added = true;
        for(Bound bound : bounds){
            all_added &= addBounds(bound);
        }
        return all_added;
    }


    /**
     * Collects all parameters and bounds from its child nodes and adds them to this node.
     * Also, checks whether all parameters that are present in this node before collecting from its children are
     * properly bounded. If called on the root node, all parameters need to be properly bounded.
     */
    public void collectParameters(){
        //all parameters that already exist in this node need to be bounded
        assert verifyBounds();

        OpTNode left_child = getLeftChild();
        OpTNode right_child = getRightChild();

        if(left_child != null){
            left_child.collectParameters();
            //possible reason for assertion errors: the assertion fails if two parameter names in the same network are
            //identical. In FIFO networks, the FIFO parameters are named after their respective flow's aliases. An assertion
            //error might indicate that two flows in the same network share an alias.
            boolean couldAddParameters = addParameters(left_child.getParameters());
            assert couldAddParameters;
            boolean couldAddBounds = addBounds(left_child.getBounds());
            assert couldAddBounds;
        }
        if(right_child != null){
            right_child.collectParameters();
            boolean couldAddParameters = addParameters(right_child.getParameters());
            assert couldAddParameters;
            boolean couldAddBounds = addBounds(right_child.getBounds());
            assert couldAddBounds;
        }
    }


    /**
     * Checks whether all parameters are bounded and whether all bounds belong to a parameter.
     * @return  true if there is exactly one bound for each parameter
     */
    public boolean verifyBounds(){
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
    public boolean deriveConstraints(BinOperatorPlugin plugin){
        List<Constraint> cs = plugin.deriveConstraints(this);
        return cs.size() == 0 ? true : this.constraints.addAll(cs);
    }


    /**
     * Collects all constraints from its child nodes and adds them to this node.
     * Does NOT check, whether the constraints are valid!
     */
    public void collectConstraints(){
        if(getLeftChild() != null){
            boolean couldAddConstraints = addConstraints(getLeftChild().getConstraints());
            assert couldAddConstraints;
        }
        if(getRightChild() != null){
            boolean couldAddConstraints = addConstraints(getRightChild().getConstraints());
            assert couldAddConstraints;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods: getters, setters, print
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Computes the delay based on the current values of the open parameters. Only works for delay nodes (roots).
     * @return  the computed delay
     */
    public double computeDelayFromCurrentParamValues(){
        assert this.type == OpTNodeType.DELAY && this.symbolic_term != null;
        this.delay = this.symbolic_term.getTerm().getValue().doubleValue();
        return delay;
    }

    /**
     *
     * @return the parent node
     */
    public OpTNode getParent(){ return parent; }


    /**
     * sets the parent node
     * @param new_parent
     *              the new parent node
     */
    public void setParent(OpTNode new_parent){
        this.parent = new_parent;
    }


    /**
     *
     * @return the type of this node (Delay, Servers, Flow, Operator)
     */
    public OpTNodeType getType(){
        return this.type;
    }

    /**
     *
     * @return the delay
     */
    public double getDelay(){
        assert(this.type == OpTNodeType.DELAY);
        return this.delay;
    }


    /**
     *
     * @return the servers
     */
    public ArrayList<Server> getServers(){
        assert(this.type == OpTNodeType.SERVERS);
        return this.servers;
    }


    /**
     * adds servers to this node
     * @param new_servers
     *              the list of servers to be added
     * @return true iff success
     */
    public boolean addServers(ArrayList<Server> new_servers){
        return servers.addAll(new_servers);
    }


    /**
     *
     * @return the flow
     */
    public Flow getFlow(){
        assert(this.type == OpTNodeType.FLOW);
        return this.flow;
    }


    /**
     *
     * @return the operator
     */
    public TreeOperator getOperator(){
        assert(this.type == OpTNodeType.OPERATOR);
        return this.operator;
    }


    /**
     * getter for the node's symbolic term
     * @return the symbolic term
     */
    public SymbolicTerm getSymbolicTerm(){
        //an operator node does not have a symbolic term
        assert(this.type != OpTNodeType.OPERATOR);
        return this.symbolic_term;
    }


    /**
     * adds a left child node to this node
     * @param child
     *              the child node to be added
     * @return the added child node
     */
    public OpTNode addLeftChild(OpTNode child){
        //flows are always leaves
        assert(this.type != OpTNodeType.FLOW);
        this.left_child = child;
        child.setId(2*this.id);
        return this.left_child;
    }

    /**
     * adds a right child node to this node
     * @param child
     *              the child node to be added
     * @return the added child node
     */
    public OpTNode addRightChild(OpTNode child){
        //flows are always leaves
        assert(this.type != OpTNodeType.FLOW);
        this.right_child = child;
        child.setId(2*this.id + 1);
        return this.right_child;
    }


    /**
     *
     * @return the left child
     */
    public OpTNode getLeftChild(){ return this.left_child; }


    /**
     *
     * @return the right child
     */
    public OpTNode getRightChild(){ return this.right_child; }


    /**
     *
     * @return the node's id
     */
    public int getId(){
        return this.id;
    }


    /**
     * sets the child nodes ID (parent + 1 for left child, + 2 for right child)
     * @param id
     *          the new ID of this node
     */
    public void setId(int id){
        this.id = id;
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
     * prints the operator tree
     */
    public void printOpTree(){
        if(this.left_child != null){
            System.out.println(String.format("%s -> left child: %s", this, left_child));
            this.left_child.printOpTree();
        }
        if(this.right_child != null){
            System.out.println(String.format("%s -> right child: %s", this, right_child));
            this.right_child.printOpTree();
        }
    }

    @Override
    public String toString(){
        switch (this.type){
            case DELAY: return this.id + ": Root: delay = " + this.delay;
            case SERVERS: String servers_string =  this.id + ": Servers [";
                for(Server server : this.servers){
                    servers_string += "Server " + server.getId() + ", ";
                }
                return servers_string + "]";
            case FLOW: return this.id + ": Flow " + this.flow.getId();
            case OPERATOR: return this.id + ": Operator " + this.operator;
            default: return null;
        }
    }
}
