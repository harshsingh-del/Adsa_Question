class Solution {
    public int maxSubArray(int[] nums) {
        int mx=nums[0] , curr=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            mx=Math.max(curr,mx);
        }
        return mx;
    }
}