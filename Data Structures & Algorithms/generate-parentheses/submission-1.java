class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        bk(n,0,0,"",ans);
        return ans;
    }
    public void bk(int n, int open,int close,String temp,List<String> ans)
    {
        if(temp.length() == 2*n)
        {
            ans.add(temp);
            return;
        }
        if(open<n)
        {
            bk(n,open+1,close,temp+ "(" ,ans);
        }
        if(close<open)
        {
            bk(n,open,close+1,temp+")" ,ans);
        }

    }
}
