public class Solution {
    public int myAtoi(String str) {
        
        if(str == null || str.length() == 0) return 0;
        
        str = str.trim();
        
        boolean positive = true;
        int i = 0;
        if(str.charAt(0) == '+'){
            i++;
        }else if(str.charAt(0) == '-'){
            positive = false;
            i++;
        }
        
        double temp = 0;
        for(; i < str.length(); i++){
            int digit = str.charAt(i) - '0';
            if(digit < 0 || digit > 9) break;
            
             temp = 10*temp + digit;
        }
        
        if(!positive)
        temp = -temp;
        
         int ret = (int)temp;  
         return ret;  
    }
}