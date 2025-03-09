package org.networkcalculus.dnc.optree.nodes;

import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.tandem.fifo.TNode;

import java.util.ArrayList;
import java.util.List;

public class OpTServerNode extends OpTContentNode {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private ArrayList<Server> servers;


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Instantiates a server node as a leaf containing a single server
     * @param server
     *                  the content of this node
     */
    public OpTServerNode(Server server){
        super();
        this.servers = new ArrayList<>();
        this.servers.add(server);
    }


    /**
     * Instantiates a server node as a non-leaf node with a provided child node
     * @param servers
     *                  the content of this node
     * @param child
     *                  the child of this node
     */
    public OpTServerNode(List<Server> servers, OpTOperatorNode child){
        super(child);
        this.servers = new ArrayList<>(servers);
    }

    /**
     * Creates a convolution subtree of all provided servers. (A node containing multiple servers needs to have a subtree
     * as a child that contains (and convolves) all given servers.)
     * @param servers
     *                  the content of this node
     */
    public OpTServerNode(List<Server> servers){
        super();
        this.servers = new ArrayList<>(servers);

        ArrayList<OpTServerNode> serverNodes = new ArrayList<>();
        for(Server server : servers){
            serverNodes.add(new OpTServerNode(server));
        }
        this.child = new OpTConvNode(serverNodes);
    }


    /**
     * Recursively creates a convolution subtree of all provided server nodes.
     * Note: The dummy value is necessary to prevent that this constructor has the same erasure as the previous one
     * @param serverNodes
     *                      the list of server nodes
     * @param dummyValue
     *                      a dummy value. Its value does not matter
     *
     */
    public OpTServerNode(List<OpTServerNode> serverNodes, String dummyValue){
        super();
        assert serverNodes != null && serverNodes.size() > 1;

        this.servers = new ArrayList<>();
        for(OpTServerNode node : serverNodes){
            this.servers.addAll(node.getServers());
        }

        setChild(new OpTConvNode(serverNodes));
    }

    //TODO 
    //public OpTServerNode(TNode nestingTreeRoot){
    //    super();
    //}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<Server> getServers(){
        return this.servers;
    }

    public boolean addServers(List<Server> newServers){
        this.notifyUpstreamNodesOfSymbolicsChange();
        return this.servers.addAll(newServers);
    }

    @Override
    protected String getContentString() {
        String serverString = "Servers [";
        for(Server server : this.servers){
            serverString += "Server " + server.getId() + ", ";
        }
        return serverString.substring(0, serverString.length()-2) + "]";
    }

    @Override
    protected SymbolicTerm deriveSymbolicTermFromLeaf(BinOperatorPlugin plugin) {
        //leaf nodes only consist of one server
        assert(this.getServers().size() == 1);
        return plugin.computeSymbolicTerm(this.getServers().get(0));
    }
}
