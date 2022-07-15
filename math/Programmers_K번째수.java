package math;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Programmers_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                temp.add(array[j-1]);
            }
            Collections.sort(temp);

            list.add(temp.get(commands[i][2]-1));
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
