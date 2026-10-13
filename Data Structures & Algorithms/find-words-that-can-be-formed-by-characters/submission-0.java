class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : chars.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(String s : words)
        {
            HashMap<Character,Integer> map1 = new HashMap<>();
            boolean invalid=false;
            for(int i =0;i<s.length();i++)
            {
                char c = s.charAt(i);
                map1.put(c,map1.getOrDefault(c,0)+1);
                if(map1.get(c)>map.getOrDefault(c,0)) invalid=true;
            }
            if(!invalid) count+= s.length();
        }
        return count;
    }
}