class Solution {
    public int coinChange(int[] coins, int amt) {
        int[] dp=new int[amt+1];
        Arrays.fill(dp,amt+1);
        dp[0]=0;
        
        for(int coin:coins){
            for(int j=coin;j<=amt;j++){
                dp[j]=Math.min(dp[j],1+dp[j-coin]);
            }
        }
        return dp[amt]>amt?-1:dp[amt];
    }
}