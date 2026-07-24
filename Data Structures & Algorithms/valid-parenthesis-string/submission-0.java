class Solution {
    public boolean checkValidString(String s) {
        int lmax=0;
        int lmin=0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            {
                lmax++;
                lmin++;
            }
            else if(ch==')')
            {
                lmax--;
                lmin--;
            }
            else
            {
                lmax++;
                lmin--;
            }
            if(lmax<0)
            {
                return false;
            }
            if(lmin<0)
            {
                lmin=0;
            }
        }
       return lmin==0;
    }
}
