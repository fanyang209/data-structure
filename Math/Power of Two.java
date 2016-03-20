// if n % 2 != 0, showing it's not power of two, attention the 
// breaking case for the while loop is n > 1.
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        
        while(n > 1){
            if(n % 2 != 0) return false;
            n = n / 2;
        }
        return true;
    }
}