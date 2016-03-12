public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int length = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)  continue;
            else {
                nums[length++] = nums[i];
            }
        }
        if(length != 0 && length != nums.length)
        for(int j = length; j < nums.length; j++){
            nums[j] = 0;
        }
    }
}