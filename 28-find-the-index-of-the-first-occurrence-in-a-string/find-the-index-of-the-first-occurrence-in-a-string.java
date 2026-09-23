class Solution {
    public int strStr(String heystack, String needle) {
        for(int i=0;i+needle.length()<=heystack.length();i++){
            if(heystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}