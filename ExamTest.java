import java.util.Scanner;

public class ExamTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int column;
        for (int row = 5; row >0; --row) {
            for (column = row; column < 10; column++) {
                if (column % 3 != 0) {
                    System.out.print("<");
                } else {
                    System.out.print(">");
                }
            } System.out.println();
        }

        scan.close();
    }
}
