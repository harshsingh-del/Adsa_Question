class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char [] ch=s.toCharArray();
        char [] ch1=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String st= new String(ch);
        String st1= new String(ch1);
        return st.contains(st1);
        
    }
}