package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_1002 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // 중점과 반지름이 같을 때
            if(x1 == x2 && y1 == y2 && r1 == r2){
                System.out.println(-1);
            }
            // 두 원의 반지름 합보다 중점간 거리가 더 길 때
            else if (distance_pow > Math.pow(r1 + r2, 2)) {
                System.out.println(0);
            }
            // 원 안에 원이 있으나 내접하지 않을 때
            else if (distance_pow < Math.pow(r2 - r1, 2)) {
                System.out.println(0);
            }
            // 내접할 때
            else if (distance_pow == Math.pow(r2 - r1, 2)) {
                System.out.println(1);
            }
            // 외접할 때
            else if (distance_pow == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }
    }
}
