class Solution {
    public int strStr(String heystack, String needle) {
        int n=needle.length();
       
        for(int i=0;i<=heystack.length()-n;i++){
            String p=heystack.substring(i,i+needle.length());
            if(p.equals(needle)){
                return i;
            }
                
            
        }
        return -1;
    }
}