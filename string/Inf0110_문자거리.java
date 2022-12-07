package string;

import java.util.Scanner;

public class Inf0110_문자거리 {
    public static void main(String[] args) {
        Inf0110_문자거리 main = new Inf0110_문자거리();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : main.solution(str, c)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i)==t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
