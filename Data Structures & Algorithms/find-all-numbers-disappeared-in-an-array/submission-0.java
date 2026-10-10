class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n= nums.length;
        Set<Integer> map = new HashSet();
        for(int i : nums)
        {
            map.add(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(!map.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}