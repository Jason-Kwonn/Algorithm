import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3]; // 각 수포자의 점수를 저장할 배열
        int[] student1 = {1, 2, 3, 4, 5}; // 1번 수포자의 패턴
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 2번 수포자의 패턴
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 3번 수포자의 패턴

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student1[i % student1.length]) score[0]++;
            if (answers[i] == student2[i % student2.length]) score[1]++;
            if (answers[i] == student3[i % student3.length]) score[2]++;
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2])); // 최고 점수 계산
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            if (score[i] == maxScore) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
