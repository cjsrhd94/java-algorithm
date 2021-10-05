package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                count++;
            } else if (100 <= i && i <= N) {
                String num = String.valueOf(i);
                char[] arr = num.toCharArray();

                if (Integer.valueOf(arr[2]) - Integer.valueOf(arr[1]) == Integer.valueOf(arr[1]) - Integer.valueOf(arr[0])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
