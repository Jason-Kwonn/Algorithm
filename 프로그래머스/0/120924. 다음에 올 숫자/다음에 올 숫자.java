class Solution {
    public int solution(int[] common) {
        // 첫 번째 원소가 0이 아닌 경우에만 공비 계산
        int ratio = common[0] != 0 ? common[1] / common[0] : 0;
        
        // 등차수열인지, 등비수열인지 판별하기 위해 두 가지 조건을 확인
        boolean isArithmetic = common[2] - common[1] == common[1] - common[0];
        boolean isGeometric = common[0] != 0 && common[1] % common[0] == 0 && common[2] / common[1] == ratio;
        
        if (isArithmetic) {
            int diff = common[1] - common[0];
            return common[common.length - 1] + diff;
        } else if (isGeometric) {
            return common[common.length - 1] * ratio;
        }
        
        return 0;
    }
}
