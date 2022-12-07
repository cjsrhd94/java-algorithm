package string;

import java.util.Scanner;

public class Inf0107_회문문자열 {
    public static void main(String[] args) {
        Inf0107_회문문자열 main = new Inf0107_회문문자열();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() -i -1)) {
                answer = "NO";
            }
        }
        return answer;
    }

    private String solution2(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str)
                .reverse()
                .toString();
        if (!str.equalsIgnoreCase(tmp)) {
            answer = "No";
        }
        return answer;
    }
}
