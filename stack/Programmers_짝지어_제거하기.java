package stack;

import java.util.Stack;

public class Programmers_짝지어_제거하기 {
	public static void main(String[] args) {
		Programmers_짝지어_제거하기 main = new Programmers_짝지어_제거하기();
		main.solution("baabaa");
	}

	public int solution(String s) {
		Stack<Character> stack = new Stack<>();

		for (Character c : s.toCharArray()) {
			if (stack.isEmpty()) {
				stack.push(c);
				continue;
			}
			if (stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
