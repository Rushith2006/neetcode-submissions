class Solution {
    
   
    public void solve(char[][] board) {
       int row = board.length;
        int col = board[0].length;

        for(int i=0;i<row;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(board,i,0);
            }
            if(board[i][col-1]=='O')
            {
                dfs(board,i,col-1);
            }
        }
        for(int j =0;j<col;j++)
        {
            if(board[0][j]=='O')
            {
                dfs(board,0,j);
            }
            if(board[row-1][j]=='O')
            {
                dfs(board,row-1,j);
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='T')
                {
                    board[i][j]='O';
                }
            }
        }
    }
     void dfs(char[][] board,int r ,int c)
    {
          board[r][c]='T';
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] d: dir)
        {
            int nr= r+d[0];
            int nc= c+d[1];
            if(nr<0 || nc<0 || nr>=board.length ||nc>=board[0].length||board[nr][nc]!='O')
            {
                continue;
            }
            dfs(board,nr,nc);
        }
    }
}
