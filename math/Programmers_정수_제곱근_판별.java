package math;

public class Programmers_정수_제곱근_판별 {
    public long solution(long n) {
        long sqrts = (long) (Math.sqrt(n));

        if (sqrts * sqrts == n) {
            return (sqrts + 1) * (sqrts + 1);
        }

        return -1;
    }
}
