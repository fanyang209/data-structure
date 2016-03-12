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