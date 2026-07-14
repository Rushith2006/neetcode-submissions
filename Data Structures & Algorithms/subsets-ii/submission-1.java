class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        bk(0,nums,temp,ans);
        return ans;
    }
    public void bk(int index,int[] nums,List<Integer> temp,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(temp));

        for(int i=index ;i<nums.length;i++)
        {
            if(i>index && nums[i] == nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            bk(i+1,nums,temp,ans);
            temp.remove(temp.size() -1 );
        }
    }
}
