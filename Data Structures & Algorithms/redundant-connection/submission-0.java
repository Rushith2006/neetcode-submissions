class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            ans.add(new ArrayList<>());
        }
        for(int[] e : edges)
        {
            int u = e[0];
            int v = e[1];
            ans.get(u).add(v);
            ans.get(v).add(u);
            boolean[] vi = new boolean[n+1];
            if(dfs(u , -1, ans,vi))
            {
                return e;
            }
        }
        return new int[0];
    }
    public boolean dfs(int n,int p,List<List<Integer>> ans,boolean[] v)
    {
        if(v[n])
        {
            return true;
        }
        v[n] = true;
        for(int nei : ans.get(n))
        {
            if(nei == p)
            {
                continue;
            }
            if(dfs(nei,n,ans,v))
            {
                return true;
            }
        }
        return false;
    }
}
