class Solution {
    static int ba(int[] piles,int k)
    {
        int t =0;
        for(int b : piles)
        {
            t += (int)Math.ceil((double)b/k);
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int r = 0;
        for(int p : piles)
        {
            if(p>r)
            {
                r = p;
            }
        }
        int a = r;
        while(l<=r)
        {
            int mid = (l+r)/2;
            int t = ba(piles,mid);
            if(t>h)
            {
               l = mid+1;
            }
            else
            {
               a = mid;
               r = mid-1;
            }

        }
        return a;
    }
}
