class Solution {
    public int maxProduct(int[] nums) {
        int p =1;
        int s =1;
        int val =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(p==0) p =1;
            if(s ==0) s =1;
            p *= nums[i];
            s *= nums[nums.length-i-1];
             val =Math.max(val,Math.max(p,s));

        }
        return val;
        
    }
}
