package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BAEKJOON_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            if (line.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                  stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' || c == ']'){
                    stack.push(c);
                }
            }

            if (stack.empty()){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
        }
    }
}