package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class BAEKJOON_10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while((str = br.readLine()) != null){                           //null값이 들어가야 반복문 탈출!
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println((a + b));
        }
        br.close();
    }
}
