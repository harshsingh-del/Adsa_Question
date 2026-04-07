class Solution {
    static int min(int [][] grid, int i, int j, int [][] dp){
         int n=grid.length;
        int m=grid[0].length;
         if (i >= n || j >= m)    return Integer.MAX_VALUE;
        if (i == n - 1 && j == m - 1)   return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int right=min(grid,i+1,j,dp);
        int left=min(grid,i,j+1,dp);
         return dp[i][j]=Math.min(right,left)+grid[i][j];
    }
    public int minPathSum(int[][] grid) {
         int n=grid.length;
        int m=grid[0].length;
        int[][] dp= new int[n][m];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
       return  min(grid,0,0,dp);
    }
}