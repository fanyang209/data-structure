public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                 continue;
               
            }else{
                nums[j++] = nums[i];
            }
            
            
        }
        
        for(int k = j; k < nums.length; k++){
            nums[k] = 0;
        }
    }
}