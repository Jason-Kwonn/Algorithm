class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int count = 0;
        for (int i = N; i > 1; i--){
            count++;
        }
        answer = (count * M) + (M - 1);

        return answer;
    }
}