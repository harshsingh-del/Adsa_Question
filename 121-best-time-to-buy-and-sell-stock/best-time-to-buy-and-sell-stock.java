class Solution {
    public int maxProfit(int[] prices) {
        int mx=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
            mx=Math.max(mx,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return mx;
    }
}