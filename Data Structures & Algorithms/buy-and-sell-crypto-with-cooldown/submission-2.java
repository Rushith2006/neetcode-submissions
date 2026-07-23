class Solution {
    int[][] dp;
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];
        for(int[] r : dp)
        {
            Arrays.fill(r,-1);
        }
        return dfs(prices,0,1);
    }
    public int dfs(int[] prices,int i,int buy )
    {
        if(i >= prices.length)
        {
            return 0;
        }
        if(dp[i][buy]!=-1)
        {
            return dp[i][buy];
        }
        if(buy==1)
        {
            int buys = dfs(prices,i+1,0)-prices[i];
            int cool = dfs(prices,i+1,1);
            dp[i][buy]= Math.max(buys,cool);
        }
        else
        {
            int sell = dfs(prices,i+2,1)+prices[i];
            int cool = dfs(prices,i+1,0);
            dp[i][buy] = Math.max(sell,cool);
        }

        return dp[i][buy];
    }

}
