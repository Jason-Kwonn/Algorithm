class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        char op = parts[1].charAt(0);
        
        if(op == '+'){
            answer = a + b;
        } else if(op == '-'){
            answer = a - b;
        } else if(op == '*'){
            answer = a * b;
        }
        
        return answer;
    }
}