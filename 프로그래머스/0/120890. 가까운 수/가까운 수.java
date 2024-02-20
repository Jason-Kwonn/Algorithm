class Solution {
    public int solution(int[] array, int n) {
        // 초기값을 배열의 첫 번째 요소로 설정
        int answer = array[0];
        // 초기 최소 차이값 설정
        int minDiff = Math.abs(array[0] - n);

        for (int i = 1; i < array.length; i++) {
            // 현재 요소와 n의 차이
            int currentDiff = Math.abs(array[i] - n);

            // 현재 차이가 이전 최소 차이보다 작거나,
            // 차이가 같지만 현재 요소가 더 작은 경우
            if (currentDiff < minDiff || (currentDiff == minDiff && array[i] < answer)) {
                // 답을 현재 요소로 업데이트
                answer = array[i]; 
                // 최소 차이 업데이트
                minDiff = currentDiff;
            }
        }

        return answer;
    }
}
