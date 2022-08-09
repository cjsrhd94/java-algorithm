package math;

import java.util.Arrays;

public class Programmers_최댓값과_최솟값 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        solution(s);
    }

    public static String solution(String s) {
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(intArr);

        String answer = intArr[0] + " " + intArr[intArr.length-1];


        return answer;
    }
}
