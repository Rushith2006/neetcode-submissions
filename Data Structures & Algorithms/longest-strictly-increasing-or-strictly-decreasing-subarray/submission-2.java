class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int c = 1;
        int d =1;
        int m=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                c++;
            }
            else
            {
                c=1;
            }
            if(nums[i]<nums[i-1])
            {
                d++;
            }
            else
            {
                d=1;
            }
            m = Math.max(m,Math.max(c,d));
        }
        return m==0?1:m;
    }
}