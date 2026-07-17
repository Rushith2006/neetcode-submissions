class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;
        for(int i =0 ;i<n;i++)
        {
          int by = prices[i];
          for(int j = i+1;j<n;j++)
          {
            int sell= prices[j];

            res = Math.max(res, sell - by);
          }
        }
        return res;
    }
}
