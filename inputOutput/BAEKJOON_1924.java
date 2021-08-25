package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BAEKJOON_1924 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        br.close();

        int[] arrMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int sum = 0;
        for (int i = 0; i < a; i++){
            sum += arrMonth[i];
        }

        sum += b;
        System.out.println(days[sum % 7]);

    }
}
