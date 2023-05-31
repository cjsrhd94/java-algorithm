package sort;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_문자열_내림차순으로_배치하기 {
	public static void main(String[] args) {
		Programmers_문자열_내림차순으로_배치하기 main = new Programmers_문자열_내림차순으로_배치하기();
		System.out.println(main.solution("Zbcdefg"));
	}
	public String solution(String s) {
		String[] split = s.split("");
		Arrays.sort(split, Collections.reverseOrder());
		String answer = "";
		for (String str : split) {
			answer = answer + str;
		}
		return answer;
	}
}
