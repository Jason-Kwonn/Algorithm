class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int addPow = 0;
        
        for(int num : num_list){
            multi *= num;
            addPow += num;
        }
        addPow = (int) Math.pow(addPow, 2);
        
        return (multi < addPow) ? 1 : 0;
    }
}