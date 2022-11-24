package Week6;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int num = 1;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(num + " ");
                num *= 2;
            } System.out.println();
        }
        s.close();
    }
}