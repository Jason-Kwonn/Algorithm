class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = String.valueOf(n);
        
        for (int i = 0; i < temp.length(); i++){
            answer += Character.getNumericValue(temp.charAt(i));
        }
        
        return answer;
    }
}