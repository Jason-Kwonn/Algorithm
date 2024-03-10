class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        // int i 를 매 스텝에 code 스텝만큼 나아감. 이후 해당 스텝의 인덱스(스텝 수 - 1) 를 append
        for (int i = code; i <= cipher.length(); i += code) {
            answer.append(cipher.charAt(i - 1));
        }

        return answer.toString();
    }
}
