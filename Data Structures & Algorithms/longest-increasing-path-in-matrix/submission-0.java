class Solution {
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        dp = new int[r+1][c+1];
        for(int[] f : dp)
        {
            Arrays.fill(f,-1);
        }
        int max =1;

        for(int i =0;i<r;i++)
        {
            for(int j =0;j<c;j++)
            {
                max = Math.max(max,dfs(matrix,i,j));
            }
        }
        return max;
    }
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int dfs(int[][] matrix,int i,int j)
    {
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int max =1;
        for(int[] d : dir)
        {
            int nr = i+d[0];
            int nc = j+d[1];

            if(nr>=0 && nc>=0 && nr<matrix.length && nc<matrix[0].length && matrix[nr][nc]>matrix[i][j])
            {
                int path = 1+dfs(matrix,nr,nc);
                max = Math.max(max,path);
            }
        }

        dp[i][j]= max;

        return dp[i][j];
    }
}