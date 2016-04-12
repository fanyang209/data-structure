public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0)  return 0;
        
        int begin = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= s && begin <= i){
                min = Math.min(min, i - begin + 1);
                sum = sum - nums[begin];
                begin++;
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}