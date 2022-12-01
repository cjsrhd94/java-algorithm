package string;

import java.util.Scanner;

public class Inf0102_대소문자_변환 {

    public String solution (String str) {
        String answer="";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) answer+=Character.toUpperCase(c);
            else answer+=Character.toLowerCase(c);
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf0102_대소문자_변환 main = new Inf0102_대소문자_변환();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
