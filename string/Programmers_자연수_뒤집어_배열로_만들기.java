package string;

public class Programmers_자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");

        int[] answer = new int[strArr.length];

        for (int i = strArr.length-1; i >= 0; i--) {
            answer[strArr.length-i-1] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}
