class Solution {
    List<List<String>> ans = new ArrayList<>();
    boolean safe(int r,int c,char d[][])
    {
        for(int i=0;i<r;i++)
        {
            if(d[i][c]=='Q')
            {
                return false;
            }
            int b =  r - i;
            if(c-b>=0 && d[i][c-b]=='Q')
            {
                return false;
            }
            if(c+b<d.length && d[i][c+b]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    void dfs(int r,char[][] b)
    {
        if(r==b.length)
        {
            List<String> temp = new ArrayList<>();

            for(char[] row : b)
            {
                temp.add(new String(row));
            }

                ans.add(temp);
                return;
            

        }
        for(int c = 0;c<b.length;c++)
        {
            if(safe(r,c,b))
            {
                b[r][c] = 'Q';
                dfs(r+1,b);
                b[r][c] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] d = new char[n][n];
        for(char[] row : d)
        {
            Arrays.fill(row,'.');
        }
        dfs(0,d);
        return ans;
    }
}
