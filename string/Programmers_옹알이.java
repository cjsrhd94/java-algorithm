package string;

import java.util.ArrayList;
import java.util.List;

public class Programmers_옹알이 {
	public static void main(String[] args) {
		Programmers_옹알이 main = new Programmers_옹알이();
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		main.solution(babbling);
	}

	public int solution(String[] babbling) {
		int answer = 0;
		List<String> word = new ArrayList<>();
		word.add("aya");
		word.add("ye");
		word.add("woo");
		word.add("ma");

		List<String> wordDouble = new ArrayList<>();
		wordDouble.add("ayaaya");
		wordDouble.add("yeye");
		wordDouble.add("woowoo");
		wordDouble.add("mama");

		loop:
		for (int i = 0; i < babbling.length; i++) {
			for (String value : wordDouble) {
				if (babbling[i].contains(value)) {
					continue loop;
				}
			}
			for (String s : word) {
				// ""으로 변경해주면, 바뀐 문자열이 합쳐져 새로운 단어를 만들어 내는 경우가 있다.
				babbling[i] = babbling[i].replace(s, " ");
			}
		}

		for (String s : babbling) {
			// 이를 위해 " "과 같이 공백을 삽입하고, 이를 최종 검사전 ""으로 변경해준다.
			String process = s.replace(" ", "");
			if (process.equals("")) {
				answer++;
			}
		}
		return answer;
	}
}
