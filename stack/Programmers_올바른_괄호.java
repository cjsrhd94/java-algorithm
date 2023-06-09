package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Programmers_올바른_괄호 {
	public static void main(String[] args) {
		Programmers_올바른_괄호 main = new Programmers_올바른_괄호();
		main.solution(")()(");
	}

	public boolean solution(String s) {
		boolean answer = true;
		Stack<Character> stack = new Stack<>();
		try {
			for (char c : s.toCharArray()) {
				if (c == '(') {
					stack.push('(');
				} else {
					stack.pop();
				}
			}
			if (stack.size() > 0) {
				answer = false;
			}
		} catch (EmptyStackException e) {
			answer = false;
		}

	return answer;
	}
}
