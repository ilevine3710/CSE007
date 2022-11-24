package Week4;
/*Isaac Levine
 * 10/7
 * CSE007 Fall 2022: HW 5
 * The purpose of this program is to count the number of times all capital letters appear in an inputted word or phrase. 
 */

import java.util.Scanner; 

public class CharCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a word or phrase: ");
        String input = scan.nextLine(); // Inputs the entire line
        int index = 0;
        char [] message = new char [input.length()]; // Creates new array with a length of the length of the inputted word or phrase
        char [] alphabet = new char [26];
        int [] count = new int [26];
        
        for (int i = 0; i < message.length; i++) {
            message [i] = (input.charAt(i)); // Initializes the array message so that the array at index i is the char at i of the inputted word or phrase 
        } for (char i = 'A'; i <= 'Z'; i++) { // Increments the char from A to Z
            alphabet [index] = i; 
            index += 1; // Increments index
        }
        for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < alphabet.length; j++){
                if (message [i] == alphabet [j]) { // Checks for each char in message if it equals a char in alphabet
                    count [j] += 1; // Adds one to the count array for that specific alphabet index
                }
            }
        }
        for (int i = 0; i < alphabet.length; i++) {
            int j = i;
            while (j > 0 && count [j] > count [j - 1]) { // Checks if the count in an index is larger than the count in the index before
                int temp = count [j]; // Swaps the values of count at indices j and j - 1
                count [j] = count [j - 1];
                count [j - 1] = temp;
                char tempChar = alphabet [j]; // Swaps the values of alphabet at indices j and j - 1
                alphabet [j] = alphabet [j - 1];
                alphabet [j - 1] = tempChar;
                j -= 1; // Decrements j
            } 
        } int unique = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (count [i] > 0 ) { // Checks if the letter is present in the message
                System.out.println("The letter " + alphabet [i] + " appears " + count [i] +" time(s).");
                unique += 1; // Increments unique for each value of count greater than 1
            } else {
                break;
            }
        } System.out.println("Number of unique letters: " +  unique);
        
        scan.close();
    }
}
