class Solution {
    public int findPeakElement(int[] nums) {
        int m =-1;
        int in=-1;
        for(int i=0;i<nums.length;i++)
        {
           if((i==0 || nums[i-1]<nums[i]) && (i==nums.length-1|| nums[i]>nums[i+1]))
           {
                m = nums[i];
                in = i;
           }
        }
        return in;
    }
}