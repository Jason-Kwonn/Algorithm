class Solution {
    public int solution(int num, int k) {
        String numString = String.valueOf(num);
        
        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) - '0' == k) {
                return i + 1; // 인덱스는 0부터 시작하므로 +1
            }
        }
        
        return -1;
    }
}
