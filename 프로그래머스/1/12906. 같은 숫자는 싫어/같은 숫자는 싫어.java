import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> queue = new LinkedList<>();
        int previous = -1;
        
        for(int num : arr){
            if(num != previous){
                queue.offer(num);
                previous = num;
            }
        }
        
        int[] answer = new int[queue.size()];
        
        int i = 0;
        while(!queue.isEmpty()){
            answer[i++] = queue.poll();
        }

        return answer;
    }
}