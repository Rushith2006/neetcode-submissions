class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum =0;
        for(int i=0;i<gas.length;i++)
        {
            sum +=gas[i];
        }
        int c=0;
        for(int i=0;i<cost.length;i++)
        {
            c+=cost[i];
        }
        if(sum<c)
        {
            return-1;
        }
        int id=0;
        int t=0;
        for(int i=0;i<gas.length;i++)
        {
             t += gas[i]-cost[i];
            if(t<0)
            {
               id=i+1;
               t=0;
            }
        }
        return id;
    }
}
