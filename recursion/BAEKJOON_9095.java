package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int goal = Integer.parseInt(br.readLine());
            int count = go(0, goal);
            System.out.println(count);
        }
    }

    private static int go(int sum, int goal) {
        if (sum > goal) {       //목표값보다 크면 카운팅하지 않는다.
            return 0;
        }
        if (sum == goal) {      //목표값과 같으면 카운팅한다.
            return 1;
        }

        //재귀
        int now = 0;
        for (int i = 1; i <= 3; i++) {
            now += go(sum + i, goal);
        }
        return now;
    }
}
