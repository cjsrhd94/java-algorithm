package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String arr[] = new String[N];

        for (int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++){
            int total_score = 0;
            int extra_score = 0;

            for(int j = 0; j < arr[i].length(); j++){
                if (arr[i].charAt(j) == 'O'){
                    extra_score++;
                } else {
                    extra_score = 0;
                }
                total_score += extra_score;
            }
            sb.append(total_score).append('\n');
        }
        System.out.print(sb);
    }
}
