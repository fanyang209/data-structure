public class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        double size = nums.length / 2 ;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])) 
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
                
            if(map.get(nums[i]) > size) return nums[i];
        }
        
        return nums[0];
    }
}