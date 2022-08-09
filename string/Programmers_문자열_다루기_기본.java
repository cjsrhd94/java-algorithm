package string;

public class Programmers_문자열_다루기_기본 {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                int i = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
}
