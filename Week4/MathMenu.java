package Week4;
/*Isaac Levine
 * 9/12
 * CSE007 Fall 2022: HW 2
 * The purpose of this program is to test the users ability to solve addition, subtraction, multiplication, and division problems using numbers 1-9.
*/
import java.util.Scanner;

public class MathMenu {
    public static void main(String[] args) {
        // Creates statements to prompt user to input
        System.out.println("Welcome to the Math Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice: ");

        // Allows user to input their choice
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice != 1 && choice != 2 && choice != 3 && choice != 4){ //Checks if the number entered is not equal to any of the valid choices
            System.out.println("ERROR. This is not a valid choice. Please restart the program and enter a valid choice.");
            System.exit(0); // End the program
        }
        switch(choice) { // The switch and case statements allows different programs to run for different choices
            case(1):
                int num1 = (int)(Math.random() * 9 + 1); // Creates integer for the first value, a random number between 1 and 9
                int num2 = (int)(Math.random() * 9 + 1);// Creates integer for the second value, a random number between 1 and 9
                System.out.println("Solve the following addition problem: " + num1 + " + " + num2 +" = ?"); // Prints a statement to prompt user to enter the solution to the equation
                int solution = scan.nextInt(); // Creates input for the user
                while (solution != num1 + num2){ // Creates a loop to prompt the user to solve the equation until the solution is correct
                    System.out.println("Incorrect. Try again:");
                    solution = scan.nextInt(); // Creates input for the user to try again
                }
                System.out.println("Correct!");
                break;
            case(2):
                // Repeats case 1 but for subtraction by swapping out + for -
                num1 = (int)(Math.random() * 9 + 1);
                num2 = (int)(Math.random() * 9 + 1);
                System.out.println("Solve the following subtraction problem: " + num1 + " - " + num2 +" = ?");
                solution = scan.nextInt();
                while (solution != num1 - num2){ 
                    System.out.println("Incorrect. Try again:");
                    solution = scan.nextInt();
                }
                System.out.println("Correct!");
                break;
            case(3): // Repeats case 1 but for multiplication by swapping out + for *
                num1 = (int)(Math.random() * 9 + 1);
                num2 = (int)(Math.random() * 9 + 1);
                System.out.println("Solve the following multiplication problem: " + num1 + " * " + num2 +" = ?");
                solution = scan.nextInt();
                while (solution != num1 * num2){
                    System.out.println("Incorrect. Try again:");
                    solution = scan.nextInt();
                }
                System.out.println("Correct!");
                break;
            case(4): // Repeats case 1 but for division by swapping out + for /
                num1 = (int)(Math.random() * 9 + 1);
                num2 = (int)(Math.random() * 9 + 1);
                System.out.println("Solve the following division problem (Round to 2 decimal places): " + num1 + " / " + num2 +" = ?");
                Double solutionD = scan.nextDouble(); // Creates different variable for solution as it will be a double
                while ((solutionD * 100) != Math.round(((1.0 * num1 / num2) * 100))) { // Check if the solution is correct when rounded to 2 decimal places
                    System.out.println("Incorrect. Try again:");
                    solutionD = scan.nextDouble();
                }
                System.out.println("Correct!");
                break;
            default:
                break;
        }
        // Closes the scanner
        scan.close();
    }
}