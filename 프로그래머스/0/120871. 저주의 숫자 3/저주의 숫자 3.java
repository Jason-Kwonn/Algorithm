class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; count < n; i++) {
            if (!String.valueOf(i).contains("3") && i % 3 != 0) {
                count++;
                answer = i;
            }
        }
        
        return answer;
    }
}
