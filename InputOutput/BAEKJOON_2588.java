package InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BAEKJOON_2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        br.close();

        System.out.println(A * (B.charAt(2) - '0'));        //아스키 코드 값으로 숫자 '1' = 49, '2' = 50 ... 로 표현된다.
        System.out.println(A * (B.charAt(1) - '0'));        //따라서 48에 해당하는 '0'을 빼주어야 원하는 숫자를 얻을 수 있다.
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));


    }
}
