package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Programmers_과일_장수 {
	public static void main(String[] args) {
		Programmers_과일_장수 main = new Programmers_과일_장수();
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		main.solution(3,4, score);
	}

	public int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		Stack<Integer> stack = new Stack<>();
		int sLen = score.length;
		for (int i = 0; i < sLen; i++) {
			stack.push(score[i]);
		}

		for (int i = 0; i < sLen/m; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < m; j++) {
				list.add(stack.pop());
			}

			int min = list.get(list.size() - 1);
			answer = answer + min * m;
		}
		return answer;
	}
}
