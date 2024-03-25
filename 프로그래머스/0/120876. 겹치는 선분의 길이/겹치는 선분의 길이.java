class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        // 모든 선분의 시작점과 끝점을 정렬
        for (int i = 0; i < lines.length; i++) {
            if (lines[i][0] > lines[i][1]) {
                int temp = lines[i][0];
                lines[i][0] = lines[i][1];
                lines[i][1] = temp;
            }
        }
        // 각 선분의 조합에 대해 겹치는 부분 계산
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                // 겹치는 부분의 시작점: 두 선분의 시작점 중 큰 값
                int start = Math.max(lines[i][0], lines[j][0]);
                // 겹치는 부분의 끝점: 두 선분의 끝점 중 작은 값
                int end = Math.min(lines[i][1], lines[j][1]);
                // 겹치는 부분이 있다면, 겹치는 부분의 길이를 더함
                if (start < end) {
                    answer += end - start;
                }
            }
        }
        // 세 선분이 모두 겹치는 부분이 중복 계산될 수 있으므로 조정
        int tripleOverlap = Math.max(0, Math.min(lines[0][1], Math.min(lines[1][1], lines[2][1])) - Math.max(lines[0][0], Math.max(lines[1][0], lines[2][0])));
        answer -= 2 * tripleOverlap;

        return answer;
    }
}
