package math;

public class Programmers_최대공약수와_최소공배수 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = gcd(n,m);
		answer[1] = lcm(n,m);
		return answer;
	}

	private int gcd (int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a%b);
	}

	private int lcm (int a, int b) {
		return a * b / gcd(a,b);
	}
}
