class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] p = new int[n];
        Arrays.sort(nums);
        Arrays.fill(dp,1);
        Arrays.fill(p,-1);
        int max =1;
        int l = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0 && dp[j]+1>dp[i])
                {
                    dp[i] = dp[j]+1;
                    p[i] = j;
                }
            }
            if(dp[i]>max)
            {
                max = dp[i];
                l = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(l!=-1)
        {
            ans.add(nums[l]);
            l = p[l];
        }
        return ans;
    }
}