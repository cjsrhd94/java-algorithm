package string;

import java.util.Scanner;

public class Inf0103_문장_속_단어 {

    public String solution (String str) {
        String answer="";
        int max = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            /* 최댓값 발견 공식 */
            if (len > max) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }

    public String solution2 (String str) {
        String answer="";
        int max = Integer.MIN_VALUE, pos;
        while ((pos=str.indexOf(' '))!=-1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len>max) {
                max=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if (str.length() > max) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Inf0103_문장_속_단어 main = new Inf0103_문장_속_단어();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
        System.out.println(main.solution2(str));
    }
}
