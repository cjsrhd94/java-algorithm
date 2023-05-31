package math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_나누어_떨어지는_숫자_배열 {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> answerList = new ArrayList<>();
		for (int num : arr) {
			if (num % divisor == 0) {
				answerList.add(num);
			}
		}

		if (answerList.isEmpty()) {
			return new int[] {-1};
		}

		Collections.sort(answerList);

		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}
}
