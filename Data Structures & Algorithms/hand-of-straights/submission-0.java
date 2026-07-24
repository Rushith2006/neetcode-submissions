class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize!=0)
        {
            return false;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i =0;i<hand.length;i++)
        {
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        while(!map.isEmpty())
        {
           int f = map.firstKey();
           for(int i =0;i<groupSize;i++)
           {
            int c = f+i;
            if(!map.containsKey(c))
            {
                return false;
            }
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
