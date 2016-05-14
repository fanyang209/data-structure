public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<Integer> cur = new LinkedList<Integer>();
        subsets(res, nums, cur, 0);
        return res;
    }
    
    private void subsets(List<List<Integer>> result, int[] S, LinkedList<Integer> current, int idx) {
    if (idx == S.length) {
        result.add(new LinkedList<Integer>(current));
        return;
    } 
    current.addLast(S[idx]);
    subsets(result, S, current, idx+1);
    current.removeLast();
    subsets(result, S, current, idx+1);
   }
}