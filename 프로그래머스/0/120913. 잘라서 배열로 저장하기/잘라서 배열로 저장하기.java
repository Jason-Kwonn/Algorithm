class Solution {
    public String[] solution(String my_str, int n) {
        // 결과 배열의 크기 계산: my_str 길이를 n으로 나눈 몫에 나머지가 있으면 하나 더 추가
        int arraySize = my_str.length() / n + (my_str.length() % n > 0 ? 1 : 0);
        String[] answer = new String[arraySize];
        
        // 문자열을 n 길이만큼 잘라서 결과 배열에 저장
        for (int i = 0; i < arraySize; i++) {
            // 시작 인덱스 계산
            int start = i * n;
            // 끝 인덱스 계산 Math.min 사용
            int end = Math.min(start + n, my_str.length());
            // 부분 문자열 추출 및 저장
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}
