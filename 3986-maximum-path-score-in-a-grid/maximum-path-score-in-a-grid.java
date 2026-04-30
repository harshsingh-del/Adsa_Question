class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][k + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    dp[i][j][c] = -1;
                }
            }
        }
        int startCost = (grid[0][0] == 0) ? 0 : 1;
        if (startCost <= k) {
            dp[0][0][startCost] = grid[0][0];
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    if (dp[i][j][c] == -1) continue;

                    if (j + 1 < n) {
                        int nextCost = c + (grid[i][j + 1] == 0 ? 0 : 1);
                        if (nextCost <= k) {
                            dp[i][j + 1][nextCost] = Math.max(
                                dp[i][j + 1][nextCost],
                                dp[i][j][c] + grid[i][j + 1]
                            );
                        }
                    }
                    if (i + 1 < m) {
                        int nextCost = c + (grid[i + 1][j] == 0 ? 0 : 1);
                        if (nextCost <= k) {
                            dp[i + 1][j][nextCost] = Math.max(
                                dp[i + 1][j][nextCost],
                                dp[i][j][c] + grid[i + 1][j]
                            );
                        }
                    }
                }
            }
        }
        int ans = -1;
        for (int c = 0; c <= k; c++) {
            ans = Math.max(ans, dp[m - 1][n - 1][c]);
        }

        return ans;
    }
}