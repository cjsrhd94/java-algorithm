package string;

public class Programmers_문자열_나누기 {
	public static void main(String[] args) {
		Programmers_문자열_나누기 main = new Programmers_문자열_나누기();
		main.solution("abracadabra");
	}

	public int solution(String s) {
		String copyS = s;
		int answer = 0;
		char start = ' ';
		int sCount = 0;
		int eCount = 0;
		for (int i = 0; i < copyS.length(); i++) {
			if (start == ' ') {
				start = copyS.charAt(i);
			}
			if (copyS.charAt(i) == start) {
				sCount++;
			} else {
				eCount++;
			}
			if (sCount == eCount) {
				copyS = copyS.substring(sCount * 2, copyS.length());
				i = i - sCount * 2;
				start = ' ';
				sCount = 0;
				eCount = 0;
				answer++;
			}
		}
		if (sCount != eCount) {
			answer++;
		}
		return answer;
	}
}
