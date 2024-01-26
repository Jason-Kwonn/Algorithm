class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] answer = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++){
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++){
                sum  += accounts[i][j];
            }
            answer[i] = sum;
        }

        Arrays.sort(answer);
        return answer[answer.length - 1];

    }
}