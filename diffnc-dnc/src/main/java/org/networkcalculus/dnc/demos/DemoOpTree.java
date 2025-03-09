package org.networkcalculus.dnc.demos;

import nilgiri.math.DoubleReal;
import nilgiri.math.DoubleRealFactory;
import nilgiri.math.autodiff.DifferentialRealFunctionFactory;
import nilgiri.math.autodiff.Variable;
import nilgiri.math.autodiff.Zero;
import org.networkcalculus.dnc.curves.ArrivalCurve;
import org.networkcalculus.dnc.curves.Curve;
import org.networkcalculus.dnc.curves.MaxServiceCurve;
import org.networkcalculus.dnc.curves.ServiceCurve;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;
import org.networkcalculus.dnc.network.server_graph.Turn;
import org.networkcalculus.dnc.optree.nodes.OpTNode;
import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;
import org.networkcalculus.dnc.optree.plugins.TestArbMulPlugin;
import org.networkcalculus.dnc.optree.plugins.TestFIFOMulPlugin;
import org.networkcalculus.dnc.optree.symbolic.RLServiceSymbolic;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.optree.symbolic.TBArrivalSymbolic;
import org.networkcalculus.dnc.optree.toolchain.OpTreeAnalysis;
import org.networkcalculus.dnc.tandem.fifo.NestedTandemAnalysis;
import org.networkcalculus.dnc.tandem.fifo.TNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Demo for the OpTreeAnalysis (DNC analysis using a binary operator tree).
 * Served as a manual testing ground.
 *
 * @author Lukas Herll
 */

public class DemoOpTree {


    public DemoOpTree() {
    }

