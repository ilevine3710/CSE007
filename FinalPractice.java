import java.util.Scanner;

public class FinalPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String junk = scan.next();
        while (junk.length() != 1) { // Checks if the character input is 1 character
            System.out.println("This was not a valid input. Please enter a single character.");
            junk = scan.next();
        } char CHAR = junk.charAt(0);

        System.out.println("Enter triangle height: ");
        int height = 0;

        while (!scan.hasNextInt()) { // Check if the input is not an input
            System.out.println("This was not a valid input. Please enter a positive integer for the height of the triangle.");
            junk = scan.next();
        }
        height = scan.nextInt();
        while (height <= 0) {
            System.out.println("This was not a valid input. Please enter a positive integer for the height of the triangle.");
            height = scan.nextInt();
        } System.out.println();

        for (int row = 0; row < height; ++row){
            for (int col = 0; col <= row; ++ col) {
                System.out.print(CHAR + " ");
            } System.out.println();
        }
        scan.close();
    }
}
