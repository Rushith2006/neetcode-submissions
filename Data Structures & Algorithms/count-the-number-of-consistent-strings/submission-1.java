class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> map = new HashSet<>();
        for(char c : allowed.toCharArray())
        {
            map.add(c);
        }
        int c=0;
        for(String s : words)
        {
            boolean f = false;
           
            for(int i=0;i<s.length();i++)
            {
                if(!map.contains(s.charAt(i)))
                {
                    f = true;
                }
            }
            if(!f)
            {
                c++;
            }
        }
        return c;
    }
}