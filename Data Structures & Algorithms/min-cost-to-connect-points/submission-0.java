class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] v = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.add(new int[]{0,0});
        int count =0;
        int res =0;
        while(count<n)
        {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];
            if(v[node])
            {
                continue;
            }
            v[node] = true;
            res = res+cost;
            count++;
            
            
            for(int i=0;i<n;i++)
            {
                if(!v[i])
                {
                    int dis = Math.abs(points[node][0] - points[i][0])
                              +
                              Math.abs(points[node][1] - points[i][1]);
                    pq.add(new int[]{i,dis});
                }
            }
        }
        return res;
    }
}
