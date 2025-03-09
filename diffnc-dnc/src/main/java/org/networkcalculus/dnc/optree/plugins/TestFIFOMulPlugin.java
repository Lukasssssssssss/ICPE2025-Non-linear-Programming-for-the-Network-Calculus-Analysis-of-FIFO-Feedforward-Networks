package org.networkcalculus.dnc.optree.plugins;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.Constant;
import nilgiri.math.autodiff.Variable;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.optree.constraints.Constraint;
import org.networkcalculus.dnc.optree.nodes.OpTNode;
import org.networkcalculus.dnc.optree.nodes.OpTSymbolicNode;
import org.networkcalculus.dnc.optree.symbolic.RLServiceSymbolic;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.optree.symbolic.TBArrivalSymbolic;

import java.util.ArrayList;

/**
 * @author Lukas Herll
 *
 * An exemplary plugin to compute the symbolic term of a binary operator tree with FIFO multiplexing
 */
public class TestFIFOMulPlugin extends AbstractFIFOMulPlugin{
    @Override
    protected SymbolicTerm computeSymbolicTermFromFlow(Flow flow) {
        Constant<DoubleReal> r = super.createConstant(flow.getId()+1);
        Constant<DoubleReal> B = super.createConstant(flow.getId());
        //Constant<DoubleReal> r = super.createConstant(flow.getArrivalCurve().getUltAffineRate().doubleValue());
        //Constant<DoubleReal> B = super.createConstant(flow.getArrivalCurve().getBurst().doubleValue());
        return new TBArrivalSymbolic(r, B, super.getVariable(), zero);
    }

    @Override
    protected SymbolicTerm computeSymbolicTermFromServer(Server server) {
        Constant<DoubleReal> R = super.createConstant(server.getId()+5);
        Constant<DoubleReal> L = super.createConstant(server.getId()+1);
        //Constant<DoubleReal> R = super.createConstant(server.getServiceCurve().getUltAffineRate().doubleValue());
        //Constant<DoubleReal> L = super.createConstant(server.getServiceCurve().getLatency().doubleValue());
        return new RLServiceSymbolic(R, L, super.getVariable(), super.zero);
    }

    @Override
    public ArrayList<Constraint> deriveConstraints(OpTNode root) {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Constraint> deriveConstraints(OpTSymbolicNode root) {
        return new ArrayList<>();
    }
}
