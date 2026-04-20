class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int ans1 = 0, ans2 = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (colors[j] != colors[0]) {
                ans1 = j;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                ans2 = (n - 1) - i;
                break;
            }
        }

        return Math.max(ans1, ans2);
    }
}