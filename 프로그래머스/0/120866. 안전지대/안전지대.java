class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] danger = new int[n][n];
        
        // 지뢰 주변의 위험 지역 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    markDanger(board, danger, i, j);
                }
            }
        }
        
        // 안전 지역 카운트
        int safeArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 지뢰가 없고 위험 지역도 아니면 안전 지역
                if (board[i][j] == 0 && danger[i][j] == 0) {
                    safeArea++;
                }
            }
        }
        
        return safeArea;
    }
    
    private void markDanger(int[][] board, int[][] danger, int x, int y) {
        int n = board.length;
        // 주변 8칸과 자기 자신을 위험 지역으로 표시
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int nx = x + dx;
                int ny = y + dy;
                // 배열 범위 내에서
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    danger[nx][ny] = 1;
                }
            }
        }
    }
}
