package stack;

import java.util.Scanner;
import java.util.Stack;

public class Inf0502_괄호문자제거 {
    public static void main(String[] args) {
        Inf0502_괄호문자제거 main = new Inf0502_괄호문자제거();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {
        String answer ="";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                // stack.pop()한 것이 '('일 때 까지
                while (true) {
                    if (stack.pop() == '(')
                        break;
                }
            } else {
                stack.push(x);
            }
        }
        for (Character character : stack) {
            answer += character;
        }
        return answer;
    }
}
