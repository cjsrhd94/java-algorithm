package string;

import java.util.Scanner;

public class Inf0101_문자찾기 {

    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for (char i : str.toCharArray()) {
            if (i==c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf0101_문자찾기 main = new Inf0101_문자찾기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(main.solution(str, c));
    }
}
