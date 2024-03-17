class Solution {
    public int solution(int a, int b) {
        // 최대공약수로 b를 기약분수 형태로 만들기 (실제로는 b의 소인수만 중요하므로 a의 처리는 생략)
        b /= gcd(a, b);
        
        // 분모 b를 2와 5의 소인수로만 나누기
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        
        // 나눈 후 남은 수가 1이면 유한소수, 아니면 무한소수
        return b == 1 ? 1 : 2;
    }
    
    // 최대공약수를 찾는 메소드
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
