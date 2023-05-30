package queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers_카드_뭉치 {
	public static void main(String[] args) {
		Programmers_카드_뭉치 main = new Programmers_카드_뭉치();
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		main.solution(cards1, cards2, goal);
	}

	public String solution(String[] cards1, String[] cards2, String[] goal) {
		Queue<String> cards1ToQ = new LinkedList<>();
		Collections.addAll(cards1ToQ, cards1);
		Queue<String> cards2ToQ = new LinkedList<>();
		Collections.addAll(cards2ToQ, cards2);
		Queue<String> goalToQ = new LinkedList<>();
		Collections.addAll(goalToQ, goal);

		for (int i = 0; i < goal.length; i++) {
			if (goalToQ.peek().equals(cards1ToQ.peek())) {
				goalToQ.poll();
				cards1ToQ.poll();
				continue;
			}
			if (goalToQ.peek().equals(cards2ToQ.peek())) {
				goalToQ.poll();
				cards2ToQ.poll();
				continue;
			}
			return "No";
		}

		return "Yes";
	}
}
