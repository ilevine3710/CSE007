package Week4;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0; // The running total
        int count = 0; // The number of ints successfully read in

        while (count < 5) {
            int temp;
            boolean loopNeeded = true; // if the looped is need

            do {
                System.out.println("Enter an integer");
                if (scan.hasNextInt()){ // if the scanner detects an integer
                    temp = scan.nextInt();
                    loopNeeded = false; // cancels the loop
                    sum += temp;
                    count+=1;
                } else {
                    String junk = scan.next();
                    junk = junk + 1;
                }
            } while (loopNeeded);
        }
        System.out.println("The average is: " + (sum / 5));
        scan.close();
    }
}
