public class Solution {
    
    public boolean isAlphanumeric(char c){
        if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) return true;
        return false;
    }
    
    public boolean isPalindrome(String s) {
        if(s == null) return false;
        s = s.trim().toLowerCase();
        int length = s.length();
        if(length <= 1) return true;
        int head = 0, tail = length - 1;
        while(head < tail){
            while(head < tail && !isAlphanumeric(s.charAt(head))) head++;
            while(head < tail && !isAlphanumeric(s.charAt(tail))) tail--;
            if(s.charAt(head) != s.charAt(tail)) return false;
            head++;
            tail--;
        }
        return true;
    }
}