class Solution {
    public boolean check(int[] nums) {
        int c =0 ;
        int n = nums.length;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                c++;
            }
        }
        if(nums[0]<nums[n-1])
        {
            c++;
        }
        return c==1;
    }
}