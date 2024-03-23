class Solution {
    public int[] solution(int num, int total) {
        // 첫 번째 숫자를 찾기 위한 계산
        int firstNumber = (total - (num * (num - 1) / 2)) / num;
        
        // 결과를 담을 배열 초기화
        int[] answer = new int[num];
        
        // 연속된 숫자들을 배열에 채우기
        for (int i = 0; i < num; i++) {
            answer[i] = firstNumber + i;
        }
        
        return answer;
    }
}
