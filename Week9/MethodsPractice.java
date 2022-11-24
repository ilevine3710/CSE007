package Week9;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class MethodsPractice {
    public static char generateChar () {
        Random rand = new Random();
        Math.random();
        char x = (char)('A' + rand.nextInt(26));
        return x;
    } 
    public static char compareChars(char x, char y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    } 
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        char i = generateChar();
        char j = generateChar();
        System.out.println("Char 1: " + i);
        System.out.println("Char 2: " + j);
        System.out.println("Which char is larger?");

        char guess = scan.next().charAt(0);
        if (guess == compareChars(i, j)) {
            System.out.println("Correct :)");
        } else {
            System.out.println("Incorrect :(");
        }
        scan.close();
    }

}
