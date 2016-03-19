public class Solution {
    public int rob(int[] nums) {
        
        if(nums == null){
            return 0;
        }
        
        int odd = 0;
        int even = 0;
        
        for(int i = 0; i < nums.length;i++){
            if(i % 2 != 0){
               odd = Math.max(even, odd + nums[i]);
            }else{
                even = Math.max(odd, even + nums[i]);
            }
            
        
        }
        return Math.max(odd, even);
    }
}