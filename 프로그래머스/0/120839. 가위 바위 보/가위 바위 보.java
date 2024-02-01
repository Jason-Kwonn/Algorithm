class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            // 현재 움직임
            char currentMove = rsp.charAt(i);

            // 다음 이길 수 있는 움직임 계산
            char winningMove = switch (currentMove) {
                case '2' -> '0';
                case '0' -> '5';
                case '5' -> '2';
                default -> throw new IllegalArgumentException("Invalid move: " + currentMove);
            };

            // 결과에 추가
            answer.append(winningMove);
        }

        return answer.toString();
    }
}
