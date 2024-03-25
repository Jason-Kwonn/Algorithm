class Solution {
    public int solution(int[][] dots) {
        // 모든 가능한 두 점 쌍에 대한 기울기를 계산하고, 기울기가 동일한지 확인
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                for (int k = 0; k < dots.length; k++) {
                    for (int l = k + 1; l < dots.length; l++) {
                        // 동일한 점을 사용하지 않는 경우만 고려
                        if (i != k && i != l && j != k && j != l) {
                            long dy1 = dots[j][1] - dots[i][1];
                            long dx1 = dots[j][0] - dots[i][0];
                            long dy2 = dots[l][1] - dots[k][1];
                            long dx2 = dots[l][0] - dots[k][0];
                            
                            // 두 기울기가 같은지 확인 (dy1/dx1 == dy2/dx2 -> dy1*dx2 == dy2*dx1)
                            if (dy1 * dx2 == dy2 * dx1) {
                                return 1;
                            }
                        }
                    }
                }
            }
        }
        
        // 평행한 직선이 없는 경우
        return 0;
    }
}
