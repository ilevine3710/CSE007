package Week7;
/*Isaac Levine
 * 9/30
 * CSE007 Fall 2022: Lab 6
 * The purpose of this program is to allow the user to input 8 players and their ratings, assign each player a jersey, and allow the user to print and manipulate the data afterword 
 */
import java.util.Scanner;

public class Roster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String player = "";
        String junk = "";
        int rating = 0;
        boolean isValid = false;
        boolean loopContinue = true;
        String choice = "";
        String [] Players = new String[8]; // Creates String array with 8 indices
        int [] Ratings = new int[8]; // Creates int array with 8 indices
        int [] Jersey = new int[8]; // Creates int array with 8 indices

        for (int i = 0; i < 8; i++){
            System.out.println("Enter a Player");
            player = scan.nextLine(); // Next line for spaces in between first and last name
            System.out.println("Enter their rating");
            do {
                while (!scan.hasNextInt()) { // Check if the input is an int
                junk = scan.next();
                    System.out.println("Invalid rating. Enter this players correct rating (1-9)");
                } rating = scan.nextInt();
                if (rating >= 1 && rating <= 9){ // Checks if the rating is in the correct range
                    isValid = true; // Ends do-while loop
                    junk = scan.nextLine(); // Gets rid of space after Int is scanned in.
                } else {
                    System.out.println("Invalid rating. Enter this players correct rating (1-9)");
                    isValid = false;
                }
            } while (!isValid); // Do - while runs until the rating is valid

            Players [i] = player; // Inputs player into the array Players
            Ratings [i] = rating; // Inputs rating into the array Ratings
            Jersey [i] = (int) ((Math.random() * 99) + 1); // Assigns the jersey number to a random number from 1 - 99

        } 
        for (int i = 0; i < 8; i++) { // This loop checks if a jersey number is re used
            int index = 0; // Sets the index to 0, will check up until i
            while (index < i) {
                if (Jersey [i] == Jersey[index]) { // Is true if the jersey number generated is equal to a previous jersey number
                    Jersey [i] = (int) ((Math.random() * 99) + 1); // Assigns the jersey number to a random number from 1 - 99 again
                } else {
                    index += 1; // Increments the index as long as the jersey number generated is not equal to another jersey number in the array
                } 
            }
        } do {
            System.out.println("Choose a menu option:");
            System.out.println("O: Output Roster");
            System.out.println("A: Output players above a certain rating");
            System.out.println("U: Update player rating");
            System.out.println("Q: Quit");
            isValid = false;
            do {
                junk = scan.next();
                if (!(junk.equals("O")||junk.equals("A")||junk.equals("U")||junk.equals("Q"))){ // Check if one of the options is chosen, if not, the body occurs
                    System.out.println("Invalid choice. Please select a correct menu option");
                } else {
                    choice = junk; // Sets choice to the scanned in string
                    isValid = true; // Ends do-while loop
                }
            } while (!isValid); // Runs until choice is chosen

            switch (choice) {
                case "O":
                    for (int i = 0; i < 8; i++){
                        System.out.println("Player " + (i + 1) + ": ");
                        System.out.println("\t" + "Name: " + Players [i]); // Prints each player in the array Players
                        System.out.println("\t" + "Jersey Number: " + Jersey [i]); // Prints each jersey number in the array Jersey
                        System.out.println("\t" + "Rating: " + Ratings [i]); // Prints each rating in the array Ratings
                    } break;
                case "A":
                    System.out.println("Enter a rating");
                    boolean isValid2 = false;
                    do{
                        while (!scan.hasNextInt()) { // Checks if the input has an integer
                            junk = scan.next();
                            System.out.println("Please enter a valid rating (1-9)");
                        } rating = scan.nextInt();
                        if (rating >= 1 && rating <= 9){ // Checks if the rating is in the valid range
                            isValid2 = true; // Stops the loop
                        } else {
                            System.out.println("Invalid rating. Enter this players correct rating (1-9)");
                        }
                    } while (!isValid2); // Loop runs until rating is validated
                    System.out.println("Player with a rating of " + rating + " or more:");
                    for (int i = 0; i < 8; i++) {
                        if (rating <= Ratings [i]){ // Checks if the entered rating is less that the ratings of each player, only prints if true
                            System.out.println("Player " + (i+1) + ": ");
                            System.out.println("\t"+ "Name: " + Players [i]); // Prints each player in the array Players if the player rating is greater than the inputted rating
                            System.out.println("\t"+ "Jersey Number: " + Jersey [i]); // Prints each jersey number in the array Jersey if the player rating is greater than the inputted rating
                            System.out.println("\t" + "Rating: " + Ratings [i]); // Prints each rating in the array Ratings if the player rating is greater than the inputted rating
                        }
                    } break;
                case "U":
                    junk = scan.nextLine(); // Gets rid of space before next input
                    System.out.println("Whose rating would you like to update?");
                    int index = -1;
                    boolean isInArray = false;
                    String update = scan.nextLine();
                    for (int i = 0; i < 8; i++) {
                        if (update.equals(Players [i])) { //Check if the inputted name to update is in the players array
                            index = i; // Saves the index that the player name matches.
                            isInArray = true; // Valid if the name is in the array.
                        }
                    } System.out.println("What is this players new rating?");
                    isValid2 = false;
                    do {
                        while (!scan.hasNextInt()) { // Checks if entry is an int
                            junk = scan.next();
                            System.out.println("Please enter a valid rating (1-9)");
                        } rating = scan.nextInt();
                        if (rating >= 1 && rating <= 9){ // Checks if the rating is in the correct range
                            isValid2 = true;
                        } else {
                            System.out.println("Invalid rating. Enter this players correct rating (1-9)");
                        }
                    } while (!isValid2);
                    if (isInArray) {
                        Ratings [index] = rating; // Assigns the rating at the index to the new rating
                    } break;
                case "Q":
                    System.out.println("Bye!");
                    loopContinue = false; // Ends Do-While loop
                    break;
                default:
                    break;
            }
        } while (loopContinue); // Continues until the choice Q is chosen

        scan.close();
    }
}