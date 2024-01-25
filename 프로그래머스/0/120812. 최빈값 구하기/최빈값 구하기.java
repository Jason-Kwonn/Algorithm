class Solution {
    public int solution(int[] array) {
        int[] frequency = new int[1000]; // array의 원소는 0부터 999까지
        int maxFrequency = 0;

        // 각 숫자의 빈도를 계산
        for (int num : array) {
            frequency[num]++;
            maxFrequency = Math.max(maxFrequency, frequency[num]);
        }

        // 최빈값이 여러 개 있는지 확인
        int maxValCount = 0;
        int maxVal = -1;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFrequency) {
                maxValCount++;
                maxVal = i;
                if (maxValCount > 1) {
                    return -1; // 최빈값이 여러 개면 -1 반환
                }
            }
        }

        // 최빈값이 하나만 있으면 그 값을 반환
        return maxVal;
    }
}
