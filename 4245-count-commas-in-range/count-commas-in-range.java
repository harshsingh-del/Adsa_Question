class Solution {
    public int countCommas(int n) {
        long totalCommas = 0;
        long start = 1000;
        
        while (start <= n) {
            totalCommas += (n - start + 1);
            start *= 1000;
        }
        
        return (int) totalCommas;
    }
}