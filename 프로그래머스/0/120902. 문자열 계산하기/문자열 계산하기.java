class Solution {
    public int solution(String my_string) {
        // 문자열을 공백을 기준으로 분리하여 배열로 변환합니다.
        String[] parts = my_string.split(" ");
        // 첫 번째 숫자 빼기
        int answer = Integer.parseInt(parts[0]);
        
        // 배열 순회하면서 연산자를 만날 때마다 다음 숫자와 연산
        for (int i = 1; i < parts.length; i += 2) {
            // 연산자
            String operator = parts[i];
            // 다음 숫자
            int number = Integer.parseInt(parts[i + 1]); 
            
            if (operator.equals("+")) {
                answer += number;
            } else if (operator.equals("-")) {
                answer -= number;
            }
        }
        
        return answer;
    }
}
