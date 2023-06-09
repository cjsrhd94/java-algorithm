package string;

public class Programmers_JadenCase_문자열_만들기 {
	public static void main(String[] args) {
		Programmers_JadenCase_문자열_만들기 main = new Programmers_JadenCase_문자열_만들기();
		main.solution("a    aa");
	}

	public String solution(String s) {
		StringBuilder sb = new StringBuilder();

		boolean blank = true;

		for (char c : s.toCharArray()) {
			sb.append(blank ? Character.toUpperCase(c) : Character.toLowerCase(c));
			blank = (c == ' ');
		}

		return sb.toString();
	}
}
