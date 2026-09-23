class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                word.append(ch);

            }else if(word.length()>0)  {
                word.reverse();
                sb.append(word);
                word.setLength(0);
                sb.append(" ");
            }
        }
        word.reverse();
        sb.append(word);
        return sb.toString().trim();
    }
}