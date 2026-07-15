class Solution {
    int dp[];
    int ok(int i,int n){
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        return  dp[i]=ok(i+1,n)+ok(i+2,n);
    }
    public int climbStairs(int n) {
        dp= new int[n];
        Arrays.fill(dp,-1);
      return ok(0,n);
    }
}
