package math;

public class Programmers_두_정수_사이의_합 {
    public long solution(int a, int b) {
        long sum = 0;
        int small = 0;
        int big = 0;

        if (a == b) {
            return a;
        }

        if (a > b) {
            small = b;
            big = a;
        }

        if(a < b) {
            small = a;
            big = b;
        }

        for (int i = small; i <= big; i++) {
            sum += i;
        }

        return sum;
    }
}
