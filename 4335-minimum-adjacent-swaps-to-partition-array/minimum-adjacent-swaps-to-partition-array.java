class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        final long MOD = 1_000_000_007L;
        long ans = 0;
        long mid = 0;
        long right = 0;
        for (int x : nums) {
            if (x < a) {
                ans += mid + right;
            } else if (x <= b) {
                ans += right;
                mid++;
            } else {
                right++;
            }
        }
        return (int)(ans % MOD);
    }
}