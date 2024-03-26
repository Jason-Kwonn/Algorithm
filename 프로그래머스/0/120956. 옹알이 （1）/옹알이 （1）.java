class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            boolean isValid = true;
            String temp = word;
            // 각 발음에 대하여 검사
            for (String sound : sounds) {
                int count = temp.length() - temp.replace(sound, "").length();
                // 발음 길이로 나누어 해당 발음이 몇 번 사용되었는지 확인
                count /= sound.length();
                if (count > 1) { // 발음이 두 번 이상 사용되면 규칙 위반
                    isValid = false;
                    break;
                }
                // 해당 발음을 제거
                temp = temp.replace(sound, " ");
            }
            // 최종적으로 남은 문자열이 공백만으로 이루어져 있는지 확인
            temp = temp.replaceAll(" ", "");
            if (isValid && temp.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}
