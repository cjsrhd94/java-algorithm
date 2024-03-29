package string;

import com.sun.source.util.Trees;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Inf0405_K번째_큰_수 {
    public static void main(String[] args) {
        Inf0405_K번째_큰_수 main = new Inf0405_K번째_큰_수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, k, arr));
    }

    private int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k) {
                return x;
            }
        }
        return answer;
    }

}
