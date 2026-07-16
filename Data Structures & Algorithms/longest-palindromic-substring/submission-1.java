class Solution {
    public String longestPalindrome(String s) {
        if(s==null ||s.length()<2)
        {
            return s;
        }
        int st =0;
        int e  =0;
        for(int i =0;i<s.length();i++)
        {
            int l1 = ex(s,i,i);
            int l2 = ex(s,i,i+1);
            int len  = Math.max(l1,l2);

            if(len>e-st+1)
            {
                st = i - (len-1)/2;
                e = i+len/2;
            }
        }
        return s.substring(st,e+1);
    }
    public int ex(String s,int l,int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}
