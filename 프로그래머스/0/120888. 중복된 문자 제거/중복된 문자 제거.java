import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        
        // StringBuilder 를 사용해본다.
        StringBuilder answer = new StringBuilder();
        
        // 중복 허용이 안돼고, 결과값이 순서대로 추가되는 LinkedHashSet 을 사용한다.
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // LinkedHashSet 에 my_string 의 char 를 중복 없는 값으로 넣는다.
        for (char c : my_string.toCharArray()) {
            set.add(c);
        }
        
        // StringBuilder 에도 넣는다.
        for (char c : set) {
            answer.append(c);
        }
        
        // String 타입으로 변환한다.
        return answer.toString();
    }
}