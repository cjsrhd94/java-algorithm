package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_2908 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String A = st.nextToken();
        char[] arrA = {A.charAt(2), A.charAt(1), A.charAt(0)};
        String B = st.nextToken();
        char[] arrB = {B.charAt(2), B.charAt(1), B.charAt(0)};

        int a = Integer.parseInt(String.valueOf(arrA));
        int b = Integer.parseInt(String.valueOf(arrB));

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
