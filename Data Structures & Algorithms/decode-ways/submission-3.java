class Solution {
    int dp[];
    public int numDecodings(String s) {
        dp= new int[s.length()];
        Arrays.fill(dp,-1);
        return dfs(s, 0);
    }

    public int dfs(String s, int i) {
        if (i == s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int way = dfs(s, i + 1);


        if (i + 1 < s.length()) {
            int n = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');

            if (n >= 10 && n <= 26) {
                way += dfs(s, i + 2);
            }
        }

        return  dp[i]=way;
    }
}