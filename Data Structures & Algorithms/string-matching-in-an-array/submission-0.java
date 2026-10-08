class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
       for(int i=0;i<n;i++)
       {
            for(int j =0;j<n;j++)
            {
                if(i==j) continue;
                if(check(words[i],words[j])) {
                    ans.add(words[i]);
                    break;
                }
            }
       } 
       return ans;
    }
    boolean check(String s,String t)
    {
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i=0;
                j++;
            }
        }
        return i==s.length();
    }
}