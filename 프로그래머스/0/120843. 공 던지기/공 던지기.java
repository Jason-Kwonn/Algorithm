class Solution {
    public int solution(int[] numbers, int k) {
        int currentIndex = 0;
        for (int i = 0; i < k - 1; i++) {
            currentIndex = (currentIndex + 2) % numbers.length;
        }
        return numbers[currentIndex];
    }
}
