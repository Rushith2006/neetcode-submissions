class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dp = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int ide =0;
        for(int i=0;i<k;i++)
        {
            while(!dp.isEmpty() && nums[dp.peekLast()]<=nums[i])
            {
                dp.pollLast();
            }
            dp.offerLast(i);
        }
       res[ide++] = nums[dp.peekFirst()];

       for(int i=k;i<n;i++)
       {
        if(!dp.isEmpty() && dp.peekFirst()<i-k+1)
        {
            dp.pollFirst();
        }
        
         while(!dp.isEmpty() && nums[dp.peekLast()]<=nums[i])
            {
                dp.pollLast();
            }
            dp.offerLast(i);
         
          res[ide++] = nums[dp.peekFirst()];
       }
       return res;
    }
}
