class Solution {
    public int majorityElement(int[] nums) {
        int mx=nums.length/2;
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                c++;
            }
        }
        if(c>mx){
           return nums[i];
        }
        }
        return -1;
    }
}