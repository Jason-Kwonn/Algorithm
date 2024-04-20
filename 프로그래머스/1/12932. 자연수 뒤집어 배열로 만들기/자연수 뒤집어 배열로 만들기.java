import java.util.Stack;

class Solution {
    public int[] solution(long n) {
        Stack<Integer> stack = new Stack<>();
        String s = String.valueOf(n);
        for(char c : s.toCharArray()){
            stack.push(Character.getNumericValue(c));
        }
        
        int[] answer = new int[s.length()];
        
        int i = 0;
        while(!stack.isEmpty()){
            answer[i++] = stack.pop();
        }
        
        
        return answer;
    }
}