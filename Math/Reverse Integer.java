public class Solution {
    public int reverse(int x) {
        
    // 注意Integer.MIN_VALUE的绝对值是比Integer.MAX_VALUE大1的，所以经常要单独处理    
        if(x==Integer.MIN_VALUE)
         return 0;
        
        int lastDigit = 0;
        int res = 0;
        boolean isNeg = x > 0? false:true;
        
        x = Math.abs(x);
        while(x > 0){
            
            if(res>(Integer.MAX_VALUE-x%10)/10)//非常巧妙的判断了越界问题
            return 0;
            lastDigit = x % 10;
            res = 10*res + lastDigit;
            x /= 10;
        }
        
        if(res < 0) return -1;
        if(isNeg){
            res = res*-1;
        }
        
        return res;
    }
}