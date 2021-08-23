package inputOutput;

import java.util.Scanner;

public class BAEKJOON_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*hasNextLine(): 다음에 읽을 값이 있는지 확인하는 boolean타입의 메소드.
        * 값이 있다면 true를 반환한다. */
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            System.out.println(input);
        }
        sc.close();
    }
}