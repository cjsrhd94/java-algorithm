package queue;

import java.io.IOException;
import java.util.ArrayList;

public class Programmers_같은_숫자는_싫어 {
	public static void main(String[] args) throws IOException {
		Programmers_같은_숫자는_싫어 main = new Programmers_같은_숫자는_싫어();
		int[] arr = {1,2,3,3,2,1};
		System.out.println(main.solution(arr));
	}
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
