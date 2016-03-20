// every time compare the first and last number, if true, contiune, otherwise
// return false.
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
       // find the divider same digit as x
        int div = 1;
        while(x / div >= 10){
            div*= 10;
        }
        
        while(x != 0){
            int left = x / div;  // first number
            int right = x % 10;  // last number
            
            if(left != right)  return false;
            
            x = (x % div) / 10;  // delete the first and last number
            div /= 100; // because remove two digits, divider alse need to remove two digits
        }
        
        return true;
    }
}