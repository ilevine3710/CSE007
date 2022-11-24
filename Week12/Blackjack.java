/*Isaac Levine
 * 11/12/2022
 * CSE007 Fall 2022: HW 7
 * The purpose of this program is use objects to play the game Blackjack.
 */

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String choice = "";
        Deck deck = new Deck ();
        System.out.print("Unshuffled Deck: ");
        deck.print();
        System.out.print("Shuffled Deck: ");
        deck.shuffle();
        deck.print();
        do {
            Hand hand = new Hand (10); 
            hand.addCard(deck.dealCard());
            hand.addCard(deck.dealCard());
            game(hand, deck, scan);
            choice = playAgain(scan);
        } while (!choice.equals("N"));
    } 
    /* Pre-condition: Scanner object in argument
     * Post-condition: Return input validated string (Y or N)
     */
    public static String playAgain(Scanner scan) {
        System.out.println("Would you like to play again? (Y/N)");
        boolean isValid = false;
        String entry = "";
        do { 
            entry = scan.next();
            if (entry.equals("Y") || entry.equals("N")){ 
                isValid = true;
            } else {
                System.out.println("Invalid choice. Please enter Y or N.");
                isValid = false;
            }
        } while (!isValid);
        return entry;
    } 
    /* Pre-condition: Scanner object in argument
     * Post-condition: Return input validated string (Hit or Stand)
     */
    public static String hitOrStand(Scanner scan) {
        System.out.println("Hit or Stand?");
        boolean isValid = false;
        String entry = "";
        do { // Input Validation
            entry = scan.next();
            if (entry.equals("Hit") || entry.equals("Stand")){ 
                isValid = true;
            } else {
                System.out.println("Invalid choice. Please enter Hit or Stand.");
                isValid = false;
            }
        } while (!isValid);
        return entry;
    }
    /* Pre-condition: Hand object in argument
     * Post-condition: Returns string corresponding to the value of the hand
     */
    public static String check(Hand hand) {
        String result = "Loser (could’ve hit)"; // default
        if (hand.getValue() > 21) {
            result = "Loser (Bust)";
        } else if (hand.getValue() == 21) {
            result = "Winner!";
        } return result;
    }
    /* Pre-condition: Hand object, Deck object, and Scanner object in argument
     * Post-condition: Void method, prints out game depending on arguments
     */
     public static void game(Hand hand, Deck deck, Scanner scan) {
        hand.display();
        System.out.println("Current Value: " + hand.getValue());
        while (hand.getValue() < 16) { // Auto - hits until the value 16 is reached
            hand.addCard(deck.dealCard());
            hand.display();
            System.out.println("Current Value: " + hand.getValue());
        }
        if(check(hand).equals("Loser (could’ve hit)")) { // Value less than 21
            if (hitOrStand(scan).equals("Hit")) {
                hand.addCard(deck.dealCard());
                hand.display();
                System.out.println("Current Value: " + hand.getValue());
                while (hand.getValue() < 21) { // If the value of the hand has not gone over or is 21
                    if (hitOrStand(scan).equals("Hit")) {
                        hand.addCard(deck.dealCard());
                        hand.display();
                        System.out.println("Current Value: " + hand.getValue());
                    } else { // User picked stand
                        break;
                    }
                }
                System.out.println("Result: " + check(hand));
            } else { // User picked Stand
                System.out.println("Result: " + check(hand));
            }
        } else { // Either 21 or >21
             System.out.println("Result: " + check(hand));
        } 
    }    
}
