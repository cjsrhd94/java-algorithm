package math;

import java.util.Scanner;

public class Programmers_기사단원의_무기 {

	public static void main(String[] args) {
		Programmers_기사단원의_무기 main = new Programmers_기사단원의_무기();
		System.out.println(main.solution(5,3,2));
	}

	public int solution(int number, int limit, int power) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			int num = 0;

			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (j == Math.sqrt(i)) {
					num++;
					continue;
				}
				if (i%j == 0) {
					num = num + 2;
				}
				if (i == 1 && j == 1) {
					num = num - 2;
				}
			}

			if (num > limit) {
				num = power;
			}

			sum = sum + num;
		}
		return sum;
	}
}
