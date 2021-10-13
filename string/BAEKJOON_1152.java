package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BAEKJOON_1152 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<String> list = new ArrayList<String>();

        st = new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens() == true){
                list.add(st.nextToken());
        }
        System.out.println(list.size());
    }
}
