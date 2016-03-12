public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.isEmpty() || str.isEmpty())
        return false;
        
        String[] s = str.split(" ");
        if(s.length != pattern.length()) return false;
        
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(! map.get(pattern.charAt(i)).equals(s[i]))
                return false;
            }else if(map.containsValue(s[i])){
                return false;
            }else{
                map.put(pattern.charAt(i), s[i]);
            }
        }
        return true;
    }
}