class Solution {
    public int solution(int n) {
        // 팩토리얼 값을 저장할 변수, 값이 커질 수 있으니 long 사용
        long factorial = 1;
        // 팩토리얼을 계산할 시작 숫자
        int answer = 1;

        while (true) {
            // 계산된 팩토리얼 값이 n을 초과하면 반복 종료
            if (factorial > n) {
                break;
            }
            // 팩토리얼을 계산할 다음 숫자 증가
            answer++;
            // 현재 숫자까지의 팩토리얼 계산
            factorial *= answer;
        }

        // 마지막에 초과되기 전의 i 값을 반환 (반복문 탈출 직전에 answer 값을 1 증가시켰으니 1을 빼서 반환)
        return answer - 1;
    }
}
