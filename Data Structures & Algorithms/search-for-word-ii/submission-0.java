class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new ArrayList<>();
        for(String s : words)
        {
            boolean f  = false;
            for(int i = 0;i<board.length&& !f;i++)
            {
                for(int j =0;j<board[0].length && !f;j++)
                {
                    if(dfs(board,s,i,j,0))
                    {
                        ans.add(s);
                        f = true;
                    }
                }
            }
        }
        return ans;
    }
    boolean dfs(char[][] board,String word,int r,int c,int index)
    {
        if(index == word.length())
        {
         return true;  
        }
        if(r<0||c<0||r>=board.length||c>=board[0].length||board[r][c]!=word.charAt(index))
        {
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '#';
        boolean f = ((dfs(board,word,r+1,c,index+1))||
                     (dfs(board,word,r-1,c,index+1))||
                     (dfs(board,word,r,c+1,index+1))||
                     (dfs(board,word,r,c-1,index+1)));
        board[r][c] = temp;
                     
         return f;
    }
}
