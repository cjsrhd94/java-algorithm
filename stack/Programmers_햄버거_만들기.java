package stack;

import java.util.Stack;

public class Programmers_햄버거_만들기 {
	public static void main(String[] args) {
		Programmers_햄버거_만들기 main = new Programmers_햄버거_만들기();
		int[] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		main.solution(arr);
	}

	public int solution(int[] ingredient) {
		int answer = 0;
		Stack<Integer> ingredients = new Stack<>();
		for (int i = 0; i < ingredient.length; i++) {
			ingredients.push(ingredient[i]);
			if (ingredients.size() >= 4
				&& ingredients.peek() == 1
				&& ingredients.get(ingredients.size()-2) == 3
				&& ingredients.get(ingredients.size()-3) == 2
				&& ingredients.get(ingredients.size()-4) == 1
			) {
				ingredients.pop();
				ingredients.pop();
				ingredients.pop();
				ingredients.pop();
				answer++;
			}
		}
		return answer;
	}
}
