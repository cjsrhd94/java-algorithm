package math;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Programmers_제일_작은_수_제거하기 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        if (list.size() == 1) {
            int[] minus = new int[1];
            minus[0] = -1;
            return minus;
        }

        List<Integer> clone = new ArrayList<>();
        clone.addAll(list);

        Collections.sort(clone);
        list.remove(Integer.valueOf(clone.get(0)));

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
