class Solution {
    public int missingNumber(int[] nums) {
        int sum=0, n=nums.length;
        int actsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        actsum=n*(n+1)/2;
        int mis =actsum-sum;
    return mis;
    }
}