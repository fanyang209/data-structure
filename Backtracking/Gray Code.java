public class Solution {
    public List<Integer> grayCode(int n) {
        if(n == 0){
            List<Integer> res = new ArrayList<Integer>();
            res.add(0);
            return res;
        }
        
        List<Integer> res = grayCode(n - 1);
        int addnumber = 1 << (n - 1);
        int originalsize = res.size();
        
        for(int i = originalsize - 1; i>= 0; i--){
            res.add(addnumber + res.get(i));
        }
        return res;
    }
}