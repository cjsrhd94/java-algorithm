package String;

import java.util.Scanner;

public class BAEKJOON_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        while (!num.equals("0")) {
            Boolean check = true;
            if (num.length() % 2 == 1) {
                for (int i = 0; i < num.length()/2; i++) {
                    if (num.charAt(i) != num.charAt(num.length()-1-i)) {
                        check = false;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < num.length()/2; i++) {
                    if (num.charAt(i) != num.charAt(num.length()-1-i)) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            num = sc.next();
        }
    }
}

