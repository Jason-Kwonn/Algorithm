import java.util.HashSet;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        HashSet<Integer> xSet = new HashSet<>();
        HashSet<Integer> ySet = new HashSet<>();
        
        for (int[] dot : dots){
            xSet.add(dot[0]);
            ySet.add(dot[1]);
        }
        
        Integer[] xValues = xSet.toArray(new Integer[0]);
        Integer[] yValues = ySet.toArray(new Integer[0]);
        
        int width = Math.abs(xValues[0] - xValues[1]);
        int height = Math.abs(yValues[0] - yValues[1]);
        
        answer = width * height;
        
        
        return answer;
    }
}