// use hashmap, nums[i] as key, i as value, iterate nums, every time check if map containskey target - nums[i], if yes, find it,
// otherwise put nums[i] into map
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) return nums;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] twoIndex = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                twoIndex[1] = i;
                twoIndex[0] = map.get(target - nums[i]);
                return twoIndex;
            }else{
                map.put(nums[i],i);
            }
        }
        
        return null;
    }
}