package string;

import java.util.Scanner;

public class Programmers_직사각형_별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int j = 0; j < b; j++) {
			System.out.println("*".repeat(a));
		}
	}
}
