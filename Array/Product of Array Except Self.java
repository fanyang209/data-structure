public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        
        int[] res = new int[nums.length];
        res[0] = 1;
        int left = 1, right = 1;
        
        for(int i = 1; i < nums.length; i++){
            left *= nums[i - 1];
            res[i] = left;
        }
        
        for(int i = nums.length - 2; i >= 0; i--){
            right *= nums[i + 1];
            res[i] = right * res[i];
        }
        
        return res;
    }
}