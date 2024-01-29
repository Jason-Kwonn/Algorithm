class Solution {
    public int solution(int n) {
        int pizzaSlices = 6;
        //최대공약수
        int gcd = findGCD(pizzaSlices, n);
        //최소공배수
        int lcm = (pizzaSlices * n) / gcd;
        int answer = lcm / pizzaSlices;
        
        return answer;
    }
    
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}