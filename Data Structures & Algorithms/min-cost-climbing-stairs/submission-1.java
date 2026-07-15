class Solution {
    int[] dist;
    public int minCostClimbingStairs(int[] cost) {
        dist = new int[cost.length];
        Arrays.fill(dist,-1);
        return Math.min(dfs(0,cost.length,cost),dfs(1,cost.length,cost));

    }
    public int dfs(int i,int n,int[] cost)
    {
        if(i>=n)
        {
            return 0;
        }
        if(dist[i]!=-1)
        {
            return dist[i];
        }
        int one  = dfs(i+1,n,cost);
        int two  = dfs(i+2,n,cost);

        return dist[i] = cost[i] + Math.min(one,two);

        

    }
}
