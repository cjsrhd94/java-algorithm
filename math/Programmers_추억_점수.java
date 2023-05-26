package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Programmers_추억_점수 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		ArrayList<Integer> answer = new ArrayList<>();

		for (String[] strings : photo) {
			int total = 0;
			for (String string : strings) {
				for (Map.Entry<String, Integer> ele : map.entrySet()) {
					if (ele.getKey().equals(string)) {
						total = total + ele.getValue();
					}
				}
			}
			answer.add(total);
		}

		return answer.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}
}
