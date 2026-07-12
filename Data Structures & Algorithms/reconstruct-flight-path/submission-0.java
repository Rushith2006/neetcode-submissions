class Solution {
    HashMap<String,  PriorityQueue<String>> map = new HashMap<>();
        LinkedList<String> ans = new LinkedList<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> t : tickets)
        {
            String from = t.get(0);
            String to = t.get(1);

            map.putIfAbsent(from,new PriorityQueue<>());
            map.get(from).add(to);

        }
        dfs("JFK");
        return ans;
    }
    public void dfs(String a)
    {
        PriorityQueue<String> pq  = map.get(a);
        while(pq!=null && !pq.isEmpty() )
        {
            String n = pq.poll();
            dfs(n);
        }
        ans.addFirst(a);
    }
}
