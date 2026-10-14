class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : m.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: r.toCharArray())
        {
            
            if(!map.containsKey(c))
            {
                return false;
            }
           else
            {
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                {
                    map.remove(c);
                }
            }
        }
        return true;

    }
}