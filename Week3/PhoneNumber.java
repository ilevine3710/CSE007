package Week3;
/*Isaac Levine
 * 9/2
 * CSE007 Fall 2022: Lab 1 
 * The purpose of this program is to practice using the modulus operator to isolate separate digits in an int value in order to reformat the phone number as a String.  
 */
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {

        //Declares phoneNumber variable and creates a scanner named "scan"
        long phoneNumber;
        Scanner scan = new Scanner(System.in);

        // Prompts an input for the user
        System.out.println("Enter your 10 digit phone number: ");
        phoneNumber = scan.nextLong();  

        // Assigns Variables to the different parts of the phone number using the modulo and division operators
        long AreaCode = phoneNumber/10000000;
        long PreFix = (phoneNumber/10000)%1000;
        long LineNumber = phoneNumber%10000;

        //Prints the results
        System.out.print("Formatted phone number: ");
        System.out.print(" (" + AreaCode +") " + PreFix + "-" + LineNumber);

        scan.close();
    }
}
