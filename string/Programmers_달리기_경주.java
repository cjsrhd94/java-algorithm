package string;

import java.util.HashMap;
import java.util.Map;

public class Programmers_달리기_경주 {
	public static void main(String[] args) {
		Programmers_달리기_경주 main = new Programmers_달리기_경주();
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		System.out.println(main.solution(players, callings));
	}

	public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			hashMap.put(players[i], i);
		}

		for (String calling : callings) {
			Integer num = hashMap.get(calling);
			String beforePlayer = players[num - 1];

			players[num] = beforePlayer;
			players[num -1] = calling;

			hashMap.put(calling, num - 1);
			hashMap.put(beforePlayer, num);
		}

		return players;
	}
}
