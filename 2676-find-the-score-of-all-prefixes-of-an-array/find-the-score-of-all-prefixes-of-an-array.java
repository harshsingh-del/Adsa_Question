class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long mx=0;
        long [] arr= new long[n];
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            arr[i]=nums[i]+mx;
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}