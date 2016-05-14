public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        
        int pre = 1;
        int cur = 2;
        
        while(cur < nums.length){
            if(nums[cur] == nums[pre] && nums[cur] == nums[pre - 1]){
                cur++;
            }else{
                pre++;
                nums[pre] = nums[cur];  // why the same value
                cur++;
            }
        }
        return pre + 1;
    }
}