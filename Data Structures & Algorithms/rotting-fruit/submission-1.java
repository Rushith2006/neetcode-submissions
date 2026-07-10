class Solution {
    public int orangesRotting(int[][] grid) {
       int row = grid.length;
       int col = grid[0].length;
       Queue<int[]> q = new LinkedList<>();
       int f =0;
       for(int i=0;i<row;i++)
       {
        for(int j = 0;j<col;j++)
        {
            if(grid[i][j] == 2)
            {
                q.add(new int[]{i,j});
            }

            if(grid[i][j] == 1)
            {
                f++;
            }
        }
       }
      int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
       int m =0;
       while(!q.isEmpty() && f>0)
       {
        int s = q.size();
        for(int i=0;i<s;i++)
        {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int[] d : dir)
            {
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr<0 || nc<0 || nr>=row || nc>=col || grid[nr][nc]!=1)
                {
                    continue;
                }
                grid[nr][nc] =2;
                f--;

                q.add(new int[]{nr,nc});
            }
        }
        m++;
      }  
      return f==0 ? m : -1;
    }
}
