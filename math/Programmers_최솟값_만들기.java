package math;

import java.util.Arrays;

public class Programmers_최솟값_만들기 {
	public static void main(String[] args) {
		Programmers_최솟값_만들기 main = new Programmers_최솟값_만들기();
		int[] A = {1,4,2};
		int[] B = {5,4,4};

		main.solution(A, B);
	}
	public int solution(int []A, int []B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[A.length - 1 - i];
		}
		return answer;
	}
}
