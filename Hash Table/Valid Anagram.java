public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sort_s = s.toCharArray();
        char[] sort_t = t.toCharArray();
         Arrays.sort(sort_s);
         Arrays.sort(sort_t);
        
        for(int i = 0; i < sort_s.length; i++){
            if(sort_s[i] != sort_t[i])
            return false;
        }
        return true;
    }
}