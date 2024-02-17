class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num = i; num <= j; num++){
            // int to String
            String numToString = String.valueOf(num);
            // count k
            for (int index = 0; index < numToString.length(); index++){
                if (numToString.charAt(index) == ('0' + k)){
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}