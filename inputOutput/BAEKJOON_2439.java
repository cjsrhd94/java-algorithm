package inputOutput;
import java.util.Scanner;

public class BAEKJOON_2439 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        for (int i = 1; i < num + 1; i++){
            for (int j = 1; j < num - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
