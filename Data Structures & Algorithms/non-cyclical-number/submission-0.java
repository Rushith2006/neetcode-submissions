class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<>();
        while(!map.contains(n))
        {
            map.add(n);
            n = ad(n);
            if(n==1)
            {
                return true;
            }
        }
        return false;
    }
    public int ad(int n)
    {
        int sm=0;
        while(n>0)
        {
            int d = n%10;
            d=d*d;
            sm+=d;
            n/=10;
        }
        return sm;
    }
}
