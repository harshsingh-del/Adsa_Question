class Solution {
    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length && nums[j] <= 2 * nums[i]; j++) {
                ans = Math.max(ans, nums[i] ^ nums[j]);
            }
        }

        return ans;
    }
}