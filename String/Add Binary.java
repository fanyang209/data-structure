public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum, m, n;
        while(i >= 0 || j >= 0){
            m = i >= 0? a.charAt(i) - '0' : 0;
            n = j >= 0? b.charAt(j) - '0' : 0;
            sum = m + n + carry;
            carry = sum / 2;
            sb.insert(0, String.valueOf(sum % 2));
            i--;
            j--;
        }
        if(carry != 0)
        sb.insert(0, '1');
        return sb.toString();
    }
}