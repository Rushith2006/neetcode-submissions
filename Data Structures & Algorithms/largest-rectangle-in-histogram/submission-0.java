class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxl=0;
        int n = heights.length;
        for(int i=0;i<=n;i++)
        {
            while(!st.isEmpty() && ( i==n || heights[st.peek()]>heights[i]))
            {
                int h = heights[st.pop()];
                int w;
                if(st.isEmpty())
                {
                    w =i;
                }
                else
                {
                    w = i-st.peek()-1;
                }
                maxl = Math.max(maxl,h*w);
            }
            st.push(i);
        }
        return maxl;
    }
}
