class Solution {
    public int maxProfit(int[] prices) {
        int maxp =0;
        int maxb = prices[0];
        for(int i : prices)
        {
            maxp = Math.max(maxp,i-maxb);
            maxb = Math.min(maxb,i);
        }
        return maxp;
    }
}
