package Week7;
/*Isaac Levine
 * 10/3
 * CSE007 Fall 2022: Participation 7
 * The purpose of this program is to generate a random 10 length array with numbers from 1 - 20 and use a for each loop to find the min, max and average
 */

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] array = new int[10];
        double sum = 0;
        int min = 20;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            array [i] = (int) ((Math.random() * 20) + 1);
        }
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
            sum += i;
            if (i > max) {
                max = i;
            } if (i < min) {
                min = i;
            }
        } System.out.println();
        double average = Math.round(10 * sum / array.length) / 10;
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        scan.close();
    }
}