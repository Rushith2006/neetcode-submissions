class Solution {
    public int countSubstrings(String s) {
        int c =0;
        for(int i =0;i<s.length();i++)
        {
            c+=ex(s,i,i);
            c+=ex(s,i,i+1);

        }
        return c;
    }
    public int ex(String s,int l,int r)
    {
        int c =0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
            c++;
        }
        return c;
    }
}
