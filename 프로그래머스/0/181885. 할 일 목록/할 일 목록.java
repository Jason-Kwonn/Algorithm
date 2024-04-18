import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i] == true){
                list.add(todo_list[i]);
            } else {
                continue;
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}