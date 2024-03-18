class Solution {
    public int solution(String A, String B) {
        // A와 B가 같은 경우, 회전 필요 없음
        if (A.equals(B)) return 0;
        
        // A의 길이만큼 회전을 시도
        for (int i = 1; i < A.length(); i++) {
            String rotatedA = rotateRight(A, i);
            if (rotatedA.equals(B)) {
                return i;
            }
        }
        
        // A를 회전시켜도 B를 만들 수 없는 경우
        return -1;
    }
    
    // 문자열 A를 오른쪽으로 n번 회전시킨 결과를 반환하는 메서드
    private String rotateRight(String A, int n) {
        int length = A.length();
        n %= length; // 문자열 길이를 넘어가는 회전은 의미가 없으므로 나머지 연산을 사용
        return A.substring(length - n) + A.substring(0, length - n);
    }
}
