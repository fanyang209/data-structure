public class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        double size = nums.length/2;
        
        for(int n: nums){
            
            if(map.get(n) == null){
                map.put(n, 1);
            }else{
                map.put(n, map.get(n) + 1);
            }
            
            if(map.get(n) > size)
            return n;
        }
        
        return nums[1];
    }
}