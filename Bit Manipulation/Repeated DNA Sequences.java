public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {  
    List<String> result = new ArrayList<>();  
    Map<Integer, Integer> sumMap = new HashMap<>();  
    int sum = 0;  
    for(int i=0; i<s.length(); i++) {  
        sum = ((sum << 3) | (s.charAt(i) & 7)) & 0x3FFFFFFF;  
        if(i < 9) continue;  
        Integer cnt = sumMap.get(sum);  
        if(cnt != null && cnt == 1) {  
            result.add(s.substring(i-9, i+1));  
        }   
        sumMap.put(sum, cnt != null ? cnt+1 : 1);  
    }  
    return result;  
}  
}