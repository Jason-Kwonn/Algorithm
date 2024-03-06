class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0];
        int b = sides[1];
        int minLength = Math.abs(a - b) + 1;
        int maxLength = a + b - 1;
        
        for (int i = minLength; i <= maxLength; i++){
            answer++;
        }
        
        
        return answer;
    }
}