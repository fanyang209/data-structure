public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0) return res;
        
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<Integer>(), res);
        return res;
    }
    
    public void helper(int[] candidates, int start, int target, ArrayList<Integer> item,  List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        if(target < 0 || start >= candidates.length) return;
        
        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i - 1]) continue;
            item.add(candidates[i]);
            helper(candidates, i + 1, target - candidates[i], item, res);
            item.remove(item.size() - 1);
        }
    }
}