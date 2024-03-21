class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length]; // 결과를 저장할 배열 초기화
        
        for (int i = 0; i < quiz.length; i++) {
            String[] parts = quiz[i].split(" "); // 공백을 기준으로 수식 분리
            int X = Integer.parseInt(parts[0]); // X 추출
            int Y = Integer.parseInt(parts[2]); // Y 추출
            int Z = Integer.parseInt(parts[4]); // Z 추출
            String operator = parts[1]; // 연산자 추출
            
            // 연산 수행 및 결과 판별
            if (operator.equals("+") && X + Y == Z) {
                answer[i] = "O";
            } else if (operator.equals("-") && X - Y == Z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}
