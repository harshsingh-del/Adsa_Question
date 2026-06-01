class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        for (int c:cost) {
            total+=c;
        }
        for (int i=cost.length-3;i>=0;i-=3) {
            total-=cost[i];
        }
        return total;
    }
}