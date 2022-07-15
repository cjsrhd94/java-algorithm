package string;

public class Programmers_하샤드_수 {
    public boolean solution(int x) {
        String toStr = Integer.toString(x);
        String[] toStrArray = toStr.split("");

        int sum = 0;
        for (String s : toStrArray) {
            sum += Integer.parseInt(s);
        }

        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}
