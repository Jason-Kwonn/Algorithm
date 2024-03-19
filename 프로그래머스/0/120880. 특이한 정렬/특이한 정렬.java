import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // int[]를 Integer[]로 변환
        Integer[] numListObj = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        // 정렬
        Arrays.sort(numListObj, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int distA = Math.abs(a - n);
                int distB = Math.abs(b - n);
                // 거리가 같으면 숫자의 크기에 따라 내림차순 정렬
                if (distA == distB) {
                    return b - a;
                }
                // 거리가 다르면 거리에 따라 오름차순 정렬
                return distA - distB;
            }
        });
        
        // 결과를 다시 int[]로 변환하여 반환
        return Arrays.stream(numListObj).mapToInt(Integer::intValue).toArray();
    }
}
