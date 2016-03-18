// two pointers, one for iteration, another to track the position
// of different elements, if nums[i] == nums[length], continue,
// otherwise override duplicated number.
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int length = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[length]){
                nums[++length] = nums[i];
            }
        }
        
        return length + 1;
    }
}