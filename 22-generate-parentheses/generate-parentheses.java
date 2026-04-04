class Solution {
    static void para(int n,int l, int r,  List<String> ans,String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        } 
        if(l<n)  para(n,l+1,r,ans,s+"(");
        if(r<l)  para(n,l,r+1,ans,s+")");
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        String s;
         para(n,0,0,ans,"");
         return ans;
    }
}