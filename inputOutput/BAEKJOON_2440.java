package inputOutput;
import java.util.Scanner;

public class BAEKJOON_2440 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        for (int i = 1; i < num + 1; i++){
            for (int j = num; j > i - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}