package Week5;

/*Isaac Levine
 * 9/17
 * CSE007 Fall 2022: Week 5 Participation
 * The purpose of this program is to print a twist of a length inputted by the user.
 */
import java.util.Scanner; 

public class TwistGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valid = false;
        int length = 0;

        System.out.println("Please enter a positive integer for the length of the twist");
        while (!valid) { // Repeats until user entered a positive integer
            if (scan.hasNextInt()){
                length = scan.nextInt();
                if (length <= 0) {
                    System.out.println("This entry was not a positive integer. Please enter a positive integer.");
                } else {
                    valid = true;
                }

            } else {
                String junk = scan.nextLine();
                junk = junk + " ";
                System.out.println("This entry was not an integer. Please enter a positive integer.");
            }
        }

        for (int i = 0; i < length/3; ++i) {
            System.out.print("\\ /");
        } if (length % 3 == 1) {
            System.out.print("\\");
        } else if (length % 3 == 2) {
            System.out.print("\\ ");
        } System.out.println();

        for (int i = 0; i < length/3; ++i) {
            System.out.print(" X ");
        } if (length % 3 == 1) {
            System.out.print(" ");
        } else if (length % 3 == 2) {
            System.out.print("  ");
        } System.out.println();

        for (int i = 0; i < length/3; ++i) {
            System.out.print("/ \\");
        } if (length % 3 == 1) {
            System.out.print("/");
        } else if (length % 3 == 2) {
            System.out.print("/ ");
        } System.out.println();




        scan.close();
    }
}
