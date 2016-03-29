public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if(nums == null || nums.length == 0) return res;
        
         //first iteration, find target wherever it is
        int low = 0;
        int high = nums.length - 1;
        int pos = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            pos = mid;
            if(nums[mid] > target){
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                res[0] = pos;
                res[1] = pos;
                break;
            }
        }
        
        if(nums[pos] != target) return res;
        
          //second iteration, find the right boundary of this target
        int newlow = pos;
        int newhigh = nums.length - 1;
        while(newlow <= newhigh){
            int newmid = (newlow + newhigh) / 2;
            if(nums[newmid] == target){
                newlow = newmid + 1;
            }else{
                newhigh = newmid - 1;
            }
        }
        res[1] = newhigh;
        
        
        //third iteration, find the left boundary of this target
        newlow = 0;
        newhigh = pos;
        while(newlow <= newhigh){
             int newmid = (newlow + newhigh) / 2;
              if(nums[newmid] == target){
                newhigh = newmid - 1;
            }else{
                newlow = newmid + 1;
            }
        }
        res[0] = newlow;
        
        return res;
    }
}