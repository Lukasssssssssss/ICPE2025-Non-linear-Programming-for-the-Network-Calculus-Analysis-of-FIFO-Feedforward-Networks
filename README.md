This repo contains the code and data set corresponding to the ICPE2025 paper Non-linear Programming for the Network Calculus Analysis of FIFO Feedforward Networks.

The evaluation results referred to in the paper can be found in /data.

To run the network analysis run diffnc-dnc/src/main/java/org/networkcalculus/dnc/demos/DemoDiffLUDB.java

Relevant parameters are:

  args[1] = optimization algorithm (NLopt numbering!)
  
    - 100 for min of SLSQP and SBPLX
    
    - 500 for the main contenders above
    
  args[2] = limit number of iterations; <=0 == no limit
  
  args[3] = boolean: use LB-FF as starting point (set to false to use 0 as the starting point)


