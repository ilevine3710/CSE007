package Week2;

/*Isaac Levine
 * 10/17
 * CSE007 Fall 2022: Participation 9
 * The purpose of this program is to return the largest of three number.
 */

import java.util.Scanner;

public class LargestNum {
   public static int largest(int a, int b, int c) {
      int large = 0;
      if (a > b && a > c) {
         large = a;
      } if (b > a && b > c) {
         large = b;
      } else {
         large = c;
      }
      System.out.print("The largest number: " + large);
      return large;
   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      
      largest(a, b, c);

      scan.close();
   }
}