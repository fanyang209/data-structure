public class Solution {
    public boolean isPowerOfThree(int n) {
        
    // 使用 log3 来判断。由于直接使用 log3(n) //会因为计算精度的原因而导致数字越大越难以判断，所以可以通过将结果四舍五入后作为 3 //的次方再次求得一个数。如果这个数等于输入值 n，说明是 3 的某次方，反之不是。    
        if(n <= 0) return false;
        
        return Math.pow(3, Math.round(Math.log(n) / Math.log(3))) == n;
    }
}