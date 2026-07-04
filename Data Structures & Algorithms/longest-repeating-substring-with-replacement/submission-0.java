class Solution {
    public int characterReplacement(String s, int k) {
        int[] c = new int[26];
        int l =0;
        int maxf=0;
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i) - 'A']++;
            maxf = Math.max(maxf,c[s.charAt(i) - 'A']);
            while((i-l+1)-maxf > k)
            {
                c[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res,i-l+1);
        }
        return res;
    }
}
