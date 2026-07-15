class Solution {
    int dp[];
    int ok(int i,int n,int arr[]){
        if(i==n) return 0;
        if(i>n) return Integer.MAX_VALUE;
        if(dp[i]!=-1) return dp[i];
        return  dp[i]= arr[i]+Math.min(ok(i+1,n,arr),ok(i+2,n,arr));
    }
    public int minCostClimbingStairs(int arr[]) {
        int n=arr.length;

        dp= new int[n];
        Arrays.fill(dp,-1);
        int one= ok(0,n,arr);
        Arrays.fill(dp,-1);
        int two= ok(1,n,arr);
        return Math.min(one,two);
    }
}
