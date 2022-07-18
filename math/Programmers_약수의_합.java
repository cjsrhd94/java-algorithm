package math;

import java.util.HashSet;
import java.util.Set;

public class Programmers_약수의_합 {
    public int solution(int n) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                set.add(i);
            }
        }

        for (int s : set) {
            answer += s;
        }

        return answer;
    }
}
