package Week8;
/*Isaac Levine
 * 9/14
 * CSE007 Fall 2022: Participation Week 4 
 * The purpose of this program is to count the number of characters in a string, excluding numbers, spaces, periods, commas, and exclamation points
 */

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = "";

        System.out.println("Enter a string:");
        string = scan.nextLine();

        while (string.contains(" ")||string.contains(",")||string.contains(".")||string.contains("!")){ // Checks if the string contains certain characters
            string = string.replace(" ",""); // Replaces space with nothing, .remove() works too
            string = string.replace("!","");
            string = string.replace(".","");
            string = string.replace(",","");
        } for (int i = 0; i <= 9; ++i) {
            String numChar = Integer.toString(i); // Changes i to a string
            while (string.contains(numChar)) {
                string = string.replace(numChar,"");
            } 
        }

        int stringLength = string.length();
        System.out.print("Your string has " + stringLength + " characters. (Excluding numbers, select punctuation, and spaces)");

        scan.close();
    }
}
