class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        bk(1,n,k,ans,temp);
        return ans;
    }
    void bk(int in,int n,int k,List<List<Integer>> ans,List<Integer> temp)
    {
        if(temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
        }
        for(int i=in;i<=n;i++)
        {
            temp.add(i);
            bk(i+1,n,k,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}