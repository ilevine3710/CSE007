package Week9;
/*Isaac Levine
 * 10/14
 * CSE007 Fall 2022: Lab 8
 * The purpose of this program is to generate a random array of scores with a length inputted by the user, and allow the user to search for scores using a specific score, or a letter grade for a range of scores
 */

import java.util.Random;
import java.util.Scanner; 

public class RandomGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();

        boolean isValid = false;
        int students = 0;
        String junk = "";
        System.out.println("Enter the class size: ");
        do {
            while (!scan.hasNextInt()) { // Check if the input is an int
            junk = scan.next();
                System.out.println("Invalid data type. Please enter an integer."); 
            } students = scan.nextInt();
            if (students >= 5 && students <= 150){ // Checks if the rating is in the correct range
                isValid = true; // Ends do-while loop
                junk = scan.nextLine(); // Gets rid of space after Int is scanned in.
            } else {
                System.out.println("Invalid range. Please enter an integer between 10-150."); 
            }
        } while (!isValid); // Continues loop until correct value is entered
        System.out.println();

        int [] random =  new int [students];
        for (int i = 0; i < random.length; i++) {
            int x = rand.nextInt(100); // Creates random integer between 0-100
            random [i] = x;
        } 
        System.out.println("Unsorted array: ");
        for (int i : random) {
            System.out.print(i+ " ");
        }

        for (int i = 0; i < random.length; i++) { // I chose a version of the selection sorting algorithm as it was easier for me to understand how it works so I could create it more easily
            for (int j = 0; j < i; j++) {
                if (random [i] > random [j]) { // Checks if the value at the index i is greater than the value at index j, so they can be swapped
                    int temp = random [i]; // Swaps these values if the if statement is true
                    random [i] = random [j];
                    random [j] = temp;
                }
            }
        } System.out.println();

        System.out.println("Sorted array: ");
        int sum = 0;
        for (int i : random) {
            System.out.print(i+ " ");
            sum += i; // Adds each value of the array random to the sum
        } System.out.println(); 
        System.out.println(sum);

        double avg = 1.0 * sum / (random.length - 1); // Averages the scores
        System.out.printf("Average Score: %.3f %n", avg); // Rounds the score to 3 decimal places

        System.out.println("Enter a score/grade to search for: ");
        isValid = false;
        char grade = ' ';
        int score = -1;
        
        boolean scoreCheck = false;
        int scoreMin = 0;
        int scoreMax = 100;
    
        do {
            if (!scan.hasNextInt()) { // Checks if the entry isn't an integer
                junk = scan.next();
                if (junk.length() != 1) {  // Checks if a char wasn't entered
                    System.out.println("Invalid entry. Enter a correct letter grade or score.");
                } else {
                    grade = junk.charAt(0);
                    switch (grade) { // Switch statement for each grade score range
                        case ('A'): scoreMin = 90; isValid = true; break;
                        case ('B'): scoreMin = 80; scoreMax = 89; isValid = true; break;
                        case ('C'): scoreMin = 70; scoreMax = 79; isValid = true; break;
                        case ('D'): scoreMin = 60; scoreMax = 69; isValid = true; break;
                        case ('F'): scoreMax = 59; isValid = true; break;
                        default: System.out.println("Invalid grade. Enter a correct letter grade."); // If the entry doesn't match a real grade
                    }
                    junk = scan.nextLine();
                }
            } else { // If entry is an Int
                score = scan.nextInt();
                if (score >= 0 && score <= 100) { // Checks if the score entered is in the correct range
                    scoreCheck = true; // boolean for if a score was entered 
                    isValid = true; // Ends do-while loop
                    junk = scan.nextLine();
                } else {
                    System.out.println("Invalid score. Enter a score from 0 to 100.");
                }
            }
        } while (!isValid);

        boolean found = false;
        int comp = 0; // Number of comparisons
        int index = 0; // Index for binary comparisons of scores
        int range = 0; // How many scores are in the grade range
        if (scoreCheck) { // If a score was entered
            int min = 0;
            int max = random.length - 1;
            while (max >= min) {
                int mid = (min + max) / 2; 
                if (random[mid] > score) {
                    min = mid + 1; 
                    comp += 1;
                } else if (random[mid] < score) {
                    max = mid - 1; 
                    comp += 1;
                } else {
                    comp += 1; 
                    index = mid; //  The index at which it was found
                    found = true; // If the score was found in the array
                    break; // Ends while loop
                }
            } if (found) { // If the search algorithm found the score entered
                System.out.println("The score " + score + " was found at an index of " + index);
                System.out.println("It took " + comp + " comparisons to find this grade");
            } else { 
                System.out.println("The score " + score + " was not found in the array of scores.");
            }
        } else { // If a grade was entered
            for (int i : random) {
                if (i >= scoreMin && i <= scoreMax) { // Checks if the score is in the range of the grade
                    range += 1; // Adds one to the range value if the score is in the range of the grade
                }
            } if (range != 0) { // If there are 1 or more scores in the grade range
                System.out.println("There are " + range + " grades in the " + grade + " range.");
            } else { // If no grades were found in that range
                System.out.println("There were no scores in the " + grade + " range.");
            }
        }
        
        scan.close();
    }
}