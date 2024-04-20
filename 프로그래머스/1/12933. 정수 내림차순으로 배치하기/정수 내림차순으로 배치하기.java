import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환 후 문자 배열로 변환
        char[] chars = String.valueOf(n).toCharArray();
        
        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(chars);
        
        // 배열을 뒤집어서 내림차순으로 만들기
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();
        
        // 문자열을 숫자로 변환
        return Long.parseLong(sb.toString());
    }
}
