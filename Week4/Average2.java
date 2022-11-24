package Week4;

/*Isaac Levine
 * 9/12
 * CSE007 Fall 2022: Participation Week 4 
 * The purpose of this program is to print the average of a set number of integers. The user controls how many integers are entered and what those integers are
 */
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0; // The running total
        int count = 0; // The number of ints successfully read in
        int countNums = 0;

        do { // Loops until countNums is a positive integer
            System.out.println("Enter the number of integers that will be averaged");
            if (scan.hasNextInt()) {
                countNums = scan.nextInt();
            } else{
                String junk = scan.next(); // Creates a junk string to put the wrong inputs into
                junk = junk + 1;
            }
        } while(countNums<=0);

        while (count < countNums) {
            int temp;
            boolean loopNeeded = true;

            do {
                System.out.println("Enter an integer");
                if (scan.hasNextInt()){ 
                    temp = scan.nextInt();
                    loopNeeded = false;
                    sum += temp;
                    count+=1;
                } else {
                    String junk = scan.next();
                    junk = junk + 1;
                }
            } while (loopNeeded);
        }
        System.out.println("The average is: " + (sum / countNums));
        scan.close();
    }
}
