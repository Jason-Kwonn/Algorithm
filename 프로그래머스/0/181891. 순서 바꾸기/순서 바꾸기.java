class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] part1 = new int[num_list.length - n];
        int[] part2 = new int[n];
        
        for(int i = 0; i < part2.length; i++){
            part2[i] = num_list[i];
        }
        
        for(int i = 0; i < part1.length; i++){
            part1[i] = num_list[i + n];
        }
        
        
        int[] answer = new int[num_list.length];
        for(int i = 0; i < part1.length; i++){
            answer[i] = part1[i];
        }
        for(int i = 0; i < part2.length; i++){
            answer[i + part1.length] = part2[i];
        }
        
        return answer;
    }
}