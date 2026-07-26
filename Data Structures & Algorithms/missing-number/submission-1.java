class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> map = new HashSet<>();
        if(nums[0]==1)
        {
            return 0;
        }
        for(int n:nums)
        {
            map.add(n);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int res = nums[i];
            if(map.contains(res+1))
            {
                continue;
            }
            return res+1;
            
        }
        return 0;
    }
}
