class Solution {
    static void sub( int idx,List<List<Integer>> ans, List<Integer> cur,int[] nums){
        if (idx == nums.length) {
            ans.add(new ArrayList<>(cur));
            return ;
        }
        cur.add(nums[idx]);
        sub(idx+1,ans,cur,nums);
        cur.remove(cur.size()-1);
        sub(idx+1,ans,cur,nums);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> cur= new ArrayList<>();
        sub(0,ans,cur,nums);
        return ans;
    }
}