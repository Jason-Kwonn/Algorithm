class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] charArray = num_str.toCharArray();
        for(char c : charArray){
            int num = c - '0';
            answer += num;
        }
        return answer;
    }
}