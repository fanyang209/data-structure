public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        String item = new String();
        
        if(n <= 0) return res;
        
        dfs(res, item, n, n);
        return res;
    }
    
    public void dfs(List<String> res, String item, int left, int right){
        if(left > right) return;
        
        if(left == 0 && right == 0){
            res.add(new String(item));
            return;
        }
        
        if(left > 0){
            dfs(res, item + '(', left - 1, right);
        }
        if(right > 0){
            dfs(res, item + ')', left, right - 1);
        }
    }
}