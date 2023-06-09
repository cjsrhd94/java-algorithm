package math;

public class Programmers_숫자의_표현 {
	public static void main(String[] args) {
		Programmers_숫자의_표현 main = new Programmers_숫자의_표현();
		main.solution(15);
	}
	public int solution(int n) {
		int answer = 0;
		// i는 인덱스
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = i; j <= n; j++) {
				sum += j;
				if (sum > n) {
					break;
				}
				if (sum == n) {
					answer++;
					break;
				}
			}
		}
		return answer;
	}
}
