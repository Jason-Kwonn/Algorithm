import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        
        for (int factor = 2; factor <= n; factor++) {
            while (n % factor == 0) {
                primeFactors.add(factor);
                n /= factor;
            }
        }
        
        int[] answer = new int[primeFactors.size()];
        int i = 0;
        for (int factor : primeFactors) {
            answer[i++] = factor;
        }
        Arrays.sort(answer);
        return answer;
    }
}
