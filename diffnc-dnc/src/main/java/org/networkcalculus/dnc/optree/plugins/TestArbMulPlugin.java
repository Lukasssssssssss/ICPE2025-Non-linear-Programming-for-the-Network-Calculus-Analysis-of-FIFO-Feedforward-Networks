package org.networkcalculus.dnc.optree.plugins;

import nilgiri.math.DoubleReal;
import nilgiri.math.autodiff.Constant;
import nilgiri.math.autodiff.Variable;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.optree.nodes.OpTNode;
import org.networkcalculus.dnc.optree.constraints.Constraint;
import org.networkcalculus.dnc.optree.constraints.ConstraintType;
import org.networkcalculus.dnc.optree.nodes.OpTSymbolicNode;
import org.networkcalculus.dnc.optree.symbolic.RLServiceSymbolic;
import org.networkcalculus.dnc.optree.symbolic.SymbolicTerm;
import org.networkcalculus.dnc.optree.symbolic.TBArrivalSymbolic;

import java.util.ArrayList;

/**
 * @author Lukas Herll
 *
 * An exemplary plugin to compute the symbolic term of a binary operator tree with arbitrary multiplexing
 */
public class TestArbMulPlugin extends AbstractArbMulPlugin {
    @Override
    public SymbolicTerm computeSymbolicTermFromFlow(Flow flow) {
        Constant<DoubleReal> r = super.createConstant(flow.getId()+1);
        Constant<DoubleReal> B = super.createConstant(2*(flow.getId()+1));
        return new TBArrivalSymbolic(r, B, super.getVariable(), zero);
    }

    @Override
    public SymbolicTerm computeSymbolicTermFromServer(Server server) {
        Constant<DoubleReal> R = super.createConstant(3*(server.getId()+1));
        Variable<DoubleReal> L = super.createOpenParameter(String.format("L_%d", server.getId()), 1);
        createBound(L, 0, null);
        return new RLServiceSymbolic(R, L, super.getVariable(), super.zero);
    }

    @Override
    public ArrayList<Constraint> deriveConstraints(OpTNode root) {
        ArrayList<Constraint> constraints = new ArrayList<>();
        Constant<DoubleReal> min_value = super.createConstant(5/3);
        Constraint constraint = createConstraint(ConstraintType.INEQ, root.getSymbolicTerm().getTerm().minus(min_value));

        constraints.add(constraint);
        return constraints;
    }

    @Override
    public ArrayList<Constraint> deriveConstraints(OpTSymbolicNode root) {
        return new ArrayList<>();
    }

}
