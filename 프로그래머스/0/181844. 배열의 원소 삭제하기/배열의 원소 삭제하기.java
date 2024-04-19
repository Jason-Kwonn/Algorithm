import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        List<Integer> deleteList = new ArrayList<>();
        for (int num : delete_list) {
            deleteList.add(num);
        }
        
        for(int num : arr){
            if(!deleteList.contains(num)){
                list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}