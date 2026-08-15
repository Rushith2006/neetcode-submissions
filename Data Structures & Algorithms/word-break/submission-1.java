class Solution {
    Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> map = new HashSet<>(wordDict);
        dp = new Boolean[s.length()];
        return dfs(s, map, 0);
    }

    boolean dfs(String s, HashSet<String> map, int i) {

        if (i == s.length()) {
            return true;
        }
        if(dp[i] != null)
        {
            return dp[i];
        }

        for (int j = i; j < s.length(); j++) {

            if (map.contains(s.substring(i, j + 1))) {

                if (dfs(s, map, j + 1)) {
                    dp[i]=true;
                    return true;
                }
            }
        }
        dp[i] = false;
        return false;
    }
}