class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length > arr2.length){
            answer = 1;
        } else if (arr1.length < arr2.length){
            answer = -1;
        } else {
            int num1 = 0;
            int num2 = 0;
            for(int num : arr1){
                num1 += num;
            }
            for(int num : arr2){
                num2 += num;
            }
            
            if(num1 > num2){
                answer = 1;
            } else if(num1 < num2) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}