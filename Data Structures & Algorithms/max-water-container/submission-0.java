class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxl = 0;
        while(l<r)
        {
            int w = r-l;
            int h = Math.min(heights[l],heights[r]);
            maxl = Math.max(maxl,w*h);

            if(heights[l]<heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maxl;
    }
}
