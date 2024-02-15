class Solution {
    public int[][] solution(int[] num_list, int n) {
        int devidedLength = num_list.length / n;
        int[][] answer = new int[devidedLength][n];
        
        for(int i = 0; i < devidedLength; i++){
            for (int j = 0; j < n; j++){
                answer[i][j] = num_list[i * n + j];
            }
        }
        return answer;
    }
}