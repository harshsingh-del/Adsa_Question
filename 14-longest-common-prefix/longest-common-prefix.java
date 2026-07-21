class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st=strs[0];
        String st1 = strs[strs.length - 1];
        int idx=0;
        while(idx<st.length() && idx<st1.length()){
          if(st.charAt(idx)==st1.charAt(idx)) {
            idx++;
          }else{
            break;
          }
        }
        
        return  st.substring(0,idx);
        
    }
}