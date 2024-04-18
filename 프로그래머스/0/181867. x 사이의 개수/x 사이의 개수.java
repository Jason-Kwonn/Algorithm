class Solution {
    public int[] solution(String myString) {
        String[] parts = myString.split("x");
        int[] answer;
        
        if (myString.endsWith("x")) {
            answer = new int[parts.length + 1];
        } else {
            answer = new int[parts.length];
        }
        
        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();
        }
        
        // 마지막 부분이 "x"로 끝나는 경우
        if (myString.endsWith("x")) {
            answer[parts.length] = 0;
        }
        
        return answer;
    }
}
