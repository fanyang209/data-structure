public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();

        if(nums == null || nums.length == 0)  return res;

        Arrays.sort(nums);
        res.add(temp);

        dfs(res, temp, nums, 0);

        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int pos){

        for(int i = pos; i < nums.length; i++){
            temp.add(nums[i]);
            res.add(new ArrayList<Integer>(temp));
            dfs(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
            while(i < nums.length - 1 && nums[i] == nums[i + 1])  i++;
        }
    }
}