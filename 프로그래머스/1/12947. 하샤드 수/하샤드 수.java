class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        char[] chars = String.valueOf(x).toCharArray();
        int number = 0;
        for(int i = 0; i < chars.length; i++){
            number += Character.getNumericValue(chars[i]);
        }
        
        if(x % number == 0){
            return answer;
        } else return false;
        
        
    }
}