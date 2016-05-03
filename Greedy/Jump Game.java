public class Solution {
    public boolean canJump(int[] nums) {
        boolean[] can = new boolean[nums.length];
        // 初始化
        can[0] = true;
        
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(can[j] && j + nums[j] >= i){
                    can[i] = true;
                    break;
                }
            }
        }
        return can[nums.length - 1];
    }
}