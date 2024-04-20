class Solution {
    public long solution(long n) {
        // 제곱근을 구하고
        long sqrt = (long) Math.sqrt(n);
        
        // 제곱근을 제곱했을 때 원래의 수 n과 같은지 확인하여 정수 제곱근인지 판단
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);  // n이 정수의 제곱이면 (sqrt + 1)의 제곱 반환
        } else {
            return -1;  // n이 정수의 제곱이 아니면 -1 반환
        }
    }
}
