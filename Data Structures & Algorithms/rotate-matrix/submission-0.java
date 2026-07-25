class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
       reverse(matrix,n);
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<matrix[i].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;

            }
        }
          
         
    }
     void reverse(int[][] m,int n)
     {
        for(int i=0;i<n/2;i++)
        {
            int[] temp = m[i];
            m[i]=m[n-i-1];
            m[n-i-1] = temp;
        }
     }
}
 