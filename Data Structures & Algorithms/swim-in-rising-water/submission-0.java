class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
        boolean[][] v = new boolean[n][n];
        
        pq.add(new int[]{0,0,grid[0][0]});
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!pq.isEmpty())
        {
            int[] cur = pq.poll();

            int row = cur[0];
            int col = cur[1];
            int time = cur[2];

             if(v[row][col])
            {
                continue;
            }
             v[row][col] = true;

            if(row == n-1 && col == n-1)
            {
                return time;
            }
            
           
            

            for(int[] d : dir)
            {
              int r = row + d[0];
              int c = col + d[1];
            if(r>=0 && r<n && c>=0 && c<n && !v[r][c])
            {
                int newtime = Math.max(time,grid[r][c]);

                pq.add(new int[]{r,c,newtime});
               }
            }
        }
        return -1;
    }
}
