import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> charMap = new HashMap<>();
        ArrayList<Character> uniqueChar = new ArrayList<>();
        
        for (char c : s.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : charMap.keySet()){
            if (charMap.get(c) == 1){
                uniqueChar.add(c);
            }
        }
        
        Collections.sort(uniqueChar);
        
        for (char c : uniqueChar){
            answer.append(c);
        }
    
        return answer.toString();
    }
}