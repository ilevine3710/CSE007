package Week7;
/*Isaac Levine
 * 9/30
 * CSE007 Fall 2022: Lab 6
 * The purpose of this program is to create an array for a deck of cards, shuffle it, create two hands, and see which hand is worth more/which hand wins. 
 */

import java.util.Random;
import java.util.Scanner; 

public class CardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int index = 0;
        int count = 0;
        int hand1Value = 0;
        int hand2Value = 0;

        String [] suitNames = {"C","H","S","D"}; 
        String [] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; 
        String[] deck = new String[52]; 
        String[] hand1 = new String[5]; 
        String[] hand2 = new String[5];
        
        for (int i = 0; i < suitNames.length; i++) {
            for (int j = 0; j < rankNames.length; j++){
                deck [count] = suitNames [i] + rankNames [j]; // Adds each value of suitNames with each value of rankNames
                count += 1; // This variable is for the index of the deck
            }
        } System.out.println("Unshuffled deck of cards: ");
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck [i] + " "); // Uses a for loop to increment through the indices of the array deck to print each value in the array
        } System.out.println();
        System.out.println();

        for (int i = 0; i < deck.length; i++) {
            int x = rand.nextInt(deck.length - 1); // Each iteration of the for loop generates a random number in the range of the indices of the array deck
            String temp = deck [0]; // Temporarily holds the value of deck [0]
            deck [0] = deck [x]; // Sets the value of the deck at the index of the random number to the first index of the array deck
            deck [x] = temp; // Puts the value at deck [0] back to deck at the index of the random number
        } System.out.println("Shuffled deck of cards: ");
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck [i] + " ");// Uses a for loop to increment through the indices of the array deck to print each value in the array
        } System.out.println();
        System.out.println();

        boolean loopCont = true; // Loop will continue until value is not true, do-while

        do {
            for (int i = 0; i < 5; i++) {
                hand1 [i] = deck [i + index]; // Sets the array hand1 to the first 5 values after the stored index value
                hand2 [i] = deck [i + index + 5]; // Sets the array hand2 to the second 5 values after the stored index value
            } index += 10; // Stores the index value

            System.out.print("Hand 1: ");
            for (int i = 0; i < hand1.length; i++) {
                System.out.print(hand1[i] + " ");
            } System.out.println();
            System.out.print("Hand 2: ");
            for (int i = 0; i < hand2.length; i++) {
                System.out.print(hand2[i] + " ");
            } System.out.println();
            
            hand1Value = 0; // Resets hand 1's value
            hand2Value = 0; // Resets hand 2's value

            for (int i = 0; i < 5; i++) {
                if (hand1[i].contains("A")) { // Checks each value in the array hand1 if it contains the letter A (Ace)
                    hand1Value += 11; // Adds 11 to hand1's value
                } else if (hand1[i].contains("K") || hand1[i].contains("Q") || hand1[i].contains("J") || hand1[i].contains("1")) { // Checks each value in the array hand1 if it contains the letters K, Q, J, or 1 (King, Queen, Jack, Ten)
                    hand1Value += 10; // Adds 10 to hand1's value
                } if (hand2[i].contains("A")) { // Checks each value in the array hand2 if it contains the letter A (Ace)
                    hand2Value += 11; // Adds 11 to hand2's value
                } else if (hand2[i].contains("K") || hand2[i].contains("Q") || hand2[i].contains("J") || hand2[i].contains("1")) { // Checks each value in the array hand2 if it contains the letters K, Q, J, or 1 (King, Queen, Jack, Ten)
                    hand2Value += 10;// Adds 10 to hand2's value
                } for (int j = 2; j <= 9; j++){
                    if (hand1[i].contains(Integer.toString(j))) { // Checks each value in the array hand2 if it contains the int j, j increments from 2 to 9 inclusive
                        hand1Value += j; // Adds the value of j to hand 1's value
                    } if (hand2[i].contains(Integer.toString(j))) { // Checks each value in the array hand2 if it contains the int j, j increments from 2 to 9 inclusive
                        hand2Value += j; // Adds the value of j to hand 2's value
                    }
                }
            } System.out.println();
            System.out.println("Hand 1 value: " + hand1Value);
            System.out.println("Hand 2 value: " + hand2Value);
    
            if (hand1Value > hand2Value) { // Checks if hand 1's value is greater than hand 2's value
                System.out.println("Hand 1 wins!");
            } else if (hand1Value < hand2Value){ // Checks if hand 2's value is greater than hand 1's value
                System.out.println("Hand 2 wins!"); 
            } else { // If there is a tie
                System.out.println("Tie!?!?");
            } 
            System.out.println();

            if (index > 42) { // Checks if there are not enough cards for another round
                loopCont = false; // Ends the do-while loop
                System.out.println("No more cards left to deal.");
            } 
            else { 
                System.out.println("Do you want to play again? (Y/N)");
                String choice = scan.next();
                while (!(choice.equals("Yes")||choice.equals("No"))) { // Checks if the input is equal to one of the choices
                    System.out.println("Not a valid choice. Please answer Yes or No.");
                    choice = scan.next();
                } if (choice.equals("No")) {
                    loopCont = false; // Ends the do-while loop
                    System.out.println("Bye!");
                } 
            }
        } while (loopCont); // Does loop until loopCont is false

        scan.close();
    }
}