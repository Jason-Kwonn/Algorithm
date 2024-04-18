class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        StringBuilder newString = new StringBuilder();
        
        for(char c : myString.toCharArray()){
            if(c == 'A'){
                newString.append('B');
            } else if(c == 'B'){
                newString.append('A');
            }
        }
        
        if(newString.toString().contains(pat)){
            answer = 1;
        }
        
        
        return answer;
    }
}