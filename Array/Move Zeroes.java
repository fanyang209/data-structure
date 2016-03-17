// two pointers, one for iterating nums, another for tacking the position of 0
// move all the numbers bigger than 0 to front and fill in 0 in the end

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