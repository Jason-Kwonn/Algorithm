import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        // ArrayList 에 각 숫자를 숫자 갯수만큼 담는다.
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                list.add(num);
            }
        }
        
        // int[] 이기 때문에 해당 list 에 있는 것을 가져와서 answer 에 담아준다.
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}