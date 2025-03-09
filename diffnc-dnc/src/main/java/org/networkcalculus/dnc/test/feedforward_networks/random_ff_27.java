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

public class random_ff_27 implements ServerGraphFactory {
	private ServerGraph sg;
	private static CurveFactory_Affine factory = Curve.getFactory();

	public void createServers1( ServerGraph sg, Server[] servers ) throws Exception {
		servers[56] = sg.addServer( "s56", factory.createServiceCurve( "SC{(0.0,0.0),22.459808992394407}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[30] = sg.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),18.41278432898218}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[46] = sg.addServer( "s46", factory.createServiceCurve( "SC{(0.0,0.0),20.176383246413064}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[45] = sg.addServer( "s45", factory.createServiceCurve( "SC{(0.0,0.0),33.120041981917424}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[36] = sg.addServer( "s36", factory.createServiceCurve( "SC{(0.0,0.0),11.899270656571108}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[47] = sg.addServer( "s47", factory.createServiceCurve( "SC{(0.0,0.0),63.507843540113086}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[25] = sg.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),17.10780319225291}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[9] = sg.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),30.51892436564458}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[28] = sg.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),151.37018215006282}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[67] = sg.addServer( "s67", factory.createServiceCurve( "SC{(0.0,0.0),59.56163526687162}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[64] = sg.addServer( "s64", factory.createServiceCurve( "SC{(0.0,0.0),19.994975282937638}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[60] = sg.addServer( "s60", factory.createServiceCurve( "SC{(0.0,0.0),19.637358007348283}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[24] = sg.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),68.60771993357318}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[26] = sg.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),16.247217638817492}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[34] = sg.addServer( "s34", factory.createServiceCurve( "SC{(0.0,0.0),14.94820555654748}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[2] = sg.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),39.69104803590791}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[48] = sg.addServer( "s48", factory.createServiceCurve( "SC{(0.0,0.0),21.153914942030724}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[33] = sg.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),14.769078910731185}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[40] = sg.addServer( "s40", factory.createServiceCurve( "SC{(0.0,0.0),64.01807284465343}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[58] = sg.addServer( "s58", factory.createServiceCurve( "SC{(0.0,0.0),11.378222427035412}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[65] = sg.addServer( "s65", factory.createServiceCurve( "SC{(0.0,0.0),119.23181733580317}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[52] = sg.addServer( "s52", factory.createServiceCurve( "SC{(0.0,0.0),34.910565640665766}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[23] = sg.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),192.8021649094065}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[12] = sg.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),44.334213426636154}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[14] = sg.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),20.51515881165443}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[3] = sg.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),75.30206566061472}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[53] = sg.addServer( "s53", factory.createServiceCurve( "SC{(0.0,0.0),21.699751670698966}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[43] = sg.addServer( "s43", factory.createServiceCurve( "SC{(0.0,0.0),8.613456371009546}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[38] = sg.addServer( "s38", factory.createServiceCurve( "SC{(0.0,0.0),10.143055632380422}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[6] = sg.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),16.083312323603515}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[22] = sg.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),26.94422736715936}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[1] = sg.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),16.704696075596388}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[17] = sg.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),68.09899896434494}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[10] = sg.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),37.6041154149546}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[15] = sg.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),35.575662811395304}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[44] = sg.addServer( "s44", factory.createServiceCurve( "SC{(0.0,0.0),79.3414336231251}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[49] = sg.addServer( "s49", factory.createServiceCurve( "SC{(0.0,0.0),15.726710150453437}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[4] = sg.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),14.666750279803958}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[50] = sg.addServer( "s50", factory.createServiceCurve( "SC{(0.0,0.0),24.95442788845317}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[13] = sg.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),61.260854022515076}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[66] = sg.addServer( "s66", factory.createServiceCurve( "SC{(0.0,0.0),56.950700479517224}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[35] = sg.addServer( "s35", factory.createServiceCurve( "SC{(0.0,0.0),24.45568797703627}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[39] = sg.addServer( "s39", factory.createServiceCurve( "SC{(0.0,0.0),69.86367858454521}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[8] = sg.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),82.85775465245655}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[41] = sg.addServer( "s41", factory.createServiceCurve( "SC{(0.0,0.0),53.55352798108564}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[5] = sg.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),81.00624767260855}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[29] = sg.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),35.71819552636454}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[16] = sg.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),137.61782843096077}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[62] = sg.addServer( "s62", factory.createServiceCurve( "SC{(0.0,0.0),24.914799894695197}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[0] = sg.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),20.17406515498473}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[59] = sg.addServer( "s59", factory.createServiceCurve( "SC{(0.0,0.0),21.36223777599822}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[18] = sg.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),18.149320498825794}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[54] = sg.addServer( "s54", factory.createServiceCurve( "SC{(0.0,0.0),24.57677863022458}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[55] = sg.addServer( "s55", factory.createServiceCurve( "SC{(0.0,0.0),8.526875433010426}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[61] = sg.addServer( "s61", factory.createServiceCurve( "SC{(0.0,0.0),22.183226431150473}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[19] = sg.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),19.30309190294417}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[7] = sg.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),21.046393521333748}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[31] = sg.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),19.00013727721762}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[57] = sg.addServer( "s57", factory.createServiceCurve( "SC{(0.0,0.0),20.610046954954072}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[20] = sg.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),87.98739927189509}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[37] = sg.addServer( "s37", factory.createServiceCurve( "SC{(0.0,0.0),11.86669972940025}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[11] = sg.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),20.983075750148252}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[42] = sg.addServer( "s42", factory.createServiceCurve( "SC{(0.0,0.0),41.663751215600676}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[21] = sg.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),115.83665794958301}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[27] = sg.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),14.780259970546556}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[51] = sg.addServer( "s51", factory.createServiceCurve( "SC{(0.0,0.0),11.558198257000853}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[32] = sg.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),130.06466707495088}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
		servers[63] = sg.addServer( "s63", factory.createServiceCurve( "SC{(0.0,0.0),32.98457938177811}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.FIFO, true, true );
	}

	public void createTurns1( ServerGraph sg, Server[] servers ) throws Exception {
		sg.addTurn( "t32", servers[54], servers[29] );
		sg.addTurn( "t67", servers[23], servers[30] );
		sg.addTurn( "t95", servers[7], servers[60] );
		sg.addTurn( "t2", servers[19], servers[27] );
		sg.addTurn( "t65", servers[23], servers[28] );
		sg.addTurn( "t13", servers[47], servers[67] );
		sg.addTurn( "t81", servers[10], servers[23] );
		sg.addTurn( "t87", servers[3], servers[31] );
		sg.addTurn( "t70", servers[53], servers[51] );
		sg.addTurn( "t77", servers[20], servers[9] );
		sg.addTurn( "t142", servers[44], servers[31] );
		sg.addTurn( "t58", servers[35], servers[20] );
		sg.addTurn( "t115", servers[4], servers[34] );
		sg.addTurn( "t123", servers[12], servers[65] );
		sg.addTurn( "t91", servers[64], servers[6] );
		sg.addTurn( "t11", servers[47], servers[64] );
		sg.addTurn( "t109", servers[8], servers[15] );
		sg.addTurn( "t40", servers[15], servers[2] );
		sg.addTurn( "t62", servers[32], servers[20] );
		sg.addTurn( "t53", servers[36], servers[33] );
		sg.addTurn( "t26", servers[63], servers[13] );
		sg.addTurn( "t57", servers[35], servers[19] );
		sg.addTurn( "t25", servers[14], servers[62] );
		sg.addTurn( "t102", servers[65], servers[45] );
		sg.addTurn( "t21", servers[58], servers[31] );
		sg.addTurn( "t38", servers[1], servers[17] );
		sg.addTurn( "t85", servers[3], servers[29] );
		sg.addTurn( "t126", servers[21], servers[13] );
		sg.addTurn( "t154", servers[40], servers[15] );
		sg.addTurn( "t49", servers[18], servers[12] );
		sg.addTurn( "t103", servers[39], servers[41] );
		sg.addTurn( "t27", servers[63], servers[15] );
		sg.addTurn( "t43", servers[37], servers[48] );
		sg.addTurn( "t28", servers[63], servers[16] );
		sg.addTurn( "t94", servers[5], servers[67] );
		sg.addTurn( "t14", servers[66], servers[48] );
		sg.addTurn( "t31", servers[54], servers[28] );
		sg.addTurn( "t119", servers[2], servers[27] );
		sg.addTurn( "t129", servers[21], servers[17] );
		sg.addTurn( "t113", servers[33], servers[5] );
		sg.addTurn( "t146", servers[0], servers[63] );
		sg.addTurn( "t1", servers[19], servers[26] );
		sg.addTurn( "t54", servers[36], servers[35] );
		sg.addTurn( "t82", servers[28], servers[4] );
		sg.addTurn( "t68", servers[23], servers[31] );
		sg.addTurn( "t12", servers[47], servers[65] );
		sg.addTurn( "t35", servers[1], servers[13] );
		sg.addTurn( "t83", servers[28], servers[5] );
		sg.addTurn( "t86", servers[3], servers[30] );
		sg.addTurn( "t96", servers[7], servers[61] );
		sg.addTurn( "t36", servers[1], servers[14] );
		sg.addTurn( "t125", servers[67], servers[11] );
		sg.addTurn( "t33", servers[54], servers[30] );
		sg.addTurn( "t143", servers[44], servers[32] );
		sg.addTurn( "t139", servers[29], servers[46] );
		sg.addTurn( "t99", servers[46], servers[66] );
		sg.addTurn( "t133", servers[16], servers[23] );
		sg.addTurn( "t9", servers[59], servers[25] );
		sg.addTurn( "t108", servers[8], servers[14] );
		sg.addTurn( "t4", servers[24], servers[21] );
		sg.addTurn( "t15", servers[66], servers[49] );
		sg.addTurn( "t114", servers[33], servers[6] );
		sg.addTurn( "t157", servers[17], servers[39] );
		sg.addTurn( "t51", servers[56], servers[39] );
		sg.addTurn( "t75", servers[6], servers[46] );
		sg.addTurn( "t140", servers[44], servers[28] );
		sg.addTurn( "t78", servers[10], servers[19] );
		sg.addTurn( "t121", servers[25], servers[1] );
		sg.addTurn( "t80", servers[10], servers[22] );
		sg.addTurn( "t17", servers[52], servers[42] );
		sg.addTurn( "t93", servers[5], servers[66] );
		sg.addTurn( "t151", servers[55], servers[49] );
		sg.addTurn( "t48", servers[61], servers[10] );
		sg.addTurn( "t118", servers[2], servers[26] );
		sg.addTurn( "t124", servers[12], servers[66] );
		sg.addTurn( "t148", servers[60], servers[2] );
		sg.addTurn( "t3", servers[24], servers[20] );
		sg.addTurn( "t107", servers[13], servers[10] );
		sg.addTurn( "t145", servers[0], servers[62] );
		sg.addTurn( "t69", servers[50], servers[52] );
		sg.addTurn( "t56", servers[22], servers[34] );
		sg.addTurn( "t111", servers[8], servers[17] );
		sg.addTurn( "t5", servers[24], servers[22] );
		sg.addTurn( "t10", servers[59], servers[27] );
		sg.addTurn( "t105", servers[42], servers[40] );
		sg.addTurn( "t60", servers[35], servers[23] );
		sg.addTurn( "t84", servers[28], servers[6] );
		sg.addTurn( "t156", servers[17], servers[38] );
		sg.addTurn( "t29", servers[63], servers[17] );
		sg.addTurn( "t44", servers[9], servers[60] );
		sg.addTurn( "t76", servers[20], servers[8] );
		sg.addTurn( "t100", servers[46], servers[67] );
		sg.addTurn( "t66", servers[23], servers[29] );
		sg.addTurn( "t127", servers[21], servers[14] );
		sg.addTurn( "t23", servers[14], servers[60] );
		sg.addTurn( "t141", servers[44], servers[30] );
		sg.addTurn( "t61", servers[32], servers[19] );
		sg.addTurn( "t104", servers[42], servers[38] );
		sg.addTurn( "t16", servers[41], servers[53] );
		sg.addTurn( "t110", servers[8], servers[16] );
		sg.addTurn( "t20", servers[58], servers[29] );
		sg.addTurn( "t37", servers[1], servers[16] );
		sg.addTurn( "t73", servers[45], servers[5] );
		sg.addTurn( "t122", servers[12], servers[64] );
		sg.addTurn( "t144", servers[0], servers[61] );
		sg.addTurn( "t52", servers[56], servers[40] );
		sg.addTurn( "t128", servers[21], servers[15] );
		sg.addTurn( "t41", servers[43], servers[50] );
		sg.addTurn( "t150", servers[55], servers[47] );
		sg.addTurn( "t97", servers[7], servers[63] );
		sg.addTurn( "t63", servers[32], servers[21] );
		sg.addTurn( "t22", servers[58], servers[32] );
		sg.addTurn( "t120", servers[25], servers[0] );
		sg.addTurn( "t153", servers[40], servers[14] );
		sg.addTurn( "t34", servers[54], servers[32] );
		sg.addTurn( "t136", servers[57], servers[26] );
		sg.addTurn( "t89", servers[64], servers[3] );
		sg.addTurn( "t155", servers[40], servers[16] );
		sg.addTurn( "t42", servers[37], servers[47] );
		sg.addTurn( "t72", servers[45], servers[4] );
		sg.addTurn( "t19", servers[58], servers[28] );
		sg.addTurn( "t134", servers[57], servers[24] );
		sg.addTurn( "t101", servers[65], servers[44] );
		sg.addTurn( "t59", servers[35], servers[21] );
		sg.addTurn( "t45", servers[9], servers[62] );
		sg.addTurn( "t152", servers[40], servers[13] );
		sg.addTurn( "t106", servers[13], servers[9] );
		sg.addTurn( "t8", servers[59], servers[24] );
		sg.addTurn( "t90", servers[64], servers[4] );
		sg.addTurn( "t6", servers[24], servers[23] );
		sg.addTurn( "t112", servers[33], servers[3] );
		sg.addTurn( "t88", servers[3], servers[32] );
		sg.addTurn( "t64", servers[32], servers[22] );
		sg.addTurn( "t132", servers[16], servers[22] );
		sg.addTurn( "t47", servers[61], servers[8] );
		sg.addTurn( "t135", servers[57], servers[25] );
		sg.addTurn( "t130", servers[16], servers[19] );
		sg.addTurn( "t71", servers[45], servers[3] );
	}

	public void createFlows1( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f146", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f214", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f383", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f122", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f218", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f244", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f316", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f201", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f136", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f299", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f266", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f209", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f314", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f293", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f331", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f181", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f302", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f341", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f361", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f145", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f412", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f375", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f379", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f319", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f289", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f414", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f207", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f373", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f306", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f216", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f158", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f320", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f411", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f300", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f150", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f243", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f339", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f178", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f144", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f192", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f151", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f387", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f180", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f249", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f310", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f258", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f104", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f139", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f143", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f169", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		sg.addFlow( "f260", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f301", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f282", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows2( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f296", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f423", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f422", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f420", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f357", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f226", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f424", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f112", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f409", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f227", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f223", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f190", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f359", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f311", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f405", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f154", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f168", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f240", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f220", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f438", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f416", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		sg.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f283", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f284", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f303", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f327", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f362", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		sg.addFlow( "f162", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f382", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f365", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f374", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f349", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f285", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f397", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f305", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f183", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[25] );
		sg.addFlow( "f211", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		sg.addFlow( "f160", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f237", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f257", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f224", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f435", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f298", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f171", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f370", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f433", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f182", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f161", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f105", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f263", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f432", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f111", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f297", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f393", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f270", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows3( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f324", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f328", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f329", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[64] );
		sg.addFlow( "f121", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f417", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f410", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f195", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f372", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f390", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f126", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f166", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f247", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f363", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f440", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f418", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f399", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f317", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f142", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f222", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f325", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f403", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f109", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f307", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f173", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f147", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f175", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f287", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		sg.addFlow( "f280", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f333", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f269", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f228", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f431", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f415", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f184", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f421", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f194", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f165", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f134", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f215", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f225", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f200", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f428", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f130", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f358", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f108", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f294", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f187", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f213", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f277", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		sg.addFlow( "f261", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f400", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f360", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f120", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows4( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f196", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f336", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f163", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f335", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f118", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f127", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f115", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f217", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f419", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f103", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f272", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f430", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		sg.addFlow( "f239", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f252", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		sg.addFlow( "f323", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f253", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f355", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f205", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f309", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f351", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f436", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f364", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f346", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f385", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f439", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f326", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f353", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f401", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f156", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f241", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f279", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f229", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f315", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f425", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f292", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f429", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f366", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f132", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f203", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f172", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f230", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f395", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f286", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f368", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f123", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f255", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f291", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f155", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f242", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f334", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		sg.addFlow( "f312", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f208", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f125", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f245", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f322", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows5( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f141", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f251", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f129", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[27] );
		sg.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f332", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f193", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f248", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f391", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f426", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[61] );
		sg.addFlow( "f110", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f113", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f114", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f380", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f176", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f197", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f290", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[60] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f337", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f273", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f356", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f174", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f135", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f159", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f396", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f177", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[4] );
		sg.addFlow( "f281", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f153", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f376", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f231", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f262", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f274", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		sg.addFlow( "f350", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f369", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[9] );
		sg.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f295", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f138", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f377", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f268", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f394", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f235", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f167", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f221", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f199", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f170", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f330", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f265", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f398", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f381", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f308", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f378", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows6( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f345", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[29] );
		sg.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f348", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f404", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f340", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f321", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f157", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[6] );
		servers_on_path_s.add( servers[46] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		sg.addFlow( "f179", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		sg.addFlow( "f188", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		sg.addFlow( "f185", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f256", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f212", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f342", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f246", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f219", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		sg.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f386", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f384", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f204", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		sg.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f402", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f313", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f413", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f124", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f318", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f116", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f354", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		sg.addFlow( "f164", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		sg.addFlow( "f238", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		sg.addFlow( "f232", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f133", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[62] );
		sg.addFlow( "f137", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f388", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[61] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f152", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[30] );
		sg.addFlow( "f338", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		sg.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f264", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		sg.addFlow( "f149", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f186", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f406", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f392", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f304", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[51] );
		sg.addFlow( "f117", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f275", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f254", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f441", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		sg.addFlow( "f389", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f107", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f233", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f276", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public void createFlows7( ServerGraph sg, Server[] servers ) throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[3] );
		sg.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f407", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f106", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f128", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[64] );
		sg.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f206", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f210", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f427", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f267", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[41] );
		sg.addFlow( "f189", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[60] );
		sg.addFlow( "f271", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[43] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[15] );
		sg.addFlow( "f198", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[22] );
		servers_on_path_s.add( servers[34] );
		sg.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[48] );
		sg.addFlow( "f140", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f131", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[49] );
		sg.addFlow( "f202", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[14] );
		sg.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f371", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		sg.addFlow( "f148", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f236", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[63] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f408", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		sg.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		sg.addFlow( "f434", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		sg.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[39] );
		sg.addFlow( "f343", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[22] );
		sg.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[13] );
		sg.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[46] );
		sg.addFlow( "f259", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f278", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[38] );
		sg.addFlow( "f119", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		sg.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[26] );
		sg.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[6] );
		sg.addFlow( "f234", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f344", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[2] );
		sg.addFlow( "f347", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[67] );
		servers_on_path_s.add( servers[11] );
		sg.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[32] );
		sg.addFlow( "f191", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f437", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[45] );
		sg.addFlow( "f352", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		sg.addFlow( "f288", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[47] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[44] );
		servers_on_path_s.add( servers[31] );
		sg.addFlow( "f250", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[63] );
		sg.addFlow( "f367", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,1.0),1.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public random_ff_27() {
		sg = createServerGraph();
	}

	public ServerGraph createServerGraph() {
		Server[] servers = new Server[68];
		sg = new ServerGraph();
		try{
			createServers1( sg, servers );
			createTurns1( sg, servers );
			createFlows1( sg, servers );
			createFlows2( sg, servers );
			createFlows3( sg, servers );
			createFlows4( sg, servers );
			createFlows5( sg, servers );
			createFlows6( sg, servers );
			createFlows7( sg, servers );
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
