class Solution {
    int[] dp;
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = s(coins,amount,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public int s(int[] coins,int amount,int dp[])
    {
        if(amount == 0)
        {
            return 0;
        }
        if(amount<0)
        {
            return Integer.MAX_VALUE;
        }
        if (dp[amount] != -1) {
    return dp[amount];
}
        int min = Integer.MAX_VALUE;
        for(int coin : coins)
        {
            int r = s(coins,amount-coin,dp);

            if(r!=Integer.MAX_VALUE)
            {
                min = Math.min(min,r+1);
            }
        }

        dp[amount] = min;
        return dp[amount];
        
    }
}
