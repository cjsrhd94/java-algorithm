package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BAEKJOON_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            arr.add(num);
        }

        br.close();

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i) + "\n");
        }
        System.out.println(sb);
    }
}
