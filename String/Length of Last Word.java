public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty() || s.length() == 0) return 0;
        s = s.trim();
        for(int i = s.length() - 1; i >= 0; i-- ){
            
            if(s.charAt(i) == ' ') return s.length() - 1 - i;
        }
         return s.length();
    }
}