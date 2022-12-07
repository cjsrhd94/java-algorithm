package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Inf0104_단어_뒤집기 {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x)
                    .reverse()
                    .toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Inf0104_단어_뒤집기 main = new Inf0104_단어_뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String x : main.solution(n, str)) {
            System.out.println(x);
        }
    }
}
