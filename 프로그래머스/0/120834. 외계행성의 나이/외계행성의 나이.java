class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();

        while (age > 0) {
            char ch = (char) ((age % 10) + 'a');
            result.insert(0, ch);
            age /= 10;
        }

        return result.toString();
    }
}
