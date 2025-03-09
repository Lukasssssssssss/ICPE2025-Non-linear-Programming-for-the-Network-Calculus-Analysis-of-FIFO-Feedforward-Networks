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

public class random_ff_32 implements ServerGraphFactory {
	private ServerGraph sg;
	private static CurveFactory_Affine factory = Curve.getFactory();

	public void createServers1( ServerGraph sg, Server[] servers ) throws Exception {
		servers[0] = sg.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),10.777803301220874}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[22] = sg.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),24.918716385157847}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[18] = sg.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),14.392586650178481}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[27] = sg.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),8.16664239414076}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[26] = sg.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),53.848134537204814}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[32] = sg.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),10.79254562981687}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[35] = sg.addServer( "s35", factory.createServiceCurve( "SC{(0.0,0.0),10.448527002901862}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[4] = sg.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),7.167139152497862}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[11] = sg.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),10.379154375848458}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[39] = sg.addServer( "s39", factory.createServiceCurve( "SC{(0.0,0.0),31.817724212663734}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[24] = sg.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),8.346524036477101}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[41] = sg.addServer( "s41", factory.createServiceCurve( "SC{(0.0,0.0),9.393289034341997}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[46] = sg.addServer( "s46", factory.createServiceCurve( "SC{(0.0,0.0),20.82756039404614}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[16] = sg.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),16.12485543476577}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[8] = sg.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),23.872989977031907}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[49] = sg.addServer( "s49", factory.createServiceCurve( "SC{(0.0,0.0),71.9834528982151}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[7] = sg.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),11.881823571573968}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[33] = sg.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),12.4152111137369}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[30] = sg.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),6.455063548880965}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[12] = sg.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),15.80972376136645}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[44] = sg.addServer( "s44", factory.createServiceCurve( "SC{(0.0,0.0),60.05652485686145}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[14] = sg.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),56.6140357428927}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[42] = sg.addServer( "s42", factory.createServiceCurve( "SC{(0.0,0.0),101.22759102897439}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[1] = sg.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),16.33201575824982}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[52] = sg.addServer( "s52", factory.createServiceCurve( "SC{(0.0,0.0),83.45116960948324}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[31] = sg.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),7.057739054585215}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[5] = sg.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),10.103510223650376}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[10] = sg.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),7.575828467025139}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[55] = sg.addServer( "s55", factory.createServiceCurve( "SC{(0.0,0.0),32.47805448478963}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[19] = sg.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),17.875811928337143}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[23] = sg.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),18.20168960342945}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[36] = sg.addServer( "s36", factory.createServiceCurve( "SC{(0.0,0.0),12.14992813401596}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[38] = sg.addServer( "s38", factory.createServiceCurve( "SC{(0.0,0.0),43.860066677836215}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[40] = sg.addServer( "s40", factory.createServiceCurve( "SC{(0.0,0.0),127.03444258733506}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[34] = sg.addServer( "s34", factory.createServiceCurve( "SC{(0.0,0.0),33.170223802398596}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[20] = sg.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),16.661494509209913}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[47] = sg.addServer( "s47", factory.createServiceCurve( "SC{(0.0,0.0),87.93175113769504}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[13] = sg.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),15.46590373332221}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[15] = sg.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),28.79514827003485}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[51] = sg.addServer( "s51", factory.createServiceCurve( "SC{(0.0,0.0),28.327114648178128}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[29] = sg.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),15.417025688620466}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[45] = sg.addServer( "s45", factory.createServiceCurve( "SC{(0.0,0.0),29.45592148529617}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[53] = sg.addServer( "s53", factory.createServiceCurve( "SC{(0.0,0.0),5.029684451811462}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[6] = sg.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),5.127269873437099}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[25] = sg.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),11.842318065419704}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[37] = sg.addServer( "s37", factory.createServiceCurve( "SC{(0.0,0.0),41.65035869925856}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[43] = sg.addServer( "s43", factory.createServiceCurve( "SC{(0.0,0.0),36.03032367307534}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[28] = sg.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),21.894979653646413}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[3] = sg.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),12.153468455194316}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[21] = sg.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),22.15102363671958}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[54] = sg.addServer( "s54", factory.createServiceCurve( "SC{(0.0,0.0),7.805119147725468}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[50] = sg.addServer( "s50", factory.createServiceCurve( "SC{(0.0,0.0),15.645520381307092}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[17] = sg.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),25.032613429559987}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[2] = sg.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),53.42498095706318}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[9] = sg.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),20.931473624676354}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[48] = sg.addServer( "s48", factory.createServiceCurve( "SC{(0.0,0.0),29.80657115026905}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
	}

	public void createTurns1( ServerGraph sg, Server[] servers ) throws Exception {
		sg.addTurn( "t11", servers[26], servers[40] );
		sg.addTurn( "t2", servers[14], servers[40] );
		sg.addTurn( "t42", servers[25], servers[30] );
		sg.addTurn( "t32", servers[40], servers[42] );
		sg.addTurn( "t68", servers[49], servers[53] );
		sg.addTurn( "t20", servers[51], servers[21] );
		sg.addTurn( "t46", servers[36], servers[9] );
		sg.addTurn( "t30", servers[44], servers[38] );
		sg.addTurn( "t3", servers[38], servers[15] );
		sg.addTurn( "t44", servers[29], servers[27] );
		sg.addTurn( "t62", servers[11], servers[51] );
		sg.addTurn( "t29", servers[44], servers[37] );
		sg.addTurn( "t47", servers[24], servers[20] );
		sg.addTurn( "t57", servers[6], servers[25] );
		sg.addTurn( "t17", servers[47], servers[43] );
		sg.addTurn( "t67", servers[49], servers[51] );
		sg.addTurn( "t41", servers[31], servers[19] );
		sg.addTurn( "t63", servers[11], servers[52] );
		sg.addTurn( "t84", servers[55], servers[2] );
		sg.addTurn( "t25", servers[34], servers[38] );
		sg.addTurn( "t8", servers[28], servers[7] );
		sg.addTurn( "t55", servers[43], servers[18] );
		sg.addTurn( "t14", servers[37], servers[28] );
		sg.addTurn( "t58", servers[6], servers[26] );
		sg.addTurn( "t33", servers[40], servers[43] );
		sg.addTurn( "t75", servers[5], servers[17] );
		sg.addTurn( "t28", servers[23], servers[45] );
		sg.addTurn( "t7", servers[8], servers[27] );
		sg.addTurn( "t83", servers[55], servers[1] );
		sg.addTurn( "t85", servers[3], servers[54] );
		sg.addTurn( "t61", servers[11], servers[50] );
		sg.addTurn( "t64", servers[52], servers[47] );
		sg.addTurn( "t80", servers[12], servers[3] );
		sg.addTurn( "t72", servers[48], servers[46] );
		sg.addTurn( "t27", servers[39], servers[33] );
		sg.addTurn( "t50", servers[15], servers[3] );
		sg.addTurn( "t37", servers[9], servers[53] );
		sg.addTurn( "t6", servers[8], servers[26] );
		sg.addTurn( "t48", servers[24], servers[22] );
		sg.addTurn( "t24", servers[34], servers[37] );
		sg.addTurn( "t69", servers[4], servers[55] );
		sg.addTurn( "t70", servers[45], servers[47] );
		sg.addTurn( "t82", servers[32], servers[8] );
		sg.addTurn( "t5", servers[8], servers[25] );
		sg.addTurn( "t31", servers[44], servers[39] );
		sg.addTurn( "t10", servers[26], servers[39] );
		sg.addTurn( "t13", servers[37], servers[27] );
		sg.addTurn( "t18", servers[47], servers[44] );
		sg.addTurn( "t59", servers[6], servers[28] );
		sg.addTurn( "t35", servers[9], servers[51] );
		sg.addTurn( "t76", servers[5], servers[18] );
		sg.addTurn( "t9", servers[26], servers[38] );
		sg.addTurn( "t49", servers[15], servers[1] );
		sg.addTurn( "t19", servers[51], servers[20] );
		sg.addTurn( "t77", servers[0], servers[21] );
		sg.addTurn( "t43", servers[29], servers[26] );
		sg.addTurn( "t52", servers[2], servers[16] );
		sg.addTurn( "t56", servers[43], servers[19] );
		sg.addTurn( "t86", servers[35], servers[14] );
		sg.addTurn( "t26", servers[34], servers[40] );
		sg.addTurn( "t54", servers[17], servers[44] );
		sg.addTurn( "t22", servers[22], servers[52] );
		sg.addTurn( "t15", servers[42], servers[48] );
		sg.addTurn( "t16", servers[42], servers[49] );
		sg.addTurn( "t73", servers[41], servers[29] );
		sg.addTurn( "t23", servers[22], servers[53] );
		sg.addTurn( "t79", servers[12], servers[2] );
		sg.addTurn( "t34", servers[50], servers[10] );
		sg.addTurn( "t45", servers[29], servers[28] );
		sg.addTurn( "t36", servers[9], servers[52] );
		sg.addTurn( "t51", servers[2], servers[14] );
		sg.addTurn( "t0", servers[14], servers[37] );
		sg.addTurn( "t53", servers[17], servers[42] );
		sg.addTurn( "t39", servers[13], servers[34] );
		sg.addTurn( "t78", servers[0], servers[22] );
		sg.addTurn( "t1", servers[14], servers[39] );
		sg.addTurn( "t21", servers[22], servers[50] );
		sg.addTurn( "t71", servers[45], servers[49] );
		sg.addTurn( "t87", servers[35], servers[15] );
		sg.addTurn( "t4", servers[38], servers[16] );
		sg.addTurn( "t12", servers[37], servers[25] );
		sg.addTurn( "t65", servers[52], servers[48] );
		sg.addTurn( "t66", servers[49], servers[50] );
		sg.addTurn( "t40", servers[31], servers[17] );
	}

	public void createFlows1( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f129", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f205", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f143", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f230", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		sg.addFlow( "f193", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f125", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f212", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f133", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f136", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f119", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f150", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f221", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f116", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f175", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f130", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f112", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		sg.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		sg.addFlow( "f192", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		sg.addFlow( "f210", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f137", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f113", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f183", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f232", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f186", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f138", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f152", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		sg.addFlow( "f131", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f189", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f181", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f165", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f164", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f172", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f110", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f168", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f201", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f231", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f199", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f153", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows2( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f159", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f122", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f182", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		sg.addFlow( "f115", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f160", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f139", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f237", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f132", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f204", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f124", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f208", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f194", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f203", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f217", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f114", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f196", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		sg.addFlow( "f120", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f104", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f171", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f200", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f213", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f187", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f149", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f126", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f162", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f240", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f151", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f238", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f216", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f233", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f106", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f156", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f142", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		sg.addFlow( "f220", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f161", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f185", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f218", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f226", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f121", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f184", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows3( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f242", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f135", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f140", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f223", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f118", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f234", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f117", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f128", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f227", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f154", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f148", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		sg.addFlow( "f167", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		sg.addFlow( "f222", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f214", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f105", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f191", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f190", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f179", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f239", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f145", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f163", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f103", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f228", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f144", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		sg.addFlow( "f209", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f207", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f188", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f235", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f111", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		sg.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f173", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f241", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f146", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f180", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f176", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f229", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[48] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f134", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f147", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f215", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f178", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f155", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows4( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f225", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f243", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f177", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		sg.addFlow( "f141", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f169", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f109", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f202", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f224", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f195", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[54] );
		sg.addFlow( "f219", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[18] );
		sg.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f206", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f108", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f157", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f174", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		sg.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f107", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		sg.addFlow( "f166", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		sg.addFlow( "f236", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f158", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[37] );
		sg.addFlow( "f211", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[1] );
		sg.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f170", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[43] );
		sg.addFlow( "f123", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f127", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f198", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[49] );
		servers_on_path_s.add( servers[51] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f197", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public random_ff_32() {
		sg = createServerGraph();
	}

	public ServerGraph createServerGraph() {
		Server[] servers = new Server[56];
		sg = new ServerGraph();
		try{
			createServers1( sg, servers );
			createTurns1( sg, servers );
			createFlows1( sg, servers );
			createFlows2( sg, servers );
			createFlows3( sg, servers );
			createFlows4( sg, servers );
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
