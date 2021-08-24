package inputOutput;

import java.util.Scanner;

public class BAEKJOON_2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();

        sc.close();

        for (int i = 0; i < str; i++) {
            System.out.println(i + 1);
        }
    }
}
