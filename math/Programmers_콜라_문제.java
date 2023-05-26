package math;

public class Programmers_콜라_문제 {
	public static void main(String[] args) {
		Programmers_콜라_문제 main = new Programmers_콜라_문제();
		main.solution(2,1,20);
	}

	public int solution(int a, int b, int n) {
		// 총 새로 받은 콜라 개수
		int totalCola = 0;
		// 현재 남은 콜라 개수
		int currentCola = n;
		while (true) {
			if (currentCola < a) {
				break;
			}
			totalCola = totalCola + (currentCola/a) * b;
			currentCola = (currentCola/a) * b + (currentCola % a);
		}
		return totalCola;
	}
}
