package string;

public class Programmers_크기가_작은_부분_문자열 {
	public static void main(String[] args) {
		Programmers_크기가_작은_부분_문자열 main = new Programmers_크기가_작은_부분_문자열();
		main.solution("500220839878", "7");
	}
	public int solution(String t, String p) {
		int answer = 0;
		for (int i = 0; i < t.length() - (p.length() - 1); i++) {
			if (Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
				answer++;
			}
		}
		return answer;
	}
}
