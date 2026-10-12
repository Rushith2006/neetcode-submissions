class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean in = true;
       boolean de = true;
       int n = nums.length;
       for(int i=0;i<n-1;i++)
       {
         if (nums[i] > nums[i + 1]) {
              in = false;
             }

         if (nums[i] < nums[i + 1]) {
              de = false;
             }
       }
       return (in||de);
    }
}