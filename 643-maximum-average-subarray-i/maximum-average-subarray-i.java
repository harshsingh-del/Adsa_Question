class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int mx=0;
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=nums[i];
        }
        mx=curr;
        for(int i=k;i<nums.length;i++){
            curr=curr+nums[i]-nums[i-k];
            if(curr>mx){
                mx=curr;
            }
        }
        return (double)mx/k;
    }
}