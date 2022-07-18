package string;

public class Programmers_키패드_누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int leftIdx = 10;
        int rightIdx = 12;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer = answer + "L";
                leftIdx = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer = answer + "R";
                rightIdx = num;
            } else {
                if (num == 0) {
                    num = 11;
                }
                // X축 이동거리 = Math.abs(num-idx) % 3;
                // Y축 이동거리 = Math.abs(num-idx) / 3;
                int leftDistance = (Math.abs(num-leftIdx))%3 + (Math.abs(num-leftIdx))/3;
                int rightDistance = (Math.abs(num-rightIdx))%3 + (Math.abs(num-rightIdx))/3;
                if (leftDistance > rightDistance) {
                    answer = answer + "R";
                    rightIdx = num;
                } else if (leftDistance < rightDistance) {
                    answer = answer + "L";
                    leftIdx = num;
                } else {
                    if (hand.equals("left")) {
                        answer = answer + "L";
                        leftIdx = num;
                    } else {
                        answer = answer + "R";
                        rightIdx = num;
                    }
                }
            }
        }

        return answer;
    }
}
