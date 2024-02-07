import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> divisors = new ArrayList<>();
        
        // 약수인지 확인
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        // 배열로 변환
        int[] answer = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            answer[i] = divisors.get(i);
        }
        
        return answer;
    }
}
