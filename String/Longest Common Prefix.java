public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)  return "";
        StringBuilder sb = new StringBuilder();
       for(int i = 0; i < strs[0].length(); i++){
            char x = strs[0].charAt(i);
        for(int j = 1; j < strs.length;j++){
           if(strs[j].length() == i || strs[j].charAt(i) != x) 
           return strs[0].substring(0,i);
        }
      }
      return strs[0];
    }
}