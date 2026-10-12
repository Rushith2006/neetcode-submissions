class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int  i=0,j=nums.length-1;
        int c=0;
        while(i<j)
        {
            if(nums[i]==nums[j] && i<j)
            {
                c++;
                j--;
            }
            else
            {
            j--;
            }
            if(i==j)
            {
                i++;
                j=n-1;
            }
        }
        return c;
    }
}