/*这道题也是3sum的变体，这里找到的不仅使3sum==target，同时如果没有找到==target的3sum要返回最接近target的值。
于是，这就需要在使用二分查找法时遍历数组的时候，维护一个最接近target值min，这样当完全遍历完数组扔没找到与target相等的3sum时，可以返回维护的这个min值。*/
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length ==  0) 
            return 0;
        
        int min = Integer.MAX_VALUE;
        int val = 0;
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length - 3; i++){
            int low = i + 1;
            int high = nums.length - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(Math.abs(target - sum) < min){
                    min = Math.abs(target - sum);
                    val = sum;
                }
                
                if(target == sum){
                    return val;
                }else if(target > sum){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return val;
    }
}