package Week11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAlgos {
    public static void main(String[] args) {
        System.out.println("What size 1d array would you like?");
        Scanner scnr = new Scanner(System.in);
        int size = scnr.nextInt();

        int[] arrayToPlay = randomArray(size);
        System.out.println("Original Array: \n"+Arrays.toString(arrayToPlay));
        System.out.println("List in Ascending Order");
        ascendArray(arrayToPlay);
        System.out.println(Arrays.toString(arrayToPlay));

        System.out.println("What number would you like to search for?");
        int key = scnr.nextInt();
        int index = linearSearch(arrayToPlay, key);
        if (index != -1) {
            System.out.println("Your key was found at index " + index);
        } else {
            System.out.println("Your key was not found"); 
        }

        System.out.println("List in Descending Order");
        descendArray(arrayToPlay);
        System.out.println(Arrays.toString(arrayToPlay));

        System.out.println("Performing a binary search on your sorted array.");
        index = binarySearch1d(arrayToPlay, key);
        if (index != -1) {
            System.out.println("Your key was found at index " + index);
        } else {
            System.out.println("Your key was not found"); 
        }

        System.out.println("Enter the number of rows in your 2D array: ");
        int rows = scnr.nextInt();
        System.out.println("Enter the number of columns in your 2D array: ");
        int cols = scnr.nextInt();
        int[][] randomArray2dim = randomArray(rows, cols);
        System.out.println(Arrays.toString(randomArray2dim));
        System.out.println(Arrays.deepToString(randomArray2dim));
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(randomArray2dim[i])); 
        }

        System.out.println("Enter a number to search for in your 2D array: ");
        key = scnr.nextInt();
        int[] indexArray = linearSearch(randomArray2dim, key);
        if (indexArray[0] != -1) {
             System.out.println("Key found @ row " + indexArray[0] + ", col " + indexArray[1]);
        } else {
            System.out.println("Your key was not found");
        }

        scnr.close();
    } 
    public static int[] randomArray(int arrayLength){
        int [] randomArray= new int [arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomArray [i] = (int)(Math.random()*arrayLength);
        } return randomArray;
    }
    public static int[][] randomArray(int rows, int cols){
        int [][] randomArray= new int [rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j ++) {
                randomArray [i] [j] = (int)(Math.random()*rows*cols);
            }
        } return randomArray;
    }
    public static void ascendArray(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = i;
            while (key > 0 && list [key] < list [key - 1]) {
                int temp = list [key];
                list [key] = list [key - 1];
                list [key - 1] = temp;
                key--;
            } 
        }
    }
    public static void descendArray (int[]list){
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) { // j is the key checked for the insertion sort
                if (list [j] > list [j - 1]) {
                    int temp = list [j];
                    list [j] = list [j - 1];
                    list [j - 1] = temp;
                }
            }
        }
    }
    public static int linearSearch(int[] list, int key){
        int index = -1;
        int comparisons = 0;
        for (int i = 0; i < list.length; i++) {
            comparisons += 1;
            if (key == list [i]) {
                index = i;
                break;
            }
        } System.out.println("Comparisons: " + comparisons); 
        return index;
    }
    public static int[] linearSearch(int[][] searchArray2d, int key){
        int [] array = {-1,-1};
        for (int i = 0; i < searchArray2d.length; i++) {
            for (int j = 0; j < searchArray2d[i].length; j++) {
                if (searchArray2d[i][j] == key) {
                    array [0] = i + 1; // Index is 1 less then row number
                    array [1] = j + 1; // Index is 1 less then column number
                    break;
                } 
            }
        }
        return array;
    }
    public static int binarySearch1d(int[] list, int key){
        ascendArray(list); // necessary for binary search
        int min = 0;
        int max = list.length - 1;
        int index = -1;
        int comparisons = 0;
        while (max >= min) {
            int mid = (min + max) / 2; // Uses integer division to set the mid index to the midpoint between min and max
            if (list[mid] < key) {
                min = mid + 1; 
                comparisons += 1;
            } else if (list[mid] > key) {
                max = mid - 1; 
                comparisons += 1;
            } else {
                index = mid;
                comparisons += 1;
                break; // Ends while loop
            }
        } System.out.println("Comparisons: " + comparisons); 
        return index;
    }

 
}
