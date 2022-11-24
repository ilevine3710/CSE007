package Week6;
/*Isaac Levine
 * 9/23
 * CSE007 Fall 2022: Lab 5
 * The purpose of this program is to print a word in a certain pattern that the user chooses
 */

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean loopContinue = true;
    
        do {
            System.out.println("Please print enter the choice of your pattern (A, B, C, D, or X), followed by the string you want to be altered. Please follow this pattern: CHOICE STRING");
            String entry = scan.nextLine();
            entry = entry.replace(" ", ""); // Deletes spaces from the entry
            String choice = entry.substring(0,1); // Assigns the choice as the first letter of the entry
            String word = entry.substring(1,entry.length()); // Assigns the word as the rest of the string ignoring the choice

            switch(choice) {
                case ("A"):
                    for(int row = 0; row < word.length(); row++) {
                        for (int col = 0; col <= row; col++) {
                            System.out.print(word.charAt(word.length() - 1 - col) + " ");
                        } System.out.println();
                    } break;
                case ("B"):
                    for(int row = 0; row < word.length(); row++) {
                        for (int col = 0; col < word.length() - row; col++) {
                            System.out.print(word.charAt(col) + " ");
                        } System.out.println();
                    } break;
                case ("C"):
                    for(int row = 0; row < word.length(); row++) {
                        for (int space = word.length() - 1; space >= row; space--) { // Loop for spaces
                            System.out.print("  ");
                        } for (int col = row; col >= 0; col--) { // Loop for chars
                            System.out.print(word.charAt(col) + " ");
                        } System.out.println();
                    } break;
                case ("D"):
                    for(int row = 0; row < word.length(); row++) {
                        for (int col = 0; col < word.length() - row; col++) {
                            System.out.print(word.charAt(word.length()- col - 1 - row) + " ");
                        } System.out.println();
                    } break;
                case ("X"): // Exits the program
                    System.out.println("You have ended the program");
                    loopContinue = false; 
                    break;
                default: // Not a valid choice
                    System.out.println("This is not a valid choice. Please enter a correct choice and re-enter your String.");
                    break;
            }
        } while (loopContinue); // Repeats loop until user enters an X and cancels the loop

        scan.close();
    }
}
