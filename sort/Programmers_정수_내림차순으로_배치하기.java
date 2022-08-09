package sort;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_정수_내림차순으로_배치하기 {
    public long solution(long n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        Arrays.sort(strArr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s: strArr) {
            sb.append(s);
        }

        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}
