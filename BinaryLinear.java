import java.util.Arrays;

public class BinaryLinear {
    public static void Binary (int [] array, int choice) {
        int comparisons = 0;
        int index = -1;
        Arrays.sort(array); 
        int min = 0;
        int max = array.length - 1;
        while (max >= min) {
            int mid = (min + max) / 2;
            if (array[mid] < choice) {
                min = mid + 1; 
                comparisons += 1;
            } else if (array[mid] > choice) {
                max = mid - 1;
                comparisons += 1;
            } else {
                index = mid; 
                comparisons += 1; 
                break;
            }
        } System.out.println("Comparisons: " + comparisons);
        System.out.println("Index: " + index);
    } public static void Linear (int [] array, int choice) {
        int comparisons = 0;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            comparisons++;
            if (choice == array[i]) {
                index = i;
                break;
            } 
        } System.out.println("Comparisons: " + comparisons);
        System.out.println("Index: " + index);
    }
}
