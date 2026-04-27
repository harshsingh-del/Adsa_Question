class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int m=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                m+=prices[i]-prices[i-1];
            }
        }
        return m;
    }
}