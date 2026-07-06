class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] c = new int[n][2];
        for(int i=0;i<n;i++)
        {
            c[i][0] = position[i];
            c[i][1] = speed[i];
        }
        Arrays.sort(c,(a,b)->a[0]-b[0]);
        int f=0;
        double len=0;
        for(int i=n-1;i>=0;i--)
        {
            double t = (double)(target-c[i][0])/c[i][1];

            if(t > len)
            {
                f++;
                len = t;
            }
        }
        return f;
    }
}
