package string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Programmers_개인정보_수집_유효기간 {
	public static void main(String[] args) {
		Programmers_개인정보_수집_유효기간 main = new Programmers_개인정보_수집_유효기간();
		String[] arr = {"A 6", "B 12", "C 3"};
		String[] arr1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		main.solution("2022.05.19", arr, arr1);
	}

	public int[] solution(String today, String[] terms, String[] privacies) {
		Map<String, Integer> map = new HashMap<>();
		for (String term : terms) {
			String[] sp = term.split(" ");
			map.put(sp[0], Integer.parseInt(sp[1]));
		}

		String newToday = today.replace(".", "-");
		List<String> newPrivacies = new ArrayList<>();
		for (String privacy : privacies) {
			newPrivacies.add(privacy.replace(".", "-"));
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate todayLD = LocalDate.parse(newToday, formatter);

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < newPrivacies.size(); i++) {
			String[] s = newPrivacies.get(i).split(" ");
			LocalDate expDate = LocalDate.parse(s[0], formatter).plusMonths(map.get(s[1]));
			if (todayLD.isAfter(expDate) || todayLD.isEqual(expDate)) {
				result.add(i + 1);
			}
		}
		int[] answer = new int[result.size()];

		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
}
