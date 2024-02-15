import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        // 문자 배열로 변환
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        
        // 배열 정렬
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        
        // 정렬된 배열 비교
        return Arrays.equals(beforeChar, afterChar) ? 1 : 0;
    }
}
