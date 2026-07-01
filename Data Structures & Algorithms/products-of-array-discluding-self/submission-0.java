class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] an = new int[n];
         an[0] = 1;
        for(int i=1;i<n;i++)
        {
            an[i]=an[i-1]*nums[i-1];
        }
        int r =1;
        for(int i=n-1;i>=0;i--)
        {
            an[i]=an[i]*r;
            r*=nums[i];
        }
        return an;
    }
}  
