class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> m = new PriorityQueue<>();
        for(int ston : stones)
        {
            m.offer(-ston);
        }
        while(m.size()>1)
        {
            int f = m.poll();
            int s = m.poll();
            if(s>f)
            {
                m.offer(f-s);
            }
        }
        m.offer(0);
        return Math.abs(m.peek());
    }
}
