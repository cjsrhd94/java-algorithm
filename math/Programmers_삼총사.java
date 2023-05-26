package math;

public class Programmers_삼총사 {
	public int solution(int[] number) {
		int answer = 0;
		int end = number.length - 2;

		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end + 1; j++) {
				for (int k = j + 1; k < end + 2; k++) {
					if (number[i] + number[j] + number[k] == 0) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
