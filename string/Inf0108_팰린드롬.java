package string;

import java.util.Scanner;

public class Inf0108_팰린드롬 {
    public static void main(String[] args) {
        Inf0108_팰린드롬 main = new Inf0108_팰린드롬();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer = "No";
        str = str.toLowerCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }
}
