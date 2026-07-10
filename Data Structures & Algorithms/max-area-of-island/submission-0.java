class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxl = 0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j =0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    
                    maxl  = Math.max(maxl,dfs(grid,i,j));
                }
            }
        }
        return maxl;
    }
    static int dfs(int[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1)
        {
            return 0;
        }
        grid[i][j] = 0;
        int down=0,up=0, right =0, left=0;
         down += dfs(grid,i+1,j);
         up += dfs(grid,i-1,j);
         right += dfs(grid,i,j+1);
          left  += dfs(grid,i,j-1);

        return down+up+right+left+1;
        
    }
}
