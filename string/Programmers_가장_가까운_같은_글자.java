package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programmers_가장_가까운_같은_글자 {
	public static void main(String[] args) {
		Programmers_가장_가까운_같은_글자 main = new Programmers_가장_가까운_같은_글자();
		main.solution("scmkascmimcalsmcl");
	}

	public int[] solution(String s) {
		String[] strArr = s.split("");
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < strArr.length; i++) {
			list.add(-1);
		}

		for (int i = 1; i < strArr.length; i++) {
			for (int j = i-1; j >= 0; j--) {
				if ((i != j) && (strArr[i].equals(strArr[j]))) {
					list.set(i, i-j);
					break;
				}
			}
		}

		return list.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}
}
