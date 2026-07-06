class Solution {
    public int findMin(int[] nums) {
        int mins =nums[0];
        for(int s : nums)
        {
         mins = Math.min(mins,s);
        }
        return mins;
    }
}
