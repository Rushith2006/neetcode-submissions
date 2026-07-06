class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int  ro = matrix.length;
        int  co = matrix[0].length;
        int low = 0,high = ro*co-1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            int r = mid/co;
            int c = mid%co;
            if(matrix[r][c] == target)
            {
                return true;
            }
            else if(target > matrix[r][c])
            {
                low = mid +1;
            }
            else
            {
                high = mid-1;
            }
        }
        return false;

      
    }
}
