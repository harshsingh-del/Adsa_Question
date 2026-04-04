class Solution {
    static void src(char[] s, int l,int r){
       if(l>=r) return ;
       char temp=s[l];
       s[l]=s[r];
       s[r]=temp;
       src(s,l+1,r-1);
    }
    public void reverseString(char[] s) {
        // int n=s.length();
     src(s,0,s.length-1);
    }
}