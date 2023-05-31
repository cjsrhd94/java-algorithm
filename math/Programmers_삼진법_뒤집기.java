package math;

import java.util.ArrayList;
import java.util.List;

public class Programmers_삼진법_뒤집기 {
	public int solution(int n) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		while (n != 0) {
			list.add(n % 3);
			n = n / 3;
		}

		for(int i = 0; i < list.size(); i++) {
			answer = answer + (int) Math.round(Math.pow(3, list.size() - i - 1)) * list.get(i);
		}
		return answer;
	}
}
