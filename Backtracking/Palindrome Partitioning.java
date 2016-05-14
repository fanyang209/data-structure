public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> item = new ArrayList<String>();
        
        if(s == null || s.length() == 0) return res;
        
        dfs(s, 0, item, res);
        return res;
    }
    
    public void dfs(String s, int start,  List<String> item, List<List<String>> res){
        if(start == s.length()){
            res.add(new ArrayList<String>(item));
            return;
        }
        
        for(int i = start; i < s.length(); i++){
            String str = s.substring(start, i + 1);
            if(isPalindrome(str)){
                item.add(str);
                dfs(s, i + 1, item, res);
                item.remove(item.size() - 1);
            }
        }
    }
    
    public boolean isPalindrome(String s){
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}