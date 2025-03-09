package org.networkcalculus.dnc.demos;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.DifferentialFunction;
import nilgiri.math.autodiff.Variable;
import org.networkcalculus.dnc.AnalysisConfig;
import org.networkcalculus.dnc.curves.*;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;
import org.networkcalculus.dnc.network.server_graph.Turn;
import org.networkcalculus.dnc.optree.plugins.BinOperatorPlugin;
import org.networkcalculus.dnc.optree.plugins.DiffLUDBPlugin;
import org.networkcalculus.dnc.optree.plugins.TestArbMulPlugin;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.optree.toolchain.FileManager;
import org.networkcalculus.dnc.optree.toolchain.OpTreeAnalysis;
import org.networkcalculus.dnc.tandem.analyses.FIFOTandemAnalysis;
import org.networkcalculus.dnc.tandem.fifo.NestedTandemAnalysis;
import org.networkcalculus.dnc.tandem.fifo.TNode;
import org.networkcalculus.dnc.test.feedforward_networks.*;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Lukas Herll
 *
 * Constructs a specific network with two crossflows where the independent optimisation of both FIFO parameters does
 * not coincide with the overall optimal result.
 * Runs the OpTreeAnalysis on it and computes the problem's Hessian matrix.
 */
public class DemoHessian {

    /**
     * Creates a network with two crossflows. The rates of the crossflows are chosen such that an delay bound
     * optimisation should yield the following: set s_1 = 0, set s_2 to that value at which both left over curves intersect
     * (in the convolution) at the height of the foi's burst, i.e. the resulting PA curve exhibits a kink at the height
     * of the foi's burst, but has not effective initial horizontal jump.
     *
     * Increasing s_2 beyond that point, increases the delay bound.
     * TODO: test whether increasing both parameters at the appropriate rates (the kink has to remain at the height of the
     *  foi's burst) still increases the delay bound (should)
     * TODO: test a scenario, in which the increase in both parameters would yield a better result and potentially plot
     *  s_2(s_1) for different values to show a dependence
     *
     * The Hessian evaluates to zero
     * TODO: why are all elements identical? Shouldn't there be at least a difference between the diagonal and off-diagonal
     *  elements?
     * TODO: does the Hessian always evaluate to zero for piecewise linear curves?
     *
     * @param args
     */
    public static void main(String[] args){
        //create the nesting tree
        TNode nestingTree = null;
        try{
            nestingTree = createNetwork();
        } catch (Exception e){
            e.printStackTrace();
        }

        //create the OpTree
        OpTreeAnalysis ota = new OpTreeAnalysis(nestingTree);
        BinOperatorPlugin plugin = new DiffLUDBPlugin();

        /*
        ArrayList<Double> initialGuess = new ArrayList<Double>();
        double a = 0;
        initialGuess.add(a);
        initialGuess.add(a);
         */

        ota.runConvexityAnalysis(plugin);

        DifferentialFunction<DoubleReal> symbolicTerm = ota.getSymbolicTerm().getTerm();
        ArrayList<Variable<DoubleReal>> parameters = ota.getParameters();

        Variable<DoubleReal> s_1 = parameters.get(0);
        Variable<DoubleReal> s_2 = parameters.get(1);
        s_1.set(new DoubleReal(0));
        //theoretical optimum of s_2 for s_1 = 0
        s_2.set(new DoubleReal(7));

        System.out.println(String.format("hDev(s_1 = %f, s_2 = %f) = %f", s_1.getValue().doubleValue(),
                s_2.getValue().doubleValue(), symbolicTerm.getValue().doubleValue()));

        //test whether the delay bound indeed increases when s_1 increases
        s_2.set(new DoubleReal(7.5));
        System.out.println(String.format("hDev(s_1 = %f, s_2 = %f) = %f", s_1.getValue().doubleValue(),
                s_2.getValue().doubleValue(), symbolicTerm.getValue().doubleValue()));
        s_2.set(new DoubleReal(8));
        System.out.println(String.format("hDev(s_1 = %f, s_2 = %f) = %f", s_1.getValue().doubleValue(),
                s_2.getValue().doubleValue(), symbolicTerm.getValue().doubleValue()));

    //Hessian:
    //{Variable@940} "s_f1" -> {BinaryConditional@951} "((0.0 if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0) if (((40.0-(10.0*s_f2))*0.1111111111111111) if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else ((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0)"
    //{Variable@942} "s_f2" -> {BinaryConditional@952} "((0.0 if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0) if (((40.0-(10.0*s_f2))*0.1111111111111111) if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else ((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0)"
    //{Variable@940} "s_f1" -> {BinaryConditional@960} "((0.0 if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0) if (((40.0-(10.0*s_f2))*0.1111111111111111) if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else ((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0)"
    //{Variable@942} "s_f2" -> {BinaryConditional@961} "((0.0 if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0) if (((40.0-(10.0*s_f2))*0.1111111111111111) if (((40.0-(10.0*s_f2))*0.1111111111111111)-((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else ((40.0-(4.0*s_f1))*0.3333333333333333)) > 0 else 0.0)"

    //simplified: sf_2 -> ((0.0) if ((...) if (...) > 0 else (...)) > 0 else 0.0) -> 0.0
    }




    public static TNode createNetwork() throws Exception{

        //specify the service curves
        ServiceCurve service_curve_1 = Curve.getFactory().createRateLatency(4, 4);
        ServiceCurve service_curve_2 = Curve.getFactory().createRateLatency(10, 10);
        MaxServiceCurve max_service_curve = Curve.getFactory().createRateLatencyMSC(100.0e6, 0.001);

        ServerGraph sg = new ServerGraph();

        //create the servers
        int numServers = 2;
        Server[] servers = new Server[numServers];

        servers[0] = sg.addServer(service_curve_1, max_service_curve);
        servers[0].useMaxSC(false);
        servers[0].useMaxScRate(false);
        servers[1] = sg.addServer(service_curve_2, max_service_curve);
        servers[1].useMaxSC(false);
        servers[1].useMaxScRate(false);

        //define the connections between servers
        Turn t_0_1 = sg.addTurn(servers[0], servers[1]);

        //define the arrival curves
        ArrivalCurve arrival_curve_foi = Curve.getFactory().createTokenBucket(1, 40);
        ArrivalCurve arrival_curve_f1 = Curve.getFactory().createTokenBucket(1, 2);
        ArrivalCurve arrival_curve_f2 = Curve.getFactory().createTokenBucket(1, 2);

        //define the paths
        // Turns need to be ordered from source server to sink server when defining a
        // path manually

        //path: 0,1
        Flow foi = sg.addFlow("foi", arrival_curve_foi, servers[0], servers[1]);
        //path 0,0
        sg.addFlow("f1", arrival_curve_f1, servers[0]);
        //path 1,1
        sg.addFlow("f2", arrival_curve_f2, servers[1]);


        NestedTandemAnalysis nta = new NestedTandemAnalysis(sg.getShortestPath(servers[0], servers[1]), foi, sg.getFlows());

        TNode nestingTree = nta.onlyComputeNestingTree();
        printTree(nestingTree, foi);

        return nestingTree;

    }


    //code um den Tree zu printen:
    private static void printTree(TNode subtree, Flow foi) {
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


}
