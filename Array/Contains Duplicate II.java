// use hashtable store nums[i] as key, index as value. if there is 
// is no key the same as before. put in hashmap, else compare  
// difference between index and current index if it is within k.  

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            int pre = map.get(nums[i]);
            if(i-pre<=k)
                return true;
        }
        map.put(nums[i], i);
        }
 
    return false;
    }
}