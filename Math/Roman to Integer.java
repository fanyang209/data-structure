// use map to store roman and it's corresponding integer. iterate from right
// to left, calculate sum according to the Roman rule 
public class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0)  return -1;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
    
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int res = map.get(s.charAt(n - 1));
        for(int i = n - 2; i >= 0; i--){
            if(map.get(s.charAt(i + 1)) <= map.get(s.charAt(i)))
            res +=  map.get(s.charAt(i));
            else
            res -=  map.get(s.charAt(i));
        }
        return res;
    }
}