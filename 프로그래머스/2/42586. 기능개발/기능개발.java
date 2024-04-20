import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        
        // 각 기능 별 완료까지 필요한 날짜 계산
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i]; // 남은 진행률
            int day = (remain + speeds[i] - 1) / speeds[i]; // 완료까지 필요한 일수 (올림 처리)
            days.offer(day);
        }
        
        List<Integer> result = new ArrayList<>();
        while (!days.isEmpty()) {
            int deployDay = days.poll(); // 현재 기능의 배포일
            int count = 1; // 같이 배포될 기능의 수 (현재 기능 포함)
            
            // 큐가 비어있지 않고, 다음 기능의 배포일이 현재 기능의 배포일보다 작거나 같다면
            // 같이 배포 처리
            while (!days.isEmpty() && days.peek() <= deployDay) {
                count++;
                days.poll();
            }
            
            result.add(count); // 이번 배포에 몇 개의 기능이 배포되는지 저장
        }
        
        // 결과를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
