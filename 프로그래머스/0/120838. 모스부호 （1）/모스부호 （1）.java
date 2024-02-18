import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        // 모스 부호와 알파벳 매칭을 위한 HashMap 생성
        Map<String, String> morseMap = new HashMap<>();
        // a-z 순서로 모스 부호 담기
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // a-z 알파벳 담기
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        // HashMap에 모스 부호와 알파벳 매칭 정보 저장
        for(int i = 0; i < morseCodes.length; i++) {
            morseMap.put(morseCodes[i], String.valueOf(alphabet[i]));
        }
        
        // letter를 공백으로 분리하여 각 모스 부호를 알파벳으로 변환
        String[] letters = letter.split(" ");
        for(String morse : letters) {
            answer += morseMap.get(morse);
        }
        
        return answer;
    }
}
