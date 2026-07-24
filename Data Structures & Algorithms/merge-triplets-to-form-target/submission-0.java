class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean i = false;
        boolean j = false;
        boolean k = false;
        for(int[] t: triplets)
        {
            if(t[0]>target[0]||
               t[1]>target[1]||
               t[2]>target[2])
               {
                continue;
               }
             if(t[0]==target[0])
             {
                i = true;
             }
             if(t[1]==target[1])
             {
                j = true;
             }
             if(t[2]==target[2])
             {
                k = true;
             }
        }
        return i&&j&&k;
    }
}
