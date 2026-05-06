class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp= new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int curr=mp.get(ch);
                mp.put(ch,curr+1);
            }
        }
        for(int i=0;i<t.length();i++){
            Character ch= t.charAt(i);
            if(!mp.containsKey(ch) || mp.get(ch)==0) {
                return false;
            }else{
                mp.put(ch,mp.get(ch)-1);
            }
        }
        return true;
    }
}