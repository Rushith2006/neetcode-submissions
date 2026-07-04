class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int left =0;
        int right =0;
        int water =0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>=left)
                {
                    left = height[l];
                }
                else
                {
                    water += left-height[l];
                }
                l++;
            }else
            {
                if(height[r]>=right)
                {
                    right = height[r];
                }
                else
                {
                    water += right-height[r];
                }
                r--;
            }
           
        }
        return water;
    }
}
