package string;

public class Programmers_시저_암호 {
	public String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer = answer.concat(" ");
				continue;
			}

			int origin = s.charAt(i);
			int caesarNum = origin + n;
			if (origin >= 65 && origin <= 90) {
				if (caesarNum > 90) {
					answer = answer.concat(String.valueOf((char) (caesarNum -26)));
					continue;
				}
				answer = answer.concat(String.valueOf((char) caesarNum));
				continue;
			}
			if (origin >= 97 && origin <= 122) {
				if (caesarNum > 122) {
					answer = answer.concat(String.valueOf((char) (caesarNum -26)));
					continue;
				}
				answer = answer.concat(String.valueOf((char) caesarNum));
				continue;
			}
		}
		return answer;
	}
}
