class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        {
            return"";
        }
        HashMap<Character,Integer> c = new HashMap<>();
        HashMap<Character,Integer> w = new HashMap<>();
        for(char c1 : t.toCharArray())
        {
            c.put(c1,c.getOrDefault(c1,0)+1);
        }
        int have =0,need = c.size();
        int res[] = {-1,-1};
        int le = Integer.MAX_VALUE;
        int l =0;
        for(int r =0;r<s.length();r++)
        {
            char s1 = s.charAt(r);
            w.put(s1,w.getOrDefault(s1,0)+1);
            if(c.containsKey(s1) && w.get(s1).equals(c.get(s1)))
            {
                have++;
            }
            while(have == need)
            {
                if(r-l+1 < le)
                {
                    le = r-l+1;
                    res[0]=l;
                    res[1]=r;
                }

                char left = s.charAt(l);
                w.put(left,w.get(left)-1);
                if(c.containsKey(left) && w.get(left)<c.get(left))
                {
                    have--;
                }
                l++;
            }
        }
        return le == Integer.MAX_VALUE? "" : s.substring(res[0],res[1]+1);
    }
}
