class Solution {
    int[][] dp;
    public int findTargetSumWays(int[] nums, int target) {
        dp = new int[nums.length][2001];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return solve(nums, target, 0, 0);
    }
    int solve(int[] nums, int target, int i, int sum) {
        if (i == nums.length)
            return sum == target ? 1 : 0;
        if (dp[i][sum + 1000] != -1)
            return dp[i][sum + 1000];
        int add = solve(nums, target, i + 1, sum + nums[i]);
        int sub = solve(nums, target, i + 1, sum - nums[i]);
        return dp[i][sum + 1000] = add + sub;
    }
}