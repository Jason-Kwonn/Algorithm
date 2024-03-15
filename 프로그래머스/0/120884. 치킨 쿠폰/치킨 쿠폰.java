class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        // 받은 쿠폰으로 계산
        while (chicken >= 10) {
            // 서비스 치킨 수
            int serviceChicken = chicken / 10;
            // 서비스 치킨 추가
            answer += serviceChicken;
            // 남은 쿠폰과 서비스 치킨으로 받은 쿠폰 합산
            chicken = serviceChicken + (chicken % 10);
        }
        
        return answer;
    }
}
