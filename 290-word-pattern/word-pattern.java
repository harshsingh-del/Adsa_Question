class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        for (int i = 0; i < words.length; i++) {
            if (pattern.indexOf(pattern.charAt(i)) !=
                java.util.Arrays.asList(words).indexOf(words[i]))
                return false;
        }
        return true;
    }
}