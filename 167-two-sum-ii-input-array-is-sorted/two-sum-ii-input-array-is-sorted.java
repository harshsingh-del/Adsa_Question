class Solution {
    public int[] twoSum(int[] arr, int target) {
        int lo=0, hi=arr.length-1;
        int n=arr.length;
        int [] ar=new int[2];
        while(hi<n){
            for(int i=0;i<arr.length;i++){
                int s=arr[lo]+arr[hi];
                if(target>s){
                    lo++;
                }else if(target<s){
                    hi--;
                }else{
                    ar[0]=lo+1;
                    ar[1]=hi+1;
                    return ar;
                }
            }
        }
            return ar;
    }
}