class Solution {
    public int trap(int[] height) {
        int left =0;
        int right= height.length-1;
        int mxleft=height[left];
        int mxright=height[right];
        int water=0;
        while(left<right){
            if(mxleft<mxright){
                left++;
                mxleft=Math.max(mxleft,height[left]);
                water+=mxleft-height[left];

            }else{
                right--;
                mxright=Math.max(mxright,height[right]);
                water+=mxright-height[right];
            }
        }
        return water;
    }
}