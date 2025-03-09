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

public class random_ff_9 implements ServerGraphFactory {
	private ServerGraph sg;
	private static CurveFactory_Affine factory = Curve.getFactory();

	public void createServers1( ServerGraph sg, Server[] servers ) throws Exception {
		servers[0] = sg.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),19.989500078944904}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[16] = sg.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),4.874412583981597}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[15] = sg.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),12.969194716502079}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[8] = sg.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),9.203746895741041}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[19] = sg.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),10.020415156500384}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[18] = sg.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),10.450241662114983}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[1] = sg.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),16.85676123886206}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[13] = sg.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),2.6414140258328476}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[20] = sg.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),9.526371739950141}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[6] = sg.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),4.426824452695658}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[21] = sg.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),12.048342782103227}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[11] = sg.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),6.472692892305722}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[23] = sg.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),3.2469758061728955}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[3] = sg.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),5.099556738797257}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[5] = sg.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),5.580535826537479}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[7] = sg.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),13.59746735105466}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[9] = sg.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),5.1518028312455435}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[10] = sg.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),14.768770438723635}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[12] = sg.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),18.541390066814813}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[14] = sg.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),3.4129341065712144}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[22] = sg.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),7.424528184610299}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[4] = sg.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),9.043837776359904}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[17] = sg.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),22.494779667073708}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[2] = sg.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),11.698190983105247}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
	}

	public void createTurns1( ServerGraph sg, Server[] servers ) throws Exception {
		sg.addTurn( "t4", servers[0], servers[19] );
		sg.addTurn( "t8", servers[2], servers[20] );
		sg.addTurn( "t10", servers[18], servers[22] );
		sg.addTurn( "t3", servers[10], servers[9] );
		sg.addTurn( "t25", servers[15], servers[9] );
		sg.addTurn( "t7", servers[6], servers[15] );
		sg.addTurn( "t11", servers[18], servers[23] );
		sg.addTurn( "t22", servers[1], servers[18] );
		sg.addTurn( "t24", servers[15], servers[7] );
		sg.addTurn( "t27", servers[16], servers[8] );
		sg.addTurn( "t19", servers[13], servers[21] );
		sg.addTurn( "t23", servers[8], servers[14] );
		sg.addTurn( "t16", servers[12], servers[23] );
		sg.addTurn( "t12", servers[21], servers[17] );
		sg.addTurn( "t9", servers[19], servers[3] );
		sg.addTurn( "t14", servers[4], servers[12] );
		sg.addTurn( "t15", servers[12], servers[21] );
		sg.addTurn( "t18", servers[22], servers[11] );
		sg.addTurn( "t1", servers[7], servers[12] );
		sg.addTurn( "t20", servers[13], servers[22] );
		sg.addTurn( "t2", servers[10], servers[8] );
		sg.addTurn( "t21", servers[17], servers[0] );
		sg.addTurn( "t26", servers[16], servers[7] );
		sg.addTurn( "t0", servers[7], servers[11] );
		sg.addTurn( "t5", servers[20], servers[1] );
		sg.addTurn( "t17", servers[22], servers[10] );
		sg.addTurn( "t6", servers[5], servers[2] );
		sg.addTurn( "t13", servers[4], servers[10] );
	}

	public void createFlows1( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		sg.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[0] );
		sg.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public random_ff_9() {
		sg = createServerGraph();
	}

	public ServerGraph createServerGraph() {
		Server[] servers = new Server[24];
		sg = new ServerGraph();
		try{
			createServers1( sg, servers );
			createTurns1( sg, servers );
			createFlows1( sg, servers );
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
