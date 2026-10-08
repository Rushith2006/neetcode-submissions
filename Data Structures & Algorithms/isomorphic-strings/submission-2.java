class Solution {
    public boolean check(String st,String ts)
    {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i =0;i<st.length();i++)
        {
            char s1 = st.charAt(i);
            char s2 = ts.charAt(i);
            if(map.containsKey(s1) && map.get(s1)!=s2)
            {
                return false;
            }
            map.put(s1,s2);
        }
        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        return check(s,t) && check(t,s);
    }
}