package string;

import java.util.Scanner;

public class Inf0105_특정_문자_뒤집기 {

    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt<rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Inf0105_특정_문자_뒤집기 main = new Inf0105_특정_문자_뒤집기();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(main.solution(str));
    }
}
