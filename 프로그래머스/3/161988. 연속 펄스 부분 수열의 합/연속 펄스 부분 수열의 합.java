class Solution {
    public long solution(int[] sequence) {
        return Math.max(
            maxSubarraySumWithPulse(sequence, true),  // 펄스 수열이 [1, -1, 1, -1, ...] 시작
            maxSubarraySumWithPulse(sequence, false)  // 펄스 수열이 [-1, 1, -1, 1, ...] 시작
        );
    }

    private long maxSubarraySumWithPulse(int[] sequence, boolean startWithPositive) {
        long maxEndingHere = 0;  // 현재까지의 최대 부분 배열 합
        long maxSoFar = Integer.MIN_VALUE;  // 전체 최대 부분 배열 합
        int multiplier = startWithPositive ? 1 : -1;  // 현재 인덱스의 펄스 수열 값

        for (int num : sequence) {
            maxEndingHere += num * multiplier;
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            maxEndingHere = Math.max(maxEndingHere, 0);
            multiplier *= -1;  // 펄스 수열 값 반전
        }

        return maxSoFar;
    }
}
