import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortedEmergency);

        Map<Integer, Integer> orderMap = new HashMap<>();

        for (int i = 0; i < emergency.length; i++) {
            orderMap.put(sortedEmergency[i], emergency.length - i);
        }

        int[] result = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            result[i] = orderMap.get(emergency[i]);
        }

        return result;
    }
}