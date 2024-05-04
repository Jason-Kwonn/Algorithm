import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("[abc]");
        
        List<String> resultList = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                resultList.add(part);
            }
        }
        
        if (resultList.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        
        String[] answer = new String[resultList.size()];
        answer = resultList.toArray(answer);
        
        return answer;
    }
}
