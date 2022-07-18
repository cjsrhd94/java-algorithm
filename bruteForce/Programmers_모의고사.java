package bruteForce;

import java.util.ArrayList;
import java.util.List;

public class Programmers_모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if(student1[i%student1.length] == answers[i]) {
                score1++;
            }
            if(student2[i%student2.length] == answers[i]) {
                score2++;
            }
            if(student3[i%student3.length] == answers[i]) {
                score3++;
            }
        }

        int max = Math.max(Math.max(score1, score2), score3);

        List<Integer> list = new ArrayList<Integer>();

        if(max == score1) {
            list.add(1);
        }
        if(max== score2) {
            list.add(2);
        }
        if(max == score3) {
            list.add(3);
        }

        answer = new int[list.size()];

        for (int i = 0; i <answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
