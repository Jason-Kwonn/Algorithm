import java.util.HashMap;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        // Center of the board
        int x = 0, y = 0;
        // Half sizes of the board
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        // Directions with corresponding x and y movements
        HashMap<String, int[]> move = new HashMap<>();
        move.put("up", new int[]{0, 1});
        move.put("down", new int[]{0, -1});
        move.put("left", new int[]{-1, 0});
        move.put("right", new int[]{1, 0});

        // Apply movements
        for (String key : keyinput) {
            int[] delta = move.get(key);
            int newX = x + delta[0];
            int newY = y + delta[1];

            // Check boundaries
            if (newX >= -maxX && newX <= maxX && newY >= -maxY && newY <= maxY) {
                x = newX;
                y = newY;
            }
        }

        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
