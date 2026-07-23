class Solution {
    int dp[];
    public int findTargetSumWays(int[] nums, int target) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return dfs(nums,0,0,target);
    }
    public int dfs(int[] nums,int i,int sum,int target)
    {
        if(i == nums.length)
        {
            if(sum == target)
            {
                return 1;
            }
            return 0;
        }
        int p = dfs(nums,i+1,sum+nums[i],target);
        int m = dfs(nums,i+1,sum-nums[i],target);

        dp[i] = p+m;
        return dp[i];
    }
}