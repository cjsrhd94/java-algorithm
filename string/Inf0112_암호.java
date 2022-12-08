package string;

import java.util.Scanner;

public class Inf0112_암호 {
    public static void main(String[] args) {
        Inf0112_암호 main = new Inf0112_암호();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(n, str));
    }

    private String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0,7)
                    .replace("#", "1")
                    .replace("*", "0");

            int num = Integer.parseInt(tmp, 2);
            answer+=(char)num;
            str= str.substring(7);
        }
        return answer;
    }
}
