class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i : array) {
            
            String intToString = String.valueOf(i);
            
            for (char c : intToString.toCharArray()){
                if(c == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}