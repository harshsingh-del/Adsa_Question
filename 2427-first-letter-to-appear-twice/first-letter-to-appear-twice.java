class Solution {
    public char repeatedCharacter(String s) {
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    return s.charAt(j);
                }
            }
        }
        return ' ';
    }
}