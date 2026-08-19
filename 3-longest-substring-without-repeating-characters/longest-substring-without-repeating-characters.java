class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int end=0;
        int mx=0;
        List<Character> lis= new ArrayList<Character>();
        for(int i=0;i<=s.length()-1;i++){
            if(!lis.contains(s.charAt(i))){
                lis.add(s.charAt(i));
                mx=Math.max(mx,lis.size());
                end++;
            }else{
                lis.remove(Character.valueOf(s.charAt(st)));
                st++;
                i--;
            }
        }
        return mx;

    }
}