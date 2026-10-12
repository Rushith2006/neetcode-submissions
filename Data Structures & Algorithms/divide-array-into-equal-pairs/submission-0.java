class Solution {
    public boolean divideArray(int[] nums) {
        int n= nums.length;
        int k = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.values())
        {
            if(i%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}