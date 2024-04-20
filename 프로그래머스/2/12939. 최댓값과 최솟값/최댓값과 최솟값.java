import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 공백으로 분할
        String[] parts = s.split(" ");
        
        // 분할된 문자열을 정수로 변환
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        
        // 배열을 정렬하여 최소값과 최대값 찾기
        Arrays.sort(numbers);
        int min = numbers[0];        // 최소값
        int max = numbers[numbers.length - 1]; // 최대값

        // 결과를 "(최소값) (최대값)" 형식으로 반환
        return min + " " + max;
    }
}
