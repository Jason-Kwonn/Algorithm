class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for (int i = 1; i <= n; i++){
            if (Math.pow(i, 2) == n){
                return answer = 1;
            }
        }
        
        return answer;
    }
}