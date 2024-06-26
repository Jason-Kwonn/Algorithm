import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // 배열 순회하여 HashMap 에 담는다.
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for(String key : map.keySet()){
            answer *= (map.get(key) + 1);
        }
        
        answer--;
        
        return answer;
    }
}