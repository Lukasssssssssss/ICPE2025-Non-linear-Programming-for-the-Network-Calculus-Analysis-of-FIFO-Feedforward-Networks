/* 
 * This file is compatible with the Deterministic Network Calculator (DNC) v2.7.
 *
 * The Deterministic Network Calculator (DNC) is free software;
 * you can redistribute it and/or modify it under the terms of the 
 * GNU Lesser General Public License as published by the Free Software Foundation; 
 * either version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 * 
 */

package org.networkcalculus.dnc.test.feedforward_networks;

import java.util.LinkedList;

import org.networkcalculus.dnc.AnalysisConfig.Multiplexing;
import org.networkcalculus.dnc.curves.Curve;
import org.networkcalculus.dnc.curves.CurveFactory_Affine;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;
import org.networkcalculus.dnc.network.server_graph.ServerGraphFactory;

public class random_ff_26 implements ServerGraphFactory {
	private ServerGraph sg;
	private static CurveFactory_Affine factory = Curve.getFactory();

	public void createServers1( ServerGraph sg, Server[] servers ) throws Exception {
		servers[19] = sg.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),17.796483201523323}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[33] = sg.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),3.2662744169580864}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[15] = sg.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),3.163940482815765}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[11] = sg.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),24.962283231316462}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[13] = sg.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),14.293238427528326}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[18] = sg.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),11.784773963355239}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[17] = sg.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),7.923380572902079}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[0] = sg.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),9.095195120704291}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[23] = sg.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),16.54263881731385}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[26] = sg.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),13.044709837411771}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[4] = sg.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),44.1368669835241}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[31] = sg.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),35.40453029043724}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[32] = sg.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),11.956362068896171}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[16] = sg.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),7.894956316510803}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[20] = sg.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),12.678182155900636}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[24] = sg.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),3.3771075080486637}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[28] = sg.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),6.196735047921167}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[22] = sg.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),16.622414415167924}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[7] = sg.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),8.444447486459206}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[25] = sg.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),4.23603818220554}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[6] = sg.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),2.094373481073643}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[2] = sg.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),4.788429490831793}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[30] = sg.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),19.860000474553257}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[3] = sg.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),20.259284508597677}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[21] = sg.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),13.286347494832516}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[29] = sg.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),13.734704563152164}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[9] = sg.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),18.24628274555996}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[5] = sg.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),19.867907119323277}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[8] = sg.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),7.678256940086143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[12] = sg.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),38.19873331053169}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[1] = sg.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),13.740217995416675}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[27] = sg.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),4.6100433241955505}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[10] = sg.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),23.15850627866569}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[14] = sg.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),9.187403822965022}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
	}

	public void createTurns1( ServerGraph sg, Server[] servers ) throws Exception {
		sg.addTurn( "t19", servers[11], servers[30] );
		sg.addTurn( "t1", servers[20], servers[3] );
		sg.addTurn( "t33", servers[9], servers[29] );
		sg.addTurn( "t3", servers[20], servers[5] );
		sg.addTurn( "t56", servers[0], servers[33] );
		sg.addTurn( "t40", servers[12], servers[21] );
		sg.addTurn( "t35", servers[9], servers[32] );
		sg.addTurn( "t60", servers[7], servers[5] );
		sg.addTurn( "t22", servers[31], servers[12] );
		sg.addTurn( "t67", servers[21], servers[6] );
		sg.addTurn( "t26", servers[25], servers[26] );
		sg.addTurn( "t57", servers[7], servers[2] );
		sg.addTurn( "t21", servers[11], servers[33] );
		sg.addTurn( "t54", servers[0], servers[30] );
		sg.addTurn( "t27", servers[25], servers[27] );
		sg.addTurn( "t2", servers[20], servers[4] );
		sg.addTurn( "t12", servers[29], servers[6] );
		sg.addTurn( "t58", servers[7], servers[3] );
		sg.addTurn( "t16", servers[8], servers[32] );
		sg.addTurn( "t52", servers[15], servers[22] );
		sg.addTurn( "t42", servers[16], servers[11] );
		sg.addTurn( "t64", servers[21], servers[2] );
		sg.addTurn( "t59", servers[7], servers[4] );
		sg.addTurn( "t4", servers[20], servers[6] );
		sg.addTurn( "t41", servers[12], servers[23] );
		sg.addTurn( "t45", servers[10], servers[27] );
		sg.addTurn( "t46", servers[10], servers[28] );
		sg.addTurn( "t39", servers[22], servers[13] );
		sg.addTurn( "t6", servers[4], servers[31] );
		sg.addTurn( "t25", servers[14], servers[16] );
		sg.addTurn( "t10", servers[29], servers[3] );
		sg.addTurn( "t51", servers[15], servers[21] );
		sg.addTurn( "t55", servers[0], servers[31] );
		sg.addTurn( "t62", servers[5], servers[22] );
		sg.addTurn( "t49", servers[24], servers[28] );
		sg.addTurn( "t48", servers[24], servers[26] );
		sg.addTurn( "t7", servers[4], servers[32] );
		sg.addTurn( "t18", servers[11], servers[29] );
		sg.addTurn( "t32", servers[19], servers[6] );
		sg.addTurn( "t34", servers[9], servers[31] );
		sg.addTurn( "t15", servers[8], servers[31] );
		sg.addTurn( "t5", servers[4], servers[30] );
		sg.addTurn( "t29", servers[19], servers[2] );
		sg.addTurn( "t0", servers[1], servers[19] );
		sg.addTurn( "t20", servers[11], servers[32] );
		sg.addTurn( "t36", servers[9], servers[33] );
		sg.addTurn( "t53", servers[0], servers[29] );
		sg.addTurn( "t28", servers[3], servers[18] );
		sg.addTurn( "t65", servers[21], servers[3] );
		sg.addTurn( "t37", servers[30], servers[10] );
		sg.addTurn( "t8", servers[4], servers[33] );
		sg.addTurn( "t23", servers[31], servers[13] );
		sg.addTurn( "t47", servers[26], servers[9] );
		sg.addTurn( "t63", servers[5], servers[23] );
		sg.addTurn( "t9", servers[29], servers[2] );
		sg.addTurn( "t38", servers[22], servers[11] );
		sg.addTurn( "t43", servers[16], servers[12] );
		sg.addTurn( "t14", servers[8], servers[30] );
		sg.addTurn( "t30", servers[19], servers[4] );
		sg.addTurn( "t31", servers[19], servers[5] );
		sg.addTurn( "t13", servers[8], servers[29] );
		sg.addTurn( "t44", servers[13], servers[17] );
	}

	public void createFlows1( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows2( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public random_ff_26() {
		sg = createServerGraph();
	}

	public ServerGraph createServerGraph() {
		Server[] servers = new Server[34];
		sg = new ServerGraph();
		try{
			createServers1( sg, servers );
			createTurns1( sg, servers );
			createFlows1( sg, servers );
			createFlows2( sg, servers );
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sg;
	}

	public ServerGraph getServerGraph() {
		return sg;
	}

	public void reinitializeCurves() {
		sg = createServerGraph();
	}
}
