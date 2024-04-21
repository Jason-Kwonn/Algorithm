import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        // "x"로 문자열을 분할
        String[] splitArray = myString.split("x");
        
        // 빈 문자열을 제외하면서 새로운 리스트 생성
        ArrayList<String> filteredList = new ArrayList<>();
        for (String str : splitArray) {
            if (!str.isEmpty()) {  // 빈 문자열이 아닌 경우에만 리스트에 추가
                filteredList.add(str);
            }
        }
        
        // 리스트를 배열로 변환
        String[] result = filteredList.toArray(new String[0]);
        
        // 배열 정렬
        Arrays.sort(result);
        
        return result;
    }
}