    public static void main(String[] args) {
        DemoOpTree demo = new DemoOpTree();

        //testSymbolics();

        try {
            demo.runFIFOToolChain();
            //demo.runToolChain();
            //demo.runSmallerTree();
            //demo.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void runToolChain() throws Exception{
        TNode nestingTree = getSmallestNestingTree();
        OpTreeAnalysis ota = new OpTreeAnalysis(nestingTree);
        BinOperatorPlugin plugin = new TestArbMulPlugin();

        ArrayList<Double> initialGuess = new ArrayList<Double>();
        double a = 0;
        initialGuess.add(a);
        initialGuess.add(a);


        ota.runDelayBoundAnalysis(plugin, initialGuess);
    }


    public void runFIFOToolChain() throws Exception{
        TNode nestingTree = getSmallestNestingTree();
        OpTreeAnalysis ota = new OpTreeAnalysis(nestingTree);
        BinOperatorPlugin plugin = new TestFIFOMulPlugin();

        ArrayList<Double> initialGuess = new ArrayList<Double>();
        double a = 0;
        initialGuess.add(a);

        ota.runDelayBoundAnalysis(plugin);

        //ota.getOpTree().printOpTree();
    }


    public void runSmallerTree() throws Exception {
        TNode nesting_tree = getSmallNestingTree();

        //print the nesting tree
        System.out.println("nesting tree:");
        printTNode(nesting_tree);
        //printTree(nesting_tree, foi);

        OpTNode op_tree = new OpTNode(nesting_tree);
        System.out.println("\nbinary operator tree:");
        op_tree.printOpTree();

        BinOperatorPlugin plugin = new TestArbMulPlugin();
        op_tree.deriveSymbolics(plugin);

        System.out.println("\nVariable: " + op_tree.getVariable());
        System.out.println("Open Parameters: " + op_tree.getParameters());
        System.out.println("Bounds: " + op_tree.getBounds());
        System.out.println("Constraints: " + op_tree.getConstraints());
    }


    private TNode getSmallNestingTree() throws Exception{
        //specify the service curves
        //same as in Demo4
        ServiceCurve service_curve = Curve.getFactory().createRateLatency(10.0e6, 0.01);
        MaxServiceCurve max_service_curve = Curve.getFactory().createRateLatencyMSC(100.0e6, 0.001);

        ServerGraph sg = new ServerGraph();

        //create the servers
        int numServers = 3;
        Server[] servers = new Server[numServers];

        for (int i = 0; i < numServers; i++) {
            servers[i] = sg.addServer(service_curve, max_service_curve);
            servers[i].useMaxSC(false);
            servers[i].useMaxScRate(false);
        }

        //define the connections between servers
        Turn t_0_1 = sg.addTurn(servers[0], servers[1]);
        Turn t_1_2 = sg.addTurn(servers[1], servers[2]);

        //define the arrival curve
        ArrivalCurve arrival_curve = Curve.getFactory().createTokenBucket(0.1e6, 0.1 * 0.1e6);

        //define the paths
        // Turns need to be ordered from source server to sink server when defining a
        // path manually

        //path: 0,2
        sg.addFlow("foi", arrival_curve, servers[0], servers[2]);
        //path 0,1
        sg.addFlow("f1", arrival_curve, servers[0], servers[1]);
        //path 2,2
        sg.addFlow("f2", arrival_curve, servers[2]);

        //run FIFOTandemAnalysis to run NestedTandemAnalysis
        //FIFOTandemAnalysis fta = new FIFOTandemAnalysis(sg);

        //find the flow of interest
        Flow foi = Flow.createDummyFlow("dummy", arrival_curve, sg.getShortestPath(servers[0], servers[2]));
        for(Flow flow : sg.getFlows()){
            if(flow.getAlias() == "foi"){
                foi = flow;
                break;
            }
        }

        //compute the nesting tree
        //sg.getShortestPath(Server src, Server snk) returns Path from src to snk
        NestedTandemAnalysis nta = new NestedTandemAnalysis(sg.getShortestPath(servers[0], servers[2]), foi, sg.getFlows());
        //use method NestedTandemAnalysis().onlyComputeNestingTree() to retrieve the nesting tree
        //as a TNode object
        return nta.onlyComputeNestingTree();
    }


    private TNode getSmallestNestingTree() throws Exception{
        //specify the service curves
        //same as in Demo4
        ServiceCurve service_curve = Curve.getFactory().createRateLatency(10.0e6, 0.01);
        MaxServiceCurve max_service_curve = Curve.getFactory().createRateLatencyMSC(100.0e6, 0.001);

        ServerGraph sg = new ServerGraph();

        //create the servers
        int numServers = 2;
        Server[] servers = new Server[numServers];

        for (int i = 0; i < numServers; i++) {
            servers[i] = sg.addServer(service_curve, max_service_curve);
            servers[i].useMaxSC(false);
            servers[i].useMaxScRate(false);
        }

        //define the connections between servers
        Turn t_0_1 = sg.addTurn(servers[0], servers[1]);

        //define the arrival curve
        ArrivalCurve arrival_curve = Curve.getFactory().createTokenBucket(0.1e6, 0.1 * 0.1e6);

        //define the paths
        // Turns need to be ordered from source server to sink server when defining a
        // path manually

        //path: 0,1
        sg.addFlow("foi", arrival_curve, servers[0], servers[1]);
        //path 1,1
        sg.addFlow("f2", arrival_curve, servers[1]);

        //run FIFOTandemAnalysis to run NestedTandemAnalysis
        //FIFOTandemAnalysis fta = new FIFOTandemAnalysis(sg);

        //find the flow of interest
        Flow foi = Flow.createDummyFlow("dummy", arrival_curve, sg.getShortestPath(servers[0], servers[1]));
        for(Flow flow : sg.getFlows()){
            if(flow.getAlias() == "foi"){
                foi = flow;
                break;
            }
        }

        //compute the nesting tree
        //sg.getShortestPath(Server src, Server snk) returns Path from src to snk
        NestedTandemAnalysis nta = new NestedTandemAnalysis(sg.getShortestPath(servers[0], servers[1]), foi, sg.getFlows());

        TNode nestingTree = nta.onlyComputeNestingTree();
        printTree(nestingTree, foi);

        //use method NestedTandemAnalysis().onlyComputeNestingTree() to retrieve the nesting tree
        //as a TNode object
        return nestingTree;
    }


    public void run() throws Exception{
        //specify the service curves
        //same as in Demo4
        ServiceCurve service_curve = Curve.getFactory().createRateLatency(10.0e6, 0.01);
        MaxServiceCurve max_service_curve = Curve.getFactory().createRateLatencyMSC(100.0e6, 0.001);

        ServerGraph sg = new ServerGraph();

        //create the servers
        int numServers = 7;
        Server[] servers = new Server[numServers];

        for (int i = 1; i < numServers; i++) {
            servers[i] = sg.addServer(service_curve, max_service_curve);
            servers[i].useMaxSC(false);
            servers[i].useMaxScRate(false);
        }

        //define the connections between servers
        Turn t_1_2 = sg.addTurn(servers[1], servers[2]);
        Turn t_2_3 = sg.addTurn(servers[2], servers[3]);
        Turn t_3_4 = sg.addTurn(servers[3], servers[4]);
        Turn t_4_5 = sg.addTurn(servers[4], servers[5]);
        Turn t_5_6 = sg.addTurn(servers[5], servers[6]);

        //define the arrival curve
        ArrivalCurve arrival_curve = Curve.getFactory().createTokenBucket(0.1e6, 0.1 * 0.1e6);

        //define the paths
        // Turns need to be ordered from source server to sink server when defining a
        // path manually

        //path: 1,6 (define an alias, the arrival curve and the source and sink node (or single hop))
        sg.addFlow("foi", arrival_curve, servers[1], servers[6]);
        //path 2,3
        sg.addFlow("f1", arrival_curve, servers[2], servers[3]);
        //path 3,3
        sg.addFlow("f2", arrival_curve, servers[3]);
        //path 4,6
        sg.addFlow("f3", arrival_curve, servers[4], servers[6]);
        //path 4,4
        sg.addFlow("f4", arrival_curve, servers[4]);
        //path 5,6
        sg.addFlow("f5", arrival_curve, servers[5], servers[6]);
        //path 6,6
        sg.addFlow("f6", arrival_curve, servers[6]);

        //run FIFOTandemAnalysis to run NestedTandemAnalysis
        //FIFOTandemAnalysis fta = new FIFOTandemAnalysis(sg);

        //find the flow of interest
        Flow foi = Flow.createDummyFlow("dummy", arrival_curve, sg.getShortestPath(servers[1], servers[6]));
        for(Flow flow : sg.getFlows()){
            if(flow.getAlias() == "foi"){
                foi = flow;
                break;
            }
        }

        //compute the nesting tree
        //sg.getShortestPath(Server src, Server snk) returns Path from src to snk
        NestedTandemAnalysis nta = new NestedTandemAnalysis(sg.getShortestPath(servers[1], servers[6]), foi, sg.getFlows());
        //use method NestedTandemAnalysis().onlyComputeNestingTree() to retrieve the nesting tree
        //as a TNode object
        TNode nesting_tree = nta.onlyComputeNestingTree();

        //print the nesting tree
        printTNode(nesting_tree);
        //printTree(nesting_tree, foi);

        OpTNode op_tree = new OpTNode(nesting_tree);
        op_tree.printOpTree();
    }


    private void printTNode(TNode root){
        ArrayList<TNode> children = root.getChildren();
        String edge = "";
        if(root.getInf() instanceof Flow){
            edge += "Flow " + ((Flow) root.getInf()).getAlias() + " -> ";
        }
        else{
            edge += "Servers " + root.getInf() + " -> ";
        }
        for(TNode child : children){
            if(child.getInf() instanceof Flow){
                System.out.println(edge + "FLow " + ((Flow) child.getInf()).getAlias());
            }
            else {
                String servers = new String(edge) + "Servers: ";
                for(Server server : (LinkedList<Server>) child.getInf()){
                    servers += "s" + server.getId() + ", ";
                }
                System.out.println(servers);
            }
            printTNode(child);
        }
    }


    //code um den Tree zu printen:
    private void printTree(TNode subtree, Flow foi) {
        if (subtree.getInf() instanceof Flow) {
            if (!subtree.getInf().equals(foi)) {
                System.out.println("(Flow  " + ((Flow) subtree.getParent().getInf()).getId() + " ->  Flow " + ((Flow) subtree.getInf()).getId() + " ), ");
            } else {
                System.out.println("Root " + ((Flow) subtree.getInf()).getId() + ", ");
            }
            ArrayList<TNode> children = subtree.getChildren();
            for (TNode child : children) {
                printTree(child, foi);
            }
        } else {
            LinkedList<Server> leafNode = (LinkedList<Server>) subtree.getInf();
            for (Server server : leafNode) {
                System.out.print("(Flow  " + ((Flow) subtree.getParent().getInf()).getId() + " ->  Server " + server.getId() + " ), ");
            }
            System.out.println();
        }
    }


    private static void testSymbolics(){
        DoubleRealFactory RNFactory = DoubleRealFactory.instance();
        DifferentialRealFunctionFactory<DoubleReal> DFFactory = new DifferentialRealFunctionFactory<DoubleReal>(RNFactory);

        Variable<DoubleReal> t = DFFactory.var("t", new DoubleReal(0));
        Variable<DoubleReal> R = DFFactory.var("R", new DoubleReal(1));
        Variable<DoubleReal> L = DFFactory.var("L", new DoubleReal(2));
        Variable<DoubleReal> r = DFFactory.var("r", new DoubleReal(2));
        Variable<DoubleReal> B = DFFactory.var("B", new DoubleReal(3));
        Zero zero = DFFactory.zero();

        SymbolicTerm beta = new RLServiceSymbolic(R.minus(r), B.plus(R.mul(L)).div(R.minus(L)), t, zero);
        System.out.println("service = " + beta);
        System.out.println("term = " + beta.getTerm());

        SymbolicTerm alpha = new TBArrivalSymbolic(r, B, t, zero);
        System.out.println("arrival = " + alpha);
        System.out.println("term = " + alpha.getTerm());

    }

}
