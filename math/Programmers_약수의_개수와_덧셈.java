package math;

public class Programmers_약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            int num = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                }
            }
            if (num % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        return sum;
    }
}
