import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        // 문자열에서 숫자만 추출하여 리스트에 추가
        for (int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                answer.add(Character.getNumericValue(ch));
            }
        }
        
        // 숫자 리스트를 오름차순으로 정렬
        Collections.sort(answer);
        
        return answer;
    }
}
