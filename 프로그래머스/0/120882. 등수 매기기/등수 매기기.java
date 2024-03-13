class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        double[] averages = new double[n];
        
        // 평균 점수 계산
        for (int i = 0; i < n; i++) {
            averages[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        
        // 등수 매기기
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (averages[i] < averages[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}
