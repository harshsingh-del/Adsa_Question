class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int n=prices.length;
        int ans=0;
        for(int i=1;i<n;i++){
            int prof=prices[i]-min;
            if(prof>ans) ans=prof;
            min=Math.min(min,prices[i]);
        }
        return ans;
    }
}