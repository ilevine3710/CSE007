package Week5;
/*Isaac Levine
 * 9/17
 * CSE007 Fall 2022: Lab 4 
 * The purpose of this program is to check whether or not the string or integer the user has inputted is the same forward or in reverse, i.e. if it is a Palindrome 
 */
import java.util.Scanner; 

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numPal = 0; //if the user types an int this will hold the value
        String strPal = ""; //if the user types a string this will hold the value
        boolean isNum = false; //turn true if user types an int
        boolean isPal = false; //turn true if the string is a palindrome

        System.out.println("Enter a word/phrase/number to check if it is a palindrome: ");
        if (scan.hasNextInt()){ //Check is the scanned statement has an integer            
                numPal = scan.nextInt();
                isNum = true;
                while (numPal < 11 || numPal > 100000) { //Check if number is in the specified range
                    System.out.println("The number you entered is not in the specified range. Please enter a number between 11 and 100,000");
                    numPal = scan.nextInt();
                }
        } else {
            strPal = scan.nextLine();
        }

        if (isNum) { //Checks numPal to see if it is a palindrome
            int reverse = 0;
            int temp = numPal;
            while (temp != 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp/=10;
            } if (reverse != numPal) {
                isPal = false;
            } else {
                isPal = true;
            }

        } else { // Checks strPal to see if it is a palindrome
            String temp = strPal.replace(" ","");
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) != temp.charAt(temp.length()-1-i)) { //Check each character at a position i in temp is the same if temp is reverse
                    isPal = false;
                    break;
                } else {
                    isPal = true;
                }
            }
        }

        if (isPal && isNum) {
            System.out.println("Result: This int is a palindrome");
        } else if (isPal && !isNum) {
            System.out.println("Result: This string is a palindrome");
        } else if (!isPal && isNum) {
            System.out.println("Result: This int is not a palindrome");
        } else if (!isPal && !isNum) {
            System.out.println("Result: This string is not a palindrome");
        }

        scan.close();
    }
}
