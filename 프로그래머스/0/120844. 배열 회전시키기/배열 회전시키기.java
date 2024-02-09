class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] rotated = new int[n];
        
        // "left" 방향으로 회전하는 경우
        if (direction.equals("left")) {
            for (int i = 0; i < n - 1; i++) {
                rotated[i] = numbers[i + 1];
            }
            rotated[n - 1] = numbers[0];
        } 
        // "right" 방향으로 회전하는 경우
        else if (direction.equals("right")) {
            rotated[0] = numbers[n - 1];
            for (int i = 1; i < n; i++) {
                rotated[i] = numbers[i - 1];
            }
        }
        
        return rotated;
    }
}
