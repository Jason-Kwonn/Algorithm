class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                answer += Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                answer += Character.toUpperCase(currentChar);
            } else {
                answer += currentChar;  // 다른 문자는 그대로 유지
            }
        }

        return answer;
    }
}