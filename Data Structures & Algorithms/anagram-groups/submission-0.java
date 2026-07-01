class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            int co[] = new int[26];
            for(char c : s.toCharArray())
            {
                co[c - 'a']++;
            }
            String a = Arrays.toString(co);
            map.putIfAbsent(a,new ArrayList<>());
            map.get(a).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
