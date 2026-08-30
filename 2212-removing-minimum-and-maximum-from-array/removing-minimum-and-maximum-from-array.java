class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[min]) min = i;
            if (nums[i] > nums[max]) max = i;
        }

        int x = Math.min(min, max);
        int y = Math.max(min, max);

        int left = y + 1;
        int right = n - x;
        int split = x + 1 + n - y;

        return Math.min(left, Math.min(right, split));
    }
}