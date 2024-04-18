class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for(int num : num_list){
            if(num % 2 == 1){
                odd.append(String.valueOf(num));
            } else {
                even.append(String.valueOf(num));
            }
        }
        
        int answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        
        return answer;
    }
}