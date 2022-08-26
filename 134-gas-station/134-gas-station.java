class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1)
        {
            if(gas[0]>=cost[0])
                return 0;
            else
                return -1;
        }
            // return 0;
        int flag=0;
        for(int i=0;i<gas.length;i++)
        {
            if(gas[i]>cost[i])
            {
                int fuel=0;
                int j=0;
                for(;j<gas.length;j++)
                {
                    
                    int k=(i+j)%gas.length;
                    // System.out.println(i+" "+j+" "+fuel+" "+gas[k]+" "+cost[k]);
                    fuel+=gas[k];
                    fuel=fuel-cost[k];
                    if(fuel<=0)
                        break;
                }
                // if(fuel<0)
                //     continue;
                // System.out.println("out "+i+" "+j+" "+fuel);
                if(j==gas.length-1 && fuel ==0)
                    return i;
                if(j==gas.length && fuel >=0)
                    return i;
            }
        }
        return -1;
    }
}