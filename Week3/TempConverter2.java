package Week3;
/*Isaac Levine
 * 9/4
 * CSE007 Fall 2022: Homework 1 
 * The purpose of this program is to convert a user's input from fahrenheit to celsius
*/
import java.util.Scanner;

public class TempConverter2 {
    public static void main(String[] args) {
        
        //Creates and input for the user to enter the temperature in fahrenheit
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the temperature in degrees Fahrenheit");
        double fahrenheit = scnr.nextDouble();

        //Creates a variable that converts fahrenheit to celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        //Prints results
        System.out.println(fahrenheit + "° Fahrenheit is equal to " + Math.round(celsius * 100.0) / 100.0 + "° in Celsius.");
        
        //Closes the scanner
        scnr.close();
    }
}
