class Solution {
    public int[] solution(int[] num_list, int n) {
        int range = (num_list.length - 1) / n + 1;
        int[] answer = new int[range];
        
        for(int i = 0; i < range; i++){
            answer[i] = num_list[i * n];
        }
        
        return answer;
    }
}