class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()) {
            return -1;
        }
        int id=0;
        int sum=0;
        int [] arr = new int[gas.length];
        
        for(int i=0;i<gas.length;i++)
        {
            arr[i] = gas[i]-cost[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum<0)
            {
                id =i+1;
                sum=0;
            }
        }
        return id;

    }
}
