class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        arr[0] =1;
        arr[n+1] =1;
        for(int i =0;i<n;i++)
        {
            arr[i+1]=nums[i];
        }
        int[][] dp = new int[n+2][n+2];
        for(int l =1;l<=n;l++)
        {
            for(int i =1;i+l-1<=n;i++)
            {
                int j = i+l-1;
                for(int k =i;k<=j;k++)
                {
                    int left = dp[i][k-1];
                    int right = dp[k+1][j];
                    int cur = arr[i-1] * arr[k] * arr[j+1];
                    int coin = left + right+cur;
                    dp[i][j] = Math.max(dp[i][j],coin);
                }
            }
        }
        return dp[1][n];
    }
}
