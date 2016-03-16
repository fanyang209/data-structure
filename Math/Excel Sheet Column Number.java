public class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int number = 0;
        // s = s.toUpperCase();
        for (int i = 0; i < s.length(); ++i) {
            number *= 26;
            number += s.charAt(i) - 65 + 1;
        }

        return number;
    }
}