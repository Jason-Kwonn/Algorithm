class Solution {
    public String solution(String n_str) {
        int firstNonZeroIndex = 0;
        
        // 0이 아닌 첫 번째 문자의 인덱스를 찾기
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                firstNonZeroIndex = i;
                break;
            }
        } 
        
        return n_str.substring(firstNonZeroIndex);
    }
}