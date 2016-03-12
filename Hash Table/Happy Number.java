public class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> check = new HashSet<>();
        
        
        int sum = n;
        
        
        while(true){
            
            sum = getSum(sum);
            
            if(sum == 1)
            return true;
            
            if(check.contains(sum))
            return false;
            else
            check.add(sum);
        }
        
        
    }
    
    int s = 0;
     
    
    public int getSum(int n){
            
           if(n / 10 > 0){
               getSum(n /10);
           }
           
           int digit = n % 10;
           s +=  digit * digit;
            
            return s;
        }
}