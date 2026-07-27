class CountSquares {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public CountSquares() {
       map =  new HashMap<>();
    }
    
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        map.putIfAbsent(x,new HashMap<>());
        HashMap<Integer,Integer> y1  = map.get(x);
        y1.put(y,y1.getOrDefault(y,0)+1);
    }
    
    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
         int ans=0;
        if(!map.containsKey(x))
        {
            return 0;
        }
        for(int y2 : map.get(x).keySet())
        {
            if(y2==y)
            {
                continue;
            }
            int size = y2-y;
            int x1 = x-size;
            int x2 = x+size;
            int fre = map.get(x).get(y2);
           
            if(map.containsKey(x1))
            {
               int f1 = map.get(x1).getOrDefault(y, 0);
               int f2 = map.get(x1).getOrDefault(y2, 0);

                ans += fre*f1*f2;
            }
            if(map.containsKey(x2))
            {
                int f1 = map.get(x2).getOrDefault(y,0);
                int f2 = map.get(x2).getOrDefault(y2,0);
                ans +=fre*f1*f2;
            }
        }
        return ans;
        
    }
}
