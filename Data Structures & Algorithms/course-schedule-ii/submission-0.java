class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> ans  = new ArrayList<>();
        int[] in = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            ans.add(new ArrayList<>());
        }
        for(int[] p: prerequisites)
        {
            int c = p[0];
            int pre = p[1];
            ans.get(pre).add(c);
            in[c]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(in[i]==0)
            {
                q.add(i);
            }
        }
        int c =0;
        int[] arr = new int[numCourses];
        while(!q.isEmpty())
        {
            int cur = q.poll();
            arr[c] = cur;
            c++;
            for(int ne : ans.get(cur))
            {
                in[ne]--;
                if(in[ne]==0)
                {
                    q.add(ne);
                }
            }
        }
        if(c == numCourses)
        {
            return arr;
        }
        return new int[0];
    }
}
