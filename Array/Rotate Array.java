// no inplace requirement, array is divided into two parts, use 
// a new array to store one part, switch two parts
public class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        if(k > n)
        k = k - n;
        
         if(k == n || k == 0)
          return;
        
        
        int[] newNums = new int[k];
        
        
        for(int i = 0; i < k; i++){
            newNums[i] = nums[n - k + i];
        }
        
        for(int i = 0; i < n - k; i++){
            nums[n - 1 - i] = nums[n - k - 1 - i];
        }
        
        for(int i = 0; i < k; i++){
            nums[i] = newNums[i];
        }
    }
}


//  inplace method, array is divided into two parts, reverse
// every part first, then reverse the whole array

public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        k = k % n;
        if(k != 0){
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
        }
    }
    
    public void reverse(int[] nums, int start, int end){
        int temp;
        while(start < end){
        temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }
    }
}