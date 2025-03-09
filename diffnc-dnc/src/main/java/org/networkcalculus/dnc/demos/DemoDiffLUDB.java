package org.networkcalculus.dnc.demos;

import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;
import org.networkcalculus.dnc.optree.toolchain.FileManager;
import org.networkcalculus.dnc.optree.toolchain.OpTreeAnalysis;
import org.networkcalculus.dnc.tandem.analyses.FIFOTandemAnalysis;
import org.networkcalculus.dnc.tandem.fifo.NestedTandemAnalysis;
import org.networkcalculus.dnc.test.feedforward_networks.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lukas Herll
 *
 * Runs the DiffLUDB algorithm on a given set of networks (sequentially assuming each flow as the foi).
 * The results are stored in two csv files at a specified location.
 */
public class DemoDiffLUDB {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //attributes
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private FileManager fileManager;
    private String runTimeCompPath;
    private String delayCompPath;

    private int totalNoOfNonConvexTandems = 0;

    private static int analysis_codes_main_contenders[] = {11,12,13,15,24,25,27,28,29,34,40,100};
    // 26 would be preferable over 27 but it crashes due to finding a theta < 0

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructors
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public DemoDiffLUDB(){
        fileManager = FileManager.getInstance();
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //methods
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
    args[1] == optimization algorithm (NLopt numbering!)
      - 100 for min of SLSQP and SBPLX
      - 500 for the main contenders above
    args[2] == limit number of iterations; <=0 == no limit
    args[3] == boolean: use LB-FF as starting point
     */
    public static void main(String[] args) {
        try{
            OpTreeAnalysis.nlopt_alg = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // default value defined in class OpTreeAnalysis: 40 == SLSQP
        }
        try{
            OpTreeAnalysis.iterations_max = Integer.parseInt(args[1]);
            if(OpTreeAnalysis.iterations_max <= 0 ) {
                OpTreeAnalysis.iterations_max = 0;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            OpTreeAnalysis.iterations_max = 0;
        }

        //decide whether to approximate the initial theta settings in NestedTandemAnalysis
        try{
            NestedTandemAnalysis.approximateInitialThetas = Boolean.parseBoolean(args[2]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            NestedTandemAnalysis.approximateInitialThetas = false;
        }


        if(OpTreeAnalysis.nlopt_alg != 500) {
            run_with_analysis_code(OpTreeAnalysis.nlopt_alg);
        } else {
            for(int analysis_code : analysis_codes_main_contenders) run_with_analysis_code(analysis_code);
        }
    }

    private static void run_with_analysis_code(int analysis_code) {
        OpTreeAnalysis.nlopt_alg = analysis_code; //29 = SBPLX, 40 = SLSQP, 100 = SLSQPminSBPLX

        //parameters that set the file paths in this class and OpTreeAnalysis depending on whether the code is run from an IDE or as a jar
        boolean runAsJar = false;
        int jarType = 1;
        //0 : local jar, 1 : WS1, 2 : WS2

        DemoDiffLUDB demo = new DemoDiffLUDB();

        try {
            demo.run();
            //demo.runConvexityTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void run() throws Exception {
        //set the analysis mode to DiffLUDB
        NestedTandemAnalysis.selected_mode = NestedTandemAnalysis.mode.DIFF_LUDB;

        //set the output file path
        final String filePath = System.getProperty("user.home") + "/DiffLUDB_experiments/";


        //Create the files containing the results (delay and runtime)
        String baseFileName = "DiffLUDB_"
                + OpTreeAnalysis.nlopt_alg + "_"
                + OpTreeAnalysis.iterations_max + "_"
                + NestedTandemAnalysis.approximateInitialThetas;
        String delayFileName = baseFileName + "_delay";
        delayCompPath = filePath + "" + delayFileName + ".csv";
        String delayHeaders = "Netid,Fid,DiffLUDB\n";
        File delayCompFile = fileManager.safeCreateFile(delayCompPath, delayHeaders);
        delayCompPath = delayCompFile.getAbsolutePath();

        String runTimeCompName = baseFileName + "_runtime";
        runTimeCompPath = filePath + "" + runTimeCompName + ".csv";
        //String runtimeHeaders = "NetID,FlowID,DiffLUDB(ms),DiffLUDB(s),DiffLUDB(min),DiffLUDB(h)\n";
        //store the runtime of the entire network analysis, the number of analysed sub-tandems, the aggregated time to
        //derive the objective function from the nesting tree, and the aggregated time to solve the NLP
        String runtimeHeaders = "Netid,Fid,DiffLUDB,DiffLUDB (ms),DiffLUDB (min),#SubTandems," +
                (NestedTandemAnalysis.approximateInitialThetas ? "init param values (ns),init param values (ms),init param values (min)," : "") +
                "cut-set + leftover (aggr ns),cut-set + leftover (aggr ms),cut-set + leftover (aggr min)," +
                "objFunc Derivation (aggr ns),objFunc Derivation (aggr ms),objFunc Derivation (aggr min)," +
                "NLopt wrapper (aggr ns),NLopt wrapper (aggr ms),NLopt wrapper (aggr min),"+
                "NLP (aggr ns),NLP (aggr ms),NLP (aggr min)," +
                "service curve (aggr ns),service curve(aggr ms), service curve(aggr min)\n";
        File runtimeCompFile = fileManager.safeCreateFile(runTimeCompPath, runtimeHeaders);
        runTimeCompPath = runtimeCompFile.getAbsolutePath();

        //run a single analysis (specific flow of one network)
        //runOnNetwork(13, 56);
        //runOnNetwork(Netid,-1);

        //networks 1 to 34
        for(int i = 1; i <= 34; i++){
            runOnNetwork(i, -1);
        }
    }


    /**
     * Runs the DiffLUDB analysis on the network corresponding to the networkID and stores the associated runtime of the
     * anylysis in the global array runTimes. The results of the analysis are stored in txt files at the specified filePath.
     * @param networkID
     *                      the ID of the network
     * @param flowID
     *                      the ID of the flow to be analysed. When a valid ID is specified, only the flow matching this ID
     *                      will be analysed in the network. If a negative value is provided, all flows will be analysed.
     * @throws Exception
     */
    private void runOnNetwork(int networkID, int flowID) throws Exception{
        NestedTandemAnalysis.networkID = networkID;

        //instantiate the serverGraph
        ServerGraph sg = getServerGraphFromNetwork(networkID);
        if(sg == null){
            return;
        }


        //iteratively declare all flows the foi and run the analysis
        for(Flow foi: sg.getFlows()){
            //we need to extract the foi's true ID from its alias. (During the analysis the flows get re-created in a random
            //different order. As a result, their ID's change randomly, but their original ID's are kept in their aliases)
            int foiTrueID = Integer.valueOf(foi.getAlias().substring(1, foi.getAlias().length()));
            if(flowID >= 0 && foiTrueID != flowID){
                continue;
            }

            //System.out.println("////////////////////////////////////////////////////////////////////////////////////////////" +
            //       "////////////////////////\nAnalysing network " + networkID + " with foi " + foiTrueID + "\n");

            //reset the subnetwork index used in the DiffLUDB analysis to name the files (see NestedTandemAnalysis), as well
            //as the aggregated time measurements
            NestedTandemAnalysis.subNetwork = 0;
            NestedTandemAnalysis.aggrTimeToFindInitialThetasInNS = 0;
            NestedTandemAnalysis.aggrTimeToDeriveObjFuncInNS = 0;
            NestedTandemAnalysis.aggrTimeToStartSolverInNS = 0;
            NestedTandemAnalysis.aggrTimeToSolveNLPInNS = 0;
            NestedTandemAnalysis.aggrTimeToComputeServiceCurveInNS = 0;
            //set the ID of the foi
            NestedTandemAnalysis.networkFoi = foiTrueID;

            //start the analysis and take note of the run times
            long startTime = System.nanoTime();

            FIFOTandemAnalysis fta = new FIFOTandemAnalysis(sg);
            fta.performAnalysis(foi);

            long runTimeNS = System.nanoTime() - startTime;
            long runTimeMS = runTimeNS / 1000000;
            long runTimeSec = runTimeMS / 1000;
            long runTimeMin = runTimeSec / 60;
            long runTimeHours = runTimeMin / 60;

            long initialParamValuesNS = NestedTandemAnalysis.aggrTimeToFindInitialThetasInNS;
            long initialParamValuesMS = initialParamValuesNS / 1000000;
            long initialParamValuesMin = initialParamValuesMS / (1000*60);
            long objFunNS = NestedTandemAnalysis.aggrTimeToDeriveObjFuncInNS;
            long objFuncMS = objFunNS / 1000000;
            long objFuncMin = objFuncMS / (1000*60);
            long solverStartNS = NestedTandemAnalysis.aggrTimeToStartSolverInNS;
            long solverStartMS = solverStartNS / 1000000;
            long solverStartMin = solverStartMS / (1000*60);
            long nlpNS = NestedTandemAnalysis.aggrTimeToSolveNLPInNS;
            long nlpMS = nlpNS / 1000000;
            long nlpMin = nlpMS / (1000*60);
            long serviceCurveNS = NestedTandemAnalysis.aggrTimeToComputeServiceCurveInNS;
            long serviceCurveMS = serviceCurveNS / 1000000;
            long serviceCurveMin = serviceCurveMS / (1000*60);

            long cutSetNS = runTimeNS - (initialParamValuesNS + objFunNS + solverStartNS + nlpNS + serviceCurveNS);
            long cutSetMS = cutSetNS / 1000000;
            long cutSetMin = cutSetMS / (1000*60);

            //write the delay and runtime into the respective files
            fileManager.appendToFile(delayCompPath, networkID + "," + foiTrueID + "," + fta.getDelayBound() + "\n");
            if(NestedTandemAnalysis.approximateInitialThetas){
                fileManager.appendToFile(runTimeCompPath, String.format("%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d\n",
                        networkID, foiTrueID, runTimeNS, runTimeMS, runTimeMin, NestedTandemAnalysis.subNetwork,
                        cutSetNS, cutSetMS, cutSetMin,
                        initialParamValuesNS, initialParamValuesMS, initialParamValuesMin,
                        objFunNS, objFuncMS, objFuncMin,
                        solverStartNS, solverStartMS, solverStartMin,
                        nlpNS, nlpMS, nlpMin,
                        serviceCurveNS, serviceCurveMS, serviceCurveMin));
            }
            else{
                fileManager.appendToFile(runTimeCompPath, String.format("%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d\n",
                        networkID, foiTrueID,
                        runTimeNS, runTimeMS, runTimeMin, NestedTandemAnalysis.subNetwork,
                        cutSetNS, cutSetMS, cutSetMin,
                        objFunNS, objFuncMS, objFuncMin,
                        solverStartNS, solverStartMS, solverStartMin,
                        nlpNS, nlpMS, nlpMin,
                        serviceCurveNS, serviceCurveMS, serviceCurveMin));
            }

            // System.out.println("Network " + networkID + " with foi " + foiTrueID + " has delay bound " +
            //        fta.getDelayBound() + "\n///////////////////////////////////////////////////////////////////////////////" +
            //        "/////////////////////////////////////\n");
        }
    }


    /**
     * Like run, but tests each tandem for convexity instead of computing the delay bound.
     * @throws Exception
     */
    public void runConvexityTest() throws Exception{
        //set the analysis mode to DiffLUDB
        NestedTandemAnalysis.selected_mode = NestedTandemAnalysis.mode.DIFF_LUDB;

        //set the output file path
        final String filePath = System.getProperty("user.home") + "/DiffLUDB_experiments/";

        //Create the files containing the results (convexity test)
        String baseFileName = "DiffLUDB_"
                + OpTreeAnalysis.nlopt_alg + "_"
                + OpTreeAnalysis.iterations_max + "_"
                + NestedTandemAnalysis.approximateInitialThetas;
        String delayFileName = baseFileName + "_convexity";
        delayCompPath = filePath + "" + delayFileName + ".csv";
        String delayHeaders = "Netid,Fid,NoOfConvexSubTandems, NoOfNonConvexSubTandems\n";
        File delayCompFile = fileManager.safeCreateFile(delayCompPath, delayHeaders);
        delayCompPath = delayCompFile.getAbsolutePath();

        //run the analysis on all networks
        for(int i = 1; i <= 34; i++){
            runConvexityTestOnNetwork(i, -1);
        }
        //runConvexityTestOnNetwork(1, 13);

        System.out.println("Analysed all networks, recorded " + totalNoOfNonConvexTandems + "convex tandems and " + totalNoOfNonConvexTandems + " non-convex tandems in total.");
    }


    /**
     * Runs the DiffLUDB analysis on the network corresponding to the networkID and stores the associated runtime of the
     * anylysis in the global array runTimes. The results of the analysis are stored in txt files at the specified filePath.
     * @param networkID
     *                      the ID of the network
     * @param flowID
     *                      the ID of the flow to be analysed. When a valid ID is specified, only the flow matching this ID
     *                      will be analysed in the network. If a negative value is provided, all flows will be analysed.
     * @throws Exception
     */
    private void runConvexityTestOnNetwork(int networkID, int flowID) throws Exception{
        NestedTandemAnalysis.networkID = networkID;

        //instantiate the serverGraph
        ServerGraph sg = getServerGraphFromNetwork(networkID);
        if(sg == null){
            return;
        }


        //iteratively declare all flows the foi and run the analysis
        for(Flow foi: sg.getFlows()){
            //we need to extract the foi's true ID from its alias. (During the analysis the flows get re-created in a random
            //different order. As a result, their ID's change randomly, but their original ID's are kept in their aliases)
            int foiTrueID = Integer.valueOf(foi.getAlias().substring(1, foi.getAlias().length()));
            if(flowID >= 0 && foiTrueID != flowID){
                continue;
            }

            //reset the subnetwork index used in the DiffLUDB analysis to name the files (see NestedTandemAnalysis), as well
            //as the number of (non-)convex tandems
            NestedTandemAnalysis.subNetwork = 0;
            NestedTandemAnalysis.onlyTestConvexity = true;
            NestedTandemAnalysis.noOfNonConvexTandems = 0;
            NestedTandemAnalysis.noOfConvexTandems = 0;
            //set the ID of the foi
            NestedTandemAnalysis.networkFoi = foiTrueID;

            FIFOTandemAnalysis fta = new FIFOTandemAnalysis(sg);
            fta.performAnalysis(foi);

            int noOfConvexTandems = NestedTandemAnalysis.noOfConvexTandems;
            int noOfNonConvexTandems = NestedTandemAnalysis.noOfNonConvexTandems;
            this.totalNoOfNonConvexTandems += noOfNonConvexTandems;

            //write the convexity test results
            fileManager.appendToFile(delayCompPath, String.format("%d,%d,%d,%d\n",
                    networkID, foiTrueID, noOfConvexTandems, noOfNonConvexTandems));

        }
    }


    /**
     * Instantiates the network with the given networkID and returns its ServerGraph
     * @param networkID the network id. Viable values are 1 to 34 except for 4, 22, 25
     * @return  the ServerGraph associated with the network; null if no network with the given networkID is known
     */
    private ServerGraph getServerGraphFromNetwork(int networkID){
        switch (networkID){
            case 1: return new random_ff_1().createServerGraph();
            case 2: return new random_ff_2().createServerGraph();
            case 3: return new random_ff_3().createServerGraph();
            //case 4: return new random_ff_4().createServerGraph();
            case 5: return new random_ff_5().createServerGraph();
            case 6: return new random_ff_6().createServerGraph();
            case 7: return new random_ff_7().createServerGraph();
            case 8: return new random_ff_8().createServerGraph();
            case 9: return new random_ff_9().createServerGraph();
            case 10: return new random_ff_10().createServerGraph();
            case 11: return new random_ff_11().createServerGraph();
            case 12: return new random_ff_12().createServerGraph();
            case 13: return new random_ff_13().createServerGraph();
            case 14: return new random_ff_14().createServerGraph();
            case 15: return new random_ff_15().createServerGraph();
            case 16: return new random_ff_16().createServerGraph();
            case 17: return new random_ff_17().createServerGraph();
            case 18: return new random_ff_18().createServerGraph();
            case 19: return new random_ff_19().createServerGraph();
            case 20: return new random_ff_20().createServerGraph();
            case 21: return new random_ff_21().createServerGraph();
            //case 22: return new random_ff_22().createServerGraph();
            case 23: return new random_ff_23().createServerGraph();
            case 24: return new random_ff_24().createServerGraph();
            //case 25: return new random_ff_25().createServerGraph();
            case 26: return new random_ff_26().createServerGraph();
            case 27: return new random_ff_27().createServerGraph();
            case 28: return new random_ff_28().createServerGraph();
            case 29: return new random_ff_29().createServerGraph();
            case 30: return new random_ff_30().createServerGraph();
            case 31: return new random_ff_31().createServerGraph();
            case 32: return new random_ff_32().createServerGraph();
            case 33: return new random_ff_33().createServerGraph();
            case 34: return new random_ff_34().createServerGraph();
            default: return null;
        }
    }

}
