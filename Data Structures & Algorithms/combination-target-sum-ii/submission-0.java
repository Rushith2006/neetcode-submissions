class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        bk(0,candidates,target,temp,ans);
        return ans;
    }
    public void bk(int index,int[] nums,int target,List<Integer> temp,List<List<Integer>> ans)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i =index;i<nums.length;i++)
        {
            if(i>index && nums[i] == nums[i-1])
            {
                continue;
            }
            temp.add(nums[i]);
            bk(i+1,nums,target-nums[i],temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
