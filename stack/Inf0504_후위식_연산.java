package stack;

import java.util.Scanner;
import java.util.Stack;

public class Inf0504_후위식_연산 {
    public static void main(String[] args) {
        Inf0504_후위식_연산 main = new Inf0504_후위식_연산();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                int i = (int) x;
                stack.push(i);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        return stack.get(0);
    }
}
