import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                int repeatTimes = arr[i] * 2;
                for (int j = 0; j < repeatTimes; j++) {
                    stack.push(arr[i]);
                }
            } else {
                int repeatTimes = arr[i];
                for (int j = 0; j < repeatTimes; j++) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
        }
        
        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}
