package stack;

import java.util.Scanner;
import java.util.Stack;

public class Inf0505_쇠막대기 {
    public static void main(String[] args) {
        Inf0505_쇠막대기 main = new Inf0505_쇠막대기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }

        }
        return answer;
    }
}
