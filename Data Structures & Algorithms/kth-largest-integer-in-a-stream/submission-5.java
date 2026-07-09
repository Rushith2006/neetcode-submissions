class KthLargest {
     private int k;
     private PriorityQueue<Integer> minh;
    public KthLargest(int k, int[] nums) {
        this.k =k;
        this.minh = new PriorityQueue<>();
        for(int num : nums)
        {
            minh.offer(num);
        
        if(minh.size()>k)
        {
            minh.poll();
        }
        }
    }
    
    public int add(int val) {
        minh.offer(val);
        if(minh.size()>k)
        {
            minh.poll();
        }
        return minh.peek();
    }
}
