class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder answer = new StringBuilder();
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += bin1.charAt(i--) - '0'; // bin1의 해당 자리 수를 더함
            if (j >= 0) sum += bin2.charAt(j--) - '0'; // bin2의 해당 자리 수를 더함
            
            answer.insert(0, sum % 2); // 현재 자리의 결과를 문자열 앞에 삽입
            carry = sum / 2; // 다음 자리로 넘길 캐리를 계산
        }
        
        return answer.toString();
    }
}
