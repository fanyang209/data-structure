// use hashset to store num[i], judge if hashset contains current nums[i], 
// if true, return true, else add nums[i] into hashset.
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(! set.contains(nums[i]))
              set.add(nums[i]);
             else
              return true;
        }
        
        return false;
    }
}