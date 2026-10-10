class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long) n * n;
        long expectedSum = N * (N + 1) / 2;
        long expectedSqSum = N * (N + 1) * (2 * N + 1) / 6;
        long sum = 0, sqSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                sum += num;
                sqSum += (long) num * num;
            }
        }

        long diff = sum - expectedSum;
        long sqDiff = sqSum - expectedSqSum;
        long sumXY = sqDiff / diff;

        int repeated = (int) ((diff + sumXY) / 2);
        int missing = (int) (sumXY - repeated);

        return new int[]{repeated, missing};
    }
}