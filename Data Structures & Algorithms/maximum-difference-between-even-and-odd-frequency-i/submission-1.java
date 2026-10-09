class Solution {
    public int maxDifference(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
         for(char ch : s.toCharArray())
         {
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         int max =Integer.MIN_VALUE;
         int min =Integer.MAX_VALUE;
         for(char v : map.keySet())
         {
            if(map.get(v)%2==1)
            {
                max= Math.max(max,map.get(v));
            }
            else{
                min = Math.min(min,map.get(v));
            }
         }
         return max-min;
    }
}