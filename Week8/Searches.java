package Week8;
/*Isaac Levine
 * 10/7
 * CSE007 Fall 2022: Lab 7
 * The purpose of this program is to use binary and linear search to find a character in an array.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 

public class Searches {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();

        System.out.println("Enter the length of the array: ");
        boolean isValid = false;
        int length = 0;
        String junk = "";
        do {
            while (!scan.hasNextInt()) { // Check if the input is not an int
            junk = scan.next();
                System.out.println("Invalid length. Enter a length for the array (1-10)");
            } length = scan.nextInt();
            if (length >= 10){ // Checks if the rating is in the correct range
                isValid = true; // Ends do-while loop
            } else {
                System.out.println("Invalid length. Enter a length for the array (1-10)");
            }
        } while (!isValid); // Loop continues until a valid length is inputted

        System.out.println("Enter the character you would like to search for: ");
        isValid = false;
        char chr = ' ';
        do {
            while (scan.hasNextInt()) { // Check if the input is an int
                junk = scan.next();
                System.out.println("Invalid input. Please enter a character between A and Z"); 
            } junk = scan.next();
            if (junk.length() == 1){ // Checks if the input length is one char
                chr = junk.charAt(0);
                if (chr >= 'A' && chr <= 'Z') {
                    isValid = true; // Ends do-while loop
                } else {
                    System.out.println("Invalid input. Please enter a character between A and Z");
                }
            } else {
                System.out.println("Invalid input. Please enter a character between A and Z"); 
            }
        } while (!isValid);
        
        char [] random =  new char [length];
        for (int i = 0; i < random.length; i++) {
            chr = (char)(rand.nextInt(25) + 'A');
            random [i] = chr;
        }

        // Liner search 
        int comparisonsLinear = 0;
        int indexLinear = -1;
        boolean found = false; // Boolean for if the char was found in the array
        for (int i = 0; i < random.length; i++) {
            if (chr == random [i]) {
                indexLinear = i;
                comparisonsLinear += 1; 
                found = true; 
                break;
            } else {
                comparisonsLinear += 1; 
            }
        }

        System.out.print("Unsorted array: "); 
        for (char i : random) { // Prints array before it is sorted
            System.out.print(i + " ");
        } System.out.println();
        System.out.println("Comparisons for linear search: " + comparisonsLinear);
        if (found) {// Iterates if the char was  found in the array random
            System.out.println("The index for linear search: " + indexLinear);
        } else { // Iterates if the char was not found in the array random
            System.out.println("The char " + chr + " was not found in the array");
        }

        // Binary Search
        int comparisonsBinary = 0; // Will increment for each comparison
        int indexBinary = -1;
        found = false; // Boolean for if the char was found in the array
        Arrays.sort(random); 
        // Binary search requires that an array must be sorted in order as it uses the midpoints of the min and the max values of an array, and adjusts the min and max accordingly based on if the char is smaller or larger than the mid value
        int min = 0;
        int max = random.length - 1;
        while (max >= min) {
            int mid = (min + max) / 2; // Uses integer division to set the mid index to the midpoint between min and max
            if (random[mid] < chr) {
                min = mid + 1; // If the chr being searched is greater than the mid, the min becomes 1 after the mid
                comparisonsBinary += 1;
            } else if (random[mid] > chr) {
                max = mid - 1; // If the chr being searched is less than the max, the max becomes 1 before the mid
                comparisonsBinary += 1;
            } else {
                indexBinary = mid; // The index of the char was found, so index Binary is set equal to that value
                comparisonsBinary += 1; 
                found = true;
                break; // Ends while loop
            }
        }
        System.out.print("Sorted array: ");
        for (char i : random) { // Prints array after it has been sorted
            System.out.print(i + " ");
        } System.out.println();
        System.out.println("Comparisons for Binary search: " + comparisonsBinary);
        if (found) { // Iterates if the char was found in the array random
            System.out.println("The index for binary search: " + indexBinary);
        } else { // Iterates if the char was not found in the array random
            System.out.println("The char " + chr + " was not found in the array");
        }
        if (comparisonsBinary > comparisonsLinear) { // If linear search method had less comparisons than binary search method
            System.out.println("Linear searching method was more efficient");
        } else if (comparisonsBinary < comparisonsLinear){ // If linear search method had more comparisons than binary search method
            System.out.println("Binary searching method was more efficient");
        } else { // If both search methods had the same number of comparisons
            System.out.println("Both methods were equally efficient");
        } scan.close(); // Closes the scanner
    }
}