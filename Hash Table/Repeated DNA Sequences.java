/*我们可以考虑使用A,C,G,T的ASCII码的二进制来替代map映射表。当然，必须保证字符大小写格式完全统一。

A: 1000001
C: 1000011
G: 1000111
T: 1010100
可以看出，A,C,G,T的后三位都不同。我们可以仅用后三位来代表每个字符。10个字符的话我们需要30位，正好低于Integer的32位。这次我们则需要30位的掩码 0x3FFFFFFF 来保证我们只拿30位即最近10个字符。*/
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