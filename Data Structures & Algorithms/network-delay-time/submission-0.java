class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> ans = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            ans.add(new ArrayList<>());
        }
        for(int[] e : times)
        {
            ans.get(e[0]).add(new int[]{e[1],e[2]});
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k,0});
        while(!pq.isEmpty())
        {
            int[] cur = pq.poll();
            int node = cur[0];
            int time = cur[1];
            for(int[] ne : ans.get(node))
            {
                int noden = ne[0];
                int w = ne[1];
                int newtime = time + w;
                if(newtime<dist[noden])
                {
                    dist[noden] = newtime;
                    pq.add(new int[]{noden,newtime});
                }
            }
        }
            int a =0;
            for(int i=1;i<=n;i++)
            {
                if(dist[i]==Integer.MAX_VALUE)
                {
                    return -1;

                }
              
                    a = Math.max(a,dist[i]);
                
            }
            
        
        return a;
    }
}
