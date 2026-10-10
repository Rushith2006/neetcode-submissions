class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftmost =0;
        int t=0;
        for(int v : nums)
        {
            t +=v;
        }
        for(int i=0;i<n;i++)
        {
            if(leftmost == t-leftmost-nums[i])
            {
                return i;
            }
            leftmost+=nums[i];
        }
        return -1;
    }
}