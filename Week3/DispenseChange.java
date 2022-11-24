package Week3;
/*Isaac Levine
 * 9/4
 * CSE007 Fall 2022: Homework 1 
 * The purpose of this program is to dispense the correct amount of change based on the purchase price and the money given.
*/
import java.util.Scanner;

public class DispenseChange {
    public static void main(String[] args) {
    
     //Creates and input for the user to enter the price of the item they are buying
     Scanner scnr = new Scanner(System.in);
     System.out.println("Enter the price of the item you are buying in cents.");
     int price = scnr.nextInt();
     System.out.println("Enter the amount of dollars you are giving to the vending machine.");
     int money = scnr.nextInt();
    
    //Creates variables for each coin and their value
     final int quarterValue = 25;
     int quarterNumber = 0;
     final int dimeValue = 10; 
     int dimeNumber = 0;   
     final int nickelValue = 5;  
     int nickelNumber = 0; 
     final int pennyValue = 1; 
     int pennyNumber = 0; 

     //Converts dollar amount to number of cents
     int moneyCents = money * 100;

     /*Subtracts the value of each coin from the money given until the money given minus the price of the item is less then the value of each coin
     The loop starts going from the coin with the most value to the coin with the least value 
     */
     while (moneyCents - price >= quarterValue) {
        quarterNumber += 1;
        moneyCents -= quarterValue;
     }
     while (moneyCents - price >= dimeValue) {
        dimeNumber += 1;
        moneyCents -= dimeValue;
     }
     while (moneyCents - price >= nickelValue) {
        nickelNumber += 1;
        moneyCents -= nickelValue;
     }
     while (moneyCents - price >= pennyValue) {
        pennyNumber += 1;
        moneyCents -= pennyValue;
     }

     //Prints the price of the item, the money given to purchase the item, and the amount of change in each coin
     System.out.println("You bought an item for " + price + "¢. You paid with $" + money + ".00. You will recieve the following in change:");
     System.out.println("Pennies: " + pennyNumber);
     System.out.println("Nickels: " + nickelNumber);
     System.out.println("Dimes: " + dimeNumber);
     System.out.println("Quarters: " + quarterNumber);

     //Closes the scanner
    scnr.close();
    }
}
