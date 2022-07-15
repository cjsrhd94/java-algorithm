package math;

public class Programmers_x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long l = x;
        long[] answer = new long[n];
        for (int i = 1; i <= answer.length; i++) {
            answer[i - 1] = l * i;
        }
        return answer;
    }
}
