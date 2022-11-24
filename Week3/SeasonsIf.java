package Week3;
/*Isaac Levine
 * 9/5
 * CSE007 Fall 2022: Class Participation 3
 * The purpose of this program is to print a season of a specific date, given the month and day as the input, using nested if and else if statements
*/
import java.util.Scanner;

public class SeasonsIf {
    public static void main(String[] args) {
        // Creates an input for the user to enter the month and day
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a date in this format(Month, day)");
        String month = scnr.next();
        int day = scnr.nextInt();

        // Removes comma from the string "month" if present
        month = month.replace(",","");

        // Print statement before the season
        System.out.print("The "+day+" of "+month+" falls in ");
        
        // Creates nested loops to print a season for its corresponding month and day.
        if (month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
            System.out.println("Winter");
        }
        else if (month.equalsIgnoreCase("March")){
            if (day <= 19) {
                System.out.println("Winter");
            }
            else {
                System.out.println("Spring");
            }
            }
        else if (month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
            System.out.println("Spring");
        }
        else if (month.equalsIgnoreCase("June")){
            if (day <= 20) {
                System.out.println("Spring");
            }
            else {
                System.out.println("Summer");
            }
        }
        else if (month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
            System.out.println("Summer");
        }
        else if (month.equalsIgnoreCase("September")){
            if (day <= 21) {
                System.out.println("Summer");
            }
            else {
                System.out.println("Fall");
            }
        }
        else {
            System.out.println("Fall");
        }
        //Closes the scanner
        scnr.close();
    }
}
