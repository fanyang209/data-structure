public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<String>();
        
        if(nums == null || nums.length == 0) return list;
        
        int start = 0;
        for(int i = 0; i < nums.length ; i++){
            if(i + 1 < nums.length &&  nums[i] + 1 == nums[i + 1] )  continue;
            else if(i != start){
                    String str = nums[start] + "->" + nums[i];  
                    list.add(str);  
                    start = i + 1 ;
            }else{
                 list.add(Integer.toString(nums[start++]));
                 
            }
        }
        
        return list;
    }
}