class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int step = a;
        
        for(int i = 0; i < included.length; i++){
            if(included[i] == true){
                answer += step;
            }
            step += d;
        }
        
        
        return answer;
    }
}