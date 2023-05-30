package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_명예의_전당 {
	public int[] solution(int k, int[] score) {
		int sLen = score.length;
		int[] answer = new int[sLen];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < sLen; i++) {
			list.add(score[i]);
			Collections.sort(list);
			if (list.size() > k) {
				list.remove(list.get(0));
			}
			answer[i] = list.get(0);
		}
		return answer;
	}
}
