import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 문자열 배열로 변환
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }

        // 정렬 기준 정의
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        // 정렬된 배열을 하나의 문자열로 합치기
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }

        // 만약 가장 큰 숫자가 '0'이라면 모든 숫자가 '0'
        String answer = sb.toString();
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
}
