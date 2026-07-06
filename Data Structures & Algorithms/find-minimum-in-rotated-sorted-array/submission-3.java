class Solution {
    public int findMin(int[] nums) {
        int mins =nums[0];
        for(int i=1;i<nums.length;i++)
        {
         if(nums[i]<mins)
         {
            mins = nums[i];
         }
        }
        return mins;
    }
}
