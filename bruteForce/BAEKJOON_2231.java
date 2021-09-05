package bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class BAEKJOON_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(num);

        while (num != 0) {
            num--;
            String number = String.valueOf(num);
            String[] digits = number.split("(?<=.)");

            int sum = 0;

            for (int i = 0; i < digits.length; i++) {
                sum += Integer.parseInt(digits[i]);
            }

            if (arr.get(0) != num + sum) {
                continue;
            } else {
                arr.add(num);
                continue;
            }
        }
        if (arr.size() == 1){
            System.out.println(0);
        } else {
            System.out.println(arr.get(arr.size()-1));
        }
    }
}
