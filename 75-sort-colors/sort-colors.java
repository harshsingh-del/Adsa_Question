class Solution {
    public void sortColors(int[] nums) {
        int o=0,z=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
            if(nums[i]==1) o++;
            if(nums[i]==2) t++;
        }
        for(int j=0;j<nums.length;j++){
            if(j<z) nums[j]=0;
            else if(j<o+z) nums[j]=1;
            else nums[j]=2;
        }
    }
}