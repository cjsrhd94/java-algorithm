package string;

public class Programmers_문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        int idx = 0;

        String[] strArray = s.toLowerCase().split("");
        for (String str : strArray) {
            if (str.equals("p")) {
                idx += 1;
            }
            if (str.equals("y")) {
                idx -= 1;
            }
        }

        if (idx == 0) {
            return true;
        } else {
            return false;
        }
    }
}
