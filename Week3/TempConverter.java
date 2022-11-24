package Week3;
/*Isaac Levine
 * 9/4
 * CSE007 Fall 2022: Homework 1 
 * The purpose of this program is to convert a user's input from celsius to fahrenheit
*/
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        
        //Creates and input for the user to enter the temperature in Celsius
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees Celsius");
        double celsius = scan.nextDouble();

        //Creates a variable that converts celsius to fahrenheit
        double fahrenheit = ((9 * celsius) / 5) + 32;

        //Prints results
        System.out.println(celsius + "° Celsius is equal to " + Math.round(fahrenheit * 100.0) / 100.0 + "° in Fahrenheit.");

        //Closes the scanner
        scan.close();
    }
}
