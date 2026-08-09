class Solution {
    int [] dp;
    public int robb(int []nums,int i){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+robb(nums,i-2);
        int skip=robb(nums,i-1);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
         dp=new int[n];
        Arrays.fill(dp,-1);
        return robb(nums,nums.length-1);
    }
}