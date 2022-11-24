
import java.util.Scanner;

public class ExamTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        boolean isValid = false;
        String junk = "";
        junk = junk + " ";
        int input = 0;
        System.out.println("Enter a positive integer");

        do {
            if (!scan.hasNextInt()) {
                System.out.println("Please enter a positive integer");
                junk = scan.next();
            } else {
                input = scan.nextInt();
                if (input <= 0) {
                    System.out.println("Please enter a positive integer");
                } else {
                    isValid = true;
                }
            }
        } while (!isValid);

        char x = 'A';
        for (int row = 0; row < input; row++) {
            for (int col = 0; col <= row; col++){
                System.out.print(x+" ");
                x+=1;
            } System.out.println();
        }

        scan.close();
    }
}
