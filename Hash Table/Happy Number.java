public class Solution {
    public boolean isHappy(int n) {
       
      Set<Integer> loop = new HashSet<>();
      loop.add(n);
      return happy(n,loop);
    }
    
    public boolean happy(int n, Set<Integer> loop){
        
        int sum = 0;
        // calculate sum
        while(n > 0){
            int digit = n % 10;
            sum += digit*digit;
            n = n / 10;
        }
        
        if(sum == 1){
            return true;
        }else if(loop.contains(sum)){
            return false;
        }else{
            loop.add(sum);
            return happy(sum, loop);
        }
    }
}