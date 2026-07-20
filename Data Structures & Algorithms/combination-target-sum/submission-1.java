class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp  = new ArrayList<>();
        bk(0,nums,target,temp,ans);
        return ans;
    }
    public void bk(int index,int[] nums,int target,List<Integer> temp,List<List<Integer>> ans)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(temp));
           
        }
        if(target<0)
        {
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            temp.add(nums[i]);
            bk(i,nums,target-nums[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
