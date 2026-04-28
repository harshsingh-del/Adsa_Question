class Solution {
    static int coin(int i,int [] coins,int amount,int [][] dp){
        if(amount==0) return 0;
        if(i==coins.length) return Integer.MAX_VALUE;
        if(dp[i][amount]!=-1) return  dp[i][amount];
        int take=Integer.MAX_VALUE;
       if(coins[i]<=amount) {
           int res=coin(i,coins,amount-coins[i],dp);
           if(res!=Integer.MAX_VALUE){
            take= 1+res;
           }
       }
        int skip=coin(i+1,coins,amount,dp);
        dp[i][amount]= Math.min(take,skip);
        return dp[i][amount];
    }
    public int coinChange(int[] coins, int amount) {
        int [][] dp= new int[coins.length+1][amount+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
       int ans=coin(0,coins,amount,dp);   
       return ans== Integer.MAX_VALUE ? -1:ans;
    }
} 