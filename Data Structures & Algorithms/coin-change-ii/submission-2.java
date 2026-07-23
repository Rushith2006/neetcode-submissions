class Solution {

    int[][] dp;

    public int change(int amount, int[] coins) {

        dp = new int[coins.length][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(amount, coins, 0);
    }

    public int dfs(int amount, int[] coins, int i) {

        if (amount == 0) {
            return 1;
        }

        if (amount < 0 || i == coins.length) {
            return 0;
        }

        // Already calculated
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        // Take current coin
        int take = dfs(amount - coins[i], coins, i);

        // Skip current coin
        int skip = dfs(amount, coins, i + 1);

        dp[i][amount] = take + skip;

        return dp[i][amount];
    }
}