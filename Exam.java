
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter Player 1's name: ");
        String player1 = scan.next();
        System.out.println("Enter Player 2's name: ");
        String player2 = scan.next();

        boolean isValidInt = false;
        int rounds = 0;
        String junk = "";
        junk = junk + " ";
        System.out.println("Enter the number of rounds that will be played: ");
        do {
            if (!scan.hasNextInt()) { // Checks if the scanner detects anything but an integer
                System.out.println("Please enter a positive integer");
                junk = scan.next();
            } else {
                rounds = scan.nextInt();
                if (rounds <= 0) { // Checks if the number inputted is less than or equal 0
                    System.out.println("Please enter a positive integer");
                } else {
                    isValidInt = true; // Ends the do-while loop
                }
            }
        } while (!isValidInt); // Loop reiterates until the isValidInt boolean is true

        System.out.println(player1 + " vs " + player2 + " for " + rounds + " rounds");
        System.out.println();

        int choice1 = 0;
        int choice2 = 0;
        int wins1 = 0;
        int wins2 = 0;
        String result1 = "";
        String result2 = "";
        String winner = "";
        String loser = "";
        loser = loser + " ";
      
        do {
            choice1 = (int) ((Math.random() * 3));
            choice2 = (int) ((Math.random() * 3));
            boolean tie = false;
            switch (choice1) {
                case (0): // Player 1 has Rock
                    switch (choice2) {
                        case (0): // Player 2 has Rock
                            tie = true; // Tie = Round not counted
                            break;
                        case (1): // Player 2 has Paper
                            winner = player2;
                            loser = player1;
                            rounds -= 1; 
                            wins2 += 1;
                            break; 
                        case (2): // Player 2 has Scissors
                            winner = player1;
                            loser = player2;
                            rounds -= 1; 
                            wins1 += 1;
                            break;
                        default:
                            break;
                    }
                    break;
                case (1): // Player 1 has Paper
                    switch (choice2) {
                        case (0): // Player 2 has Rock
                            winner = player1;
                            loser = player2; 
                            wins1 += 1;
                            rounds -= 1; 
                            break;
                        case (1): // Player 2 has Paper
                            tie = true; // Tie = Round not counted
                            break;
                        case (2): // Player 2 has Scissors
                            winner = player2;
                            loser = player1;
                            rounds -= 1;  
                            wins2 += 1;
                            break;
                        default:
                            break;
                    }
                    break;
                case (2): // Player 1 has Scissors
                    switch (choice2) {
                        case (0): // Player 2 has Rock
                            winner = player2;
                            loser = player1;
                            rounds -= 1; 
                            wins2 += 1;
                            break;
                        case (1): // Player 2 has Paper
                            winner = player1;
                            loser = player2;
                            rounds -= 1; 
                            wins1 += 1;
                            break;
                        case (2): // Player 2 has Scissors
                            tie = true; // Tie = Round not counted
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
                }
                if (!tie) { // If there is not a tie
                    if (choice1 == 0) { // Assigns a string of the choice (rock, paper, or scissors) due to the random number for player 1
                        result1 = "Rock";
                    } else if (choice1 == 1) {
                        result1 = "Paper";
                    } else if (choice1 == 2) {
                        result1 = "Scissors";
                    } if (choice2 == 0) { // Assigns a string of the choice (rock, paper, or scissors) due to the random number for player 2
                        result2 = "Rock";
                    } else if (choice2 == 1) {
                        result2 = "Paper";
                    } else if (choice2 == 2) {
                        result2 = "Scissors";
                    } System.out.println(player1 + " chose " + result1 + " and " + player2 + " chose " + result2 + ". The winner is " + winner + "!");
                } else { // If there is a tie
                    System.out.println("Tie! This round does't count.");
                }
            } while (rounds > 0);
            System.out.println("Total wins for " + player1 + ": " + wins1); // Prints total wins for player 1
            System.out.println("Total wins for " + player2 + ": " + wins2); // Prints total wins for player 2

        scan.close();
}
}
