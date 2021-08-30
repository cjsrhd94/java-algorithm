package inputOutput;

import java.util.Scanner;

public class BAEKJOON_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        sc.close();

        String[] numArray = num.split(" ");
        int sum = 0;

        for (int i = 0; i < numArray.length; i++) {
           sum += Integer.parseInt(numArray[i]) * Integer.parseInt(numArray[i]);
        }
        System.out.println(sum % 10);
    }
}

