class Solution {
    public char findTheDifference(String s, String t) {
        int tot=0;
        for(int i=0;i<t.length();i++){
            tot+=t.charAt(i);
        }
        for(int j=0;j<s.length();j++){
            tot=tot-s.charAt(j);
        }
        
        return (char)tot;
    }
}