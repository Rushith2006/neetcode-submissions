class Solution {
    int row;
    int col;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        row  = heights.length;
        col  = heights[0].length;
        boolean p[][] = new boolean[row][col];
        boolean a[][] = new boolean[row][col]; 
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<row;i++)
        {
            dfs(heights, p , i , 0);
            dfs(heights, a , i, col-1);
        }
        for(int j=0;j<col;j++)
        {
            dfs(heights, p, 0, j);
            dfs(heights, a, row-1,j);
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(p[i][j] && a[i][j])
                {
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    public  void dfs(int[][] heights,boolean[][] v,int r,int c )
    {
        v[r][c]= true;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int[] d : dir)
        {
            int nr = r + d[0];
            int nc = c + d[1];

            if(nr<0 || nc<0 || nr>=row || nc>=col || v[nr][nc] || heights[nr][nc]<heights[r][c])
            {
                continue;
            }
            dfs(heights,v,nr,nc);
        }
    }
}
