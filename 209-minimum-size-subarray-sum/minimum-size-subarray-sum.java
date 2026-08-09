class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int curr=0;
        int min=Integer.MAX_VALUE;
        for(int high=0;high<nums.length;high++){
              curr+=nums[high];
              while(target<=curr){
             int win=high-low+1;
                min=Math.min(min,win);
                curr-=nums[low];
                low++;
              }
        }
        return min==Integer.MAX_VALUE ? 0 :min;
    }
}