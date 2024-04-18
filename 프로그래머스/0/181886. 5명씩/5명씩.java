class Solution {
    public String[] solution(String[] names) {
        int groupCount = (names.length - 1) / 5 + 1; // 그룹의 수 계산
        String[] answer = new String[groupCount];
        
        for (int i = 0; i < groupCount; i++) {
            int startIndex = i * 5; // 현재 그룹의 시작 인덱스 계산
            answer[i] = names[startIndex];
        }
        
        return answer;
    }
}
