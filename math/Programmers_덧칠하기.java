package math;

import java.util.ArrayList;
import java.util.List;

public class Programmers_덧칠하기 {
	public int solution(int n, int m, int[] section) {
		int cnt = 0;
		List<Boolean> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(true);
		}

		for (int sec : section) {
			list.set(sec - 1, false);
		}

		int start = section[0] - 1;

		boolean trigger = true;
		while (trigger) {
			cnt++;
			for (int i = start; i < start + m; i++) {
				list.set(i, true);
				if (i == list.size() - 1) {
					break;
				}
			}

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == false) {
					start = i;
					break;
				}
				if (i == list.size() - 1) {
					trigger = false;
					break;
				}
			}
		}
		return cnt;
	}
}
