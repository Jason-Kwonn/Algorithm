import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        // 공백으로 구분된 문자열을 분리
        String[] parts = s.split(" ");
        
        for (String part : parts) {
            if (part.equals("Z")) {
                // "Z"가 나오면 스택에서 가장 최근 숫자 제거
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // 숫자는 스택에 추가
                stack.push(Integer.parseInt(part));
            }
        }
        
        // 스택에 남은 모든 숫자를 합산
        for (int num : stack) {
            answer += num;
        }
        
        return answer;
    }
}
