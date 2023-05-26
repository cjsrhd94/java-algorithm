package queue;

import java.util.ArrayList;

public class Programmers_같은_숫자는_싫어 {
	public int[] solution(int []arr) {
		ArrayList<Integer> answerList = new ArrayList<>();

		int value = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				answerList.add(arr[i]);
				value = arr[i];
			}
		}

		return answerList.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}
}
