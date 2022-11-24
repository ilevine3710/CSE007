package Week3;
/*Isaac Levine
 * 9/7
 * CSE007 Fall 2022: Class Participation 3
 * The purpose of this program is to take and input for a Username, being their first and last name, as well as their birth year, and convert it into a Username format
*/
import java.util.Scanner;

public class Username {
    public static void main(String[] args) {
        //Asks input from the user to enter their information
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your information in the format [FirstName LastName Year] ");

        // Assigns variables to the entered information
        String firstName = scnr.next();
        String lastName = scnr.next();
        String year = scnr.next();

        // Creates new variable for the names and year entered and alters them to be shorter to create the Username
        String last = lastName.substring(0,4);
        char first = firstName.charAt(0);
        String number = year.substring(2);

        // Print the Username
        System.out.print("Your Username: ");
        System.out.println(last+first+number);

        //Closes the scanner
        scnr.close();  
    }
}
