package Week10;
/*Isaac Levine
 * 10/24/2022
 * CSE007 Fall 2022: HW 6
 * The purpose of this program is to play the game tic-tac-toe
 */

import java.util.Scanner; 

public class TicTacToe {
    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);
        Boolean player = true; // True if player 1's turn, false is player 2's turn
        String [][] board = {{"1", "2", "3"},
                             {"4", "5", "6"}, 
                             {"7", "8", "9"}};
        for (int i = 0; i < 9; i++) { // 9 spots
            if (player) { // Player 1's turn
                System.out.println("Player 1's turn: ");
            } else {// Player 2's turn
                System.out.println("Player 2's turn: ");
            } printBoard(board); // Prints the board
            eachTurn(scan, board, player); // Does a turn
            player = !player; // Switches player turn, 
            if (!(result(board).equals("Tie"))) { // If the result is win for any player
                break;
            }
        } 
        printBoard(board);
        System.out.println("Result: " + result(board));
        scan.close();
    }
    /* Pre-conditions: Method must have argument of the scanner scan declared in the main, a 2D string array, and a boolean value
     * Post-conditions: Method is void, but alters the 2D array.
     */
    public static void eachTurn (Scanner scan, String [][] board, boolean player) {
        boolean isValid = false;
        String choice;
        do {
            choice = scan.next();
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) { 
                    if (choice.equals(board[i][j]) && !choice.equals("X") && !choice.equals("O")) { // Choice is 1-9 and not X or O
                        isValid = true;
                        if (player) { // Player 1's turn
                            board [i][j] = "X";
                        } else { // Player 2's turn
                            board [i][j] = "O";
                        } break; // Ends for-loop
                    }
                } 
            } if (!isValid) { // If the choice is not Valid
                System.out.println("Invalid choice. Please choose an empty spot on the board");
            }
        } while (!isValid);
    }
    /* Pre-conditions: Method must take a 2D string array as its argument
     * Post-conditions: Method is void, but prints a format of the array
     */
    public static void printBoard(String [][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i][0] + "  |  " + array[i][1] + "  |  " + array[i][2]); // Formatting 
            System.out.println();
            System.out.println("____|_____|____"); 
            System.out.println("    |     |");
        } System.out.println();
    } 
    /* Pre-conditions: Method must take a 2D string array as its argument
     * Post-conditions: Method returns a String, that can either be "Player 1 Wins!", "Player 2 Wins!", or "Tie"
     */
    public static String result (String [][] board) {
        String result = "";
        for (int i = 0; i < board.length; i++) {
            if ((board [0][i].equals(board [1][i]) && board [0][i].equals(board [2][i]) && board [1][i].equals(board [2][i]))) { // 3 in a row in a column
                if (board [0][i].equals("X")) { // X in the column, player 1
                    result = "Player 1 Wins!";
                } else if (board [0][i].equals("0")) { // O in the column, player 2
                    result = "Player 2 Wins!";
                } break;
            } else if ((board [i][0].equals(board [i][1]) && board [i][0].equals(board [i][2]) && board [i][1].equals(board [i][2]))) { // 3 in a row in a row
                if (board [i][0].equals("X")) { // X in the row, player 1
                    result = "Player 1 Wins!";
                } else if (board [i][0].equals("0")) {// 0 in the row, player 2
                    result = "Player 2 Wins!";
                } break;
            } else if ((board [0][0].equals(board [1][1]) && board [0][0].equals(board [2][2]) && board [1][1].equals(board [2][2])) || // 3 in a row in the diagonals
                       (board [0][2].equals(board [1][1]) && board [0][2].equals(board [2][0]) && board [1][1].equals(board [2][0]))) {
                if (board [1][1].equals("X")) {// X in the middle, player 1
                    result = "Player 1 Wins!";
                } else if (board [1][1].equals("0")) {// 0 in the middle, player 2
                    result = "Player 2 Wins!";
                } break;
            } else { // No 3 in a rows
                result = "Tie";
            }
        }
        return result;
    }
}