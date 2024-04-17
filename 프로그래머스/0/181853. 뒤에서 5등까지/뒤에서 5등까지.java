import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        
        Arrays.sort(num_list);
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = num_list[i];
        }
        
        // 다른 풀이
        // Arrays.sort(num_list);
        // return Arrays.copyOfRange(num_list, 0, 5);
        
        return answer;
    }
}