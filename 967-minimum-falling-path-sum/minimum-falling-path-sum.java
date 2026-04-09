class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int down = matrix[i + 1][j];
                int leftDiagonal = (j > 0) ? matrix[i + 1][j - 1] : Integer.MAX_VALUE;
                int rightDiagonal = (j < n - 1) ? matrix[i + 1][j + 1] : Integer.MAX_VALUE;
                matrix[i][j] += Math.min(down, Math.min(leftDiagonal, rightDiagonal));
            }
        }
        int min = Integer.MAX_VALUE;
        for (int val : matrix[0]) {
            min = Math.min(min, val);
        }

        return min;
    }
}