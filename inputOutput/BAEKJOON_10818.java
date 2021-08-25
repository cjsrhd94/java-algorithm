package inputOutput;
import java.util.Scanner;
public class BAEKJOON_10818 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int arr[] = new int[count];

        int max = -1000000;
        int min = 1000000;

        for(int i = 0; i < count; i++){
            arr[i] = sc.nextInt();

            if (arr[i] >= max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        sc.close();
        System.out.println(min + " " + max);
    }
}
