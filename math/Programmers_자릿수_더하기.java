package math;

public class Programmers_자릿수_더하기 {
    public int solution(int n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        int answer = 0;
        for (String s : strArr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
