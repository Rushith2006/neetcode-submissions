class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int n = queries.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] qc = queries.clone();
        Arrays.sort(qc);
        int i=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int q : qc)
        {
            while(i<intervals.length && intervals[i][0]<=q)
            {
                int l = intervals[i][0];
                int r = intervals[i][1];
                int len = r-l+1;
                pq.add(new int[]{len,r});
                i++;
            }
            
            while(!pq.isEmpty() && pq.peek()[1]<q)
            {
                pq.poll();
            }

            if(pq.isEmpty())
            {
                map.put(q,-1);
            }
            else
            {
                map.put(q,pq.peek()[0]);
            }
            
        }
        int[] arr = new int[n];
        for(int j =0;j<n;j++)
        {
            arr[j]=map.get(queries[j]);
        }
        return arr;
    }
}
