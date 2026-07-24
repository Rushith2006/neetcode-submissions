class Solution {
    public int jump(int[] nums) {
        int goal = nums.length-1;
        int f=0;
        while(goal>0)
        {
            for(int i = 0;i<goal;i++)
            {
                if(i+nums[i]>=goal)
                {
                    goal = i;
                    f++;
                    break;
                }
               
            }
        }
        return f;
    }
}
