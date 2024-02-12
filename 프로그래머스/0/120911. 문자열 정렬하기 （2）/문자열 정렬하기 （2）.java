import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 소문자로 변환
        answer = my_string.toLowerCase();
        
        // 문자 배열로 변환
        char[] temp = answer.toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(temp);
        
        // String 으로 변환
        answer = new String(temp);
        
        return answer;
        
        
        // 더 짧은 코드
        // char[] c = my_string.toLowerCase().toCharArray();
        // Arrays.sort(c);
        // return new String(c);
    }
}