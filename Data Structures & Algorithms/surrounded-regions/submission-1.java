class Solution {
    int row;
    int col;
    public void solve(char[][] board) {
        row = board.length;
        col = board[0].length;

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
        if(r<0||c<0||r>=row||c>=col || board[r][c]!='O')
        {
            return;
        }
        board[r][c] = 'T';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);
    }
}
