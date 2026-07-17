class Solution {
    public boolean canPartition(int[] nums) {
        int sum =0;
        for(int s : nums)
        {
            sum +=s;
        }
        if(sum%2!=0)
        
            return false;
        
        return dfs(nums,0,sum/2);
    }
    boolean dfs(int[] nums,int i,int target)
    {
        if(target == 0)
        {
            return true;
        }
        if(i == nums.length || target<0)
        {
            return false;
        }
        return dfs(nums,i+1,target - nums[i])||dfs(nums,i+1,target);
    }
}
