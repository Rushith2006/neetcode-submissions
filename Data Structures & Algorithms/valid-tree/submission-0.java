class Solution {
    public boolean validTree(int n, int[][] edges) {
       if(edges.length!=n-1)
       {
        return false;
       }
       List<List<Integer>> ans = new ArrayList<>();
       for(int i=0;i<n;i++)
       {
           ans.add(new ArrayList<>());
       }
       for(int[] e : edges)
       {
        ans.get(e[0]).add(e[1]);
        ans.get(e[1]).add(e[0]);
       }
       boolean v[] = new boolean[n];
       dfs(0,ans,v);

       for(boolean vi : v)
       {
        if(!vi)
        {
            return false;
        }
       }
       return true;
    }
    public void dfs(int n,List<List<Integer>> ans,boolean[] v)
    {
         v[n]= true;

         for(int vi : ans.get(n))
         {
            if(!v[vi])
            dfs(vi,ans,v);
         }
    }
}
