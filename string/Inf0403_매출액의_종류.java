package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inf0403_매출액의_종류 {
    public static void main(String[] args) {
        Inf0403_매출액의_종류 main = new Inf0403_매출액의_종류();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // 초기값을 세팅해준다.
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(rt, 0) + 1);
            answer.add(map.size());
            // lt가 가르키는 값을 하나 뺀다.
            map.put(arr[lt], map.get(arr[lt]) - 1);
            // 만약 lt가 가르키는 값이 0이라면 해당 key를 remove해준다.
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            // 그 후에 lt 증가.
            lt++;
        }
        return answer;
    }
}
