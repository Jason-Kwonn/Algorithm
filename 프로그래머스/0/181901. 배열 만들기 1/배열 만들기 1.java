class Solution {
    public int[] solution(int n, int k) {
        // answer 배열의 길이 계산
        int[] answer = new int[n / k];
        
        // answer 배열에 k의 배수 저장
        for(int i = 0; i < answer.length; i++){
            answer[i] = k * (i + 1);
        }
        
        
        return answer;
    }
}