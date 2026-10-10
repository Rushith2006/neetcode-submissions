class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] arr = new int[2];
        HashSet<Integer> map = new HashSet();
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
             
             if(map.contains(grid[i][j]))
             {
                arr[0] = grid[i][j];
             }
             map.add(grid[i][j]);
            }
        }  
        for(int i=1;i<=(n*m);i++)
        {
            if(!map.contains(i))
            {
                arr[1] = i;
            }
        }  
        return arr;

    }
}