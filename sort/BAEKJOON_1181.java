package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BAEKJOON_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i]= sc.next();
        }
        sc.close();

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() - s2.length() == 0) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });

        for (int i = 0; i < count; i++) {
            if (i + 1 != count) {
                if (arr[i].equals(arr[i + 1])) {
                    continue;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
