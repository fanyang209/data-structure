public class Solution {
    public int calculate(String s) {
        s = s.replace(" ", "");
        Stack<Long> stack = new Stack<Long>();
        String firstNum = getNum(0, s);
        stack.push(Long.parseLong(firstNum));
        int i = firstNum.length();
        while(i < s.length()){
            char c = s.charAt(i);
            String numStr = getNum(i + 1, s);
            
            if(c == '+'){
                stack.push(Long.parseLong(numStr));
            }
            if(c == '-'){
                stack.push(-Long.parseLong(numStr));
            }
            if(c == '*'){
                stack.push(stack.pop() * Long.parseLong(numStr));
            }
            if(c == '/'){
                stack.push(stack.pop() / Long.parseLong(numStr));
            }
            i = i + numStr.length() + 1;
        }
        long res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return (int)res;
    }
    
    public String getNum(int i, String s){
        StringBuilder num = new StringBuilder();
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            num.append(s.charAt(i));
            i++;
        }
        return num.toString();
    }
}