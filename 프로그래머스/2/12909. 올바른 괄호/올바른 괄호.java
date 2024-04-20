import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            } else { // ch == ')'
                if(stack.isEmpty()) {
                    return false; // 스택이 비어있다면 올바르지 않은 괄호
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // 스택이 비어 있어야 올바른 괄호
    }
}
