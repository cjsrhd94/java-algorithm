package math;

public class Programmers_부족한_금액_계산하기 {
	public long solution(int price, int money, int count) {
		int paid = 0;
		for (int i = 1; i <= count; i++) {
			paid = paid + price * i;
		}
		int result = money - paid;
		if (result < 0) {
			return -result;
		} else {
			return 0;
		}
	}
}
