class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        return Math.max(adj(nums,0,nums.length -2),adj(nums,1,nums.length -1));
    }
    public int adj(int[] nums,int s,int e)
    {
        int r1 =0;
        int r2 =0;
        for(int i = s;i<=e;i++)
        {
            int t = Math.max(r1+nums[i] ,r2);
            r1 = r2;
            r2 = t;
        }
        return r2;
    }
}
