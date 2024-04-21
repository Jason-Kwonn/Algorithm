import java.util.HashMap;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "w");
        map.put(-1, "s");
        map.put(10, "d");
        map.put(-10, "a");
        
        
        for(int i = 1; i < numLog.length; i++){
            answer.append(map.get(numLog[i] - numLog[i-1]));
        }
        
        return answer.toString();
    }
}