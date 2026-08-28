class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        int n  = prices.length;
        for (int i = 1; i < n; i++) 
        {
            if(prices[i]<buy)
            {
                buy = prices[i];
            }
            int sell = prices[i]-buy;
            max = Math.max(max,sell);
        }

        return max;
    }
}
