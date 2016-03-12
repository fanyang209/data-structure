public class Solution {
    
    public int countPrimes(int n) {
        
      if(n <= 1){
          return 0;
      }
      
      boolean[] isPrime = new boolean[n];
      
    //   assign number at [2,n] as prime number
    for(int i = 2;i <n; i++){
        isPrime[i] = true;
    }
    
    // iterate all a's in a*b = n. a is[2, sqrt(n)]
    for(int i = 2; i * i < n; i++){
        if(!isPrime[i]){
            continue;
        }
        
        // start from i*i  , core code
        for(int j = i*i; j < n; j+=i ){
            isPrime[j] = false;
        }
    }
    
    int count = 0;
    for(int i = 2; i < n; i++){
        if(isPrime[i])
        count++;
    }
    return count;
}
}
