class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        int n = balls;
        int r = share;

        // Calculate n! / (r! * (n-r)!)
        for (int i = 0; i < r; i++) {
            answer *= (n - i);
            answer /= (i + 1);
        }

        return answer;
    }
}
