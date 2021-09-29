package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int j = 0; j < N; j++) {
            for (int k = 2; k <= arr[j]; k++) {
                if (arr[j] % k != 0) {
                    continue;                   //나머지가 있다면 continue
                } else if (arr[j] == k) {       //arr[j]가 k와 같다면 count++
                    count++;
                    break;
                } else {
                    break;                      //중간에 나누어지는 수가 있다면 break
                }
            }
        }
        System.out.println(count);
    }
}

