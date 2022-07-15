package string;

public class Programmers_이상한_문자_만들기 {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String str : array) {
            if (str.contains(" ")) {
                cnt = 0;
            } else {
                cnt += 1;
            }

            if (cnt % 2 == 0) {
                answer += str.toLowerCase();
            } else {
                answer += str.toUpperCase();
            }
        }
        return answer;
    }
}
