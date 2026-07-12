class Solution {
    public int countComponents(int n, int[][] edges) {
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
     boolean[] v = new boolean[n];
     int c =0;
      for(int i=0;i<n;i++)
      {
        if(!v[i])
        {
            dfs(i,ans,v);
            c++;
        }
      }
      return c;
    }
    public void dfs(int n , List<List<Integer>> ans,boolean[] v)
    {
        v[n] = true;
        for(int vi : ans.get(n))
        {
            if(!v[vi])
            {
                dfs(vi,ans,v);
            }
        }
    }
}
