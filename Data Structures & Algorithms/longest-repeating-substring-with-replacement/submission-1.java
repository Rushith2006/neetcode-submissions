class Solution {
    public int characterReplacement(String s, int k) {
      int l=0;
      int ans=0;
      int[] res = new int[26];
      for(int r=0;r<s.length();r++)
      {
           res[s.charAt(r)-'A']++;
           while(!v(res,k))
           {
            res[s.charAt(l)-'A']--;
            l++;
           }
        int len = r - l +1;
        ans = Math.max(ans,len);
      }  
      return ans;
    }
    boolean v(int [] a,int k)
    {
        int sum=0,max=0;
       for(int n : a)
       {
        sum+=n;
         max = Math.max(max,n);
       }
       return (sum-max)<=k;
    }
}