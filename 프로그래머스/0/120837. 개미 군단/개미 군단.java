class Solution {
    public int solution(int hp) {
        // 장군개미의 공격력
        int generalAntPower = 5;
        // 병정개미의 공격력
        int soldierAntPower = 3;
        // 일개미의 공격력
        int workerAntPower = 1;

        // 장군개미, 병정개미, 일개미의 수 초기화
        int generalAntCount = 0, soldierAntCount = 0, workerAntCount = 0;

        // 장군개미의 수 계산
        generalAntCount = hp / generalAntPower;
        hp %= generalAntPower;

        // 병정개미의 수 계산
        soldierAntCount = hp / soldierAntPower;
        hp %= soldierAntPower;

        // 일개미의 수 계산
        workerAntCount = hp;

        // 최소 병력 수 반환
        return generalAntCount + soldierAntCount + workerAntCount;
    }
}
