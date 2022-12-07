package string;

import java.util.Scanner;

public class Inf0109_숫자만_추출 {
    public static void main(String[] args) {
        Inf0109_숫자만_추출 main = new Inf0109_숫자만_추출();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }
}
