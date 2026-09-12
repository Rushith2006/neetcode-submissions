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
    static int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
   static int dfs(int[][] grid, int i, int j) {

    if (i >= 0 && j >= 0 &&
        i < grid.length && j < grid[0].length &&
        grid[i][j] == 1) {

        grid[i][j] = 2;

        int area = 1;

        for (int[] d : dir) {
            int ni = i + d[0];
            int nj = j + d[1];

            area += dfs(grid, ni, nj);
        }

        return area;
    }

    return 0;

        
    }
}
