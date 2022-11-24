import java.util.Scanner;
public class Exam2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the dimension of a 1D array");
        int length = getInt(s);
        System.out.println("Enter two dimensions -- row and col for the 2D array");
        int row = getInt(s);
        int col = getInt(s);
        String[] words = new String[length];
        String[][] moreWords = new String[row][col];

        fillArray(words);
        fillArray(moreWords);

        System.out.println("Words: "); 
        printArray(words);
        System.out.println("Lots of Words: "); 
        printArray(moreWords);

        sortArray(words);
        System.out.println("Sorted Words: "); 
        printArray(words);

        searchArray(words, "EXAM2!");
        searchArray(words, words[0]);

        System.out.println("Lots of Words (Again): "); 
        printArray(moreWords);

        sortArray(moreWords[0]);
        System.out.println("Lots of Words, Sorted first row: ");
        printArray(moreWords);

        reverseArrays(moreWords);
        System.out.println("Lots of Words Reversed: ");
        printArray(moreWords);

        searchArray(moreWords, "TESTINGSEARCH");
        searchArray(moreWords, moreWords[row-1][col-1]); 
        
        s.close();
    }
    public static int getInt(Scanner keys){
        int num = 0;
        boolean loopControl = true;
        do{
            if(keys.hasNextInt()){
                num = keys.nextInt();
                if(num >=5 && num <=95){
                    loopControl = false;
                } else {
                    System.out.println("Out of range -- 5:95");
                }
            } else {
                System.out.println("not an int");
                keys.nextLine();
            }
        } while (loopControl);
        return num;
    }
    public static char generateChar(){
        char chr1 = (char)((Math.random() * 26) + 'A'); // A-Z
        char chr2 = (char)((Math.random() * 26) + 'a'); // a-z
        char chr3 = (char)((Math.random() * 10) + '0'); // 0-9 
        int rand = (int)(Math.random() * 3); 
        if (rand == 0) {
            return chr1;
        } else if (rand == 1) {
            return chr2;
        } else {
            return chr3;
        }
    }
    public static void fillArray(String[] list){
        for (int i = 0; i < list.length; i++) {
            list[i] = ""; // Removes null value of list[i]
            for (int j = 0; j < 10; j++) {
                list [i] += generateChar(); // Adds random char
            }
        }
    }
    public static void fillArray(String[][]list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list [i][j] = "";// Removes null value of list[i]
                for (int k = 0; k < 10; k++) {
                    list [i][j] += generateChar();// Adds random char
                }
            }
        }
    }
    public static void printArray(String[] list){
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }System.out.println();
        System.out.println();
    }
    public static void printArray(String[][]list){
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            } System.out.println();
        }System.out.println();
    }
    public static void sortArray(String[]list){ // This is an Insertion sort algorithm. Starting at the second index, this algorithm checks if the value at this index below it is less then it. If so, it swaps the values at the indices. Then the index checks decrements to one, then starts again at index 2, until it reaches the final index of the program.
        for (int i = 0; i < list.length; i++) { 
            int j = i;
            while (j > 0 && list [j].compareTo(list [j - 1]) < 0) {
                String temp = list [j];
                list [j] = list [j - 1];
                list [j - 1] = temp;
                j -= 1; 
            } 
        }
    }
    public static void reverseArrays(String[][]list){
        for (int i = 0; i < list.length; i++)
            for (int j = 0; j < list[i].length / 2; j++) { // Swaps values at indices the same distance away from the first and last indices
                String temp = list[i][j];
                list [i][j] = list [i][list[i].length - 1 - j];
                list [i][list[i].length - 1 - j] = temp;
            }
    }
    public static void searchArray(String[]list, String key){ // Binary search requires that an array must be sorted in order as it uses the midpoints of the min and the max values of an array, and adjusts the min and max accordingly based on if the String is smaller or larger than the mid value
        sortArray(list);
        int comparisons = 0;
        boolean found = false;
        int index = -1;
        int min = 0;
        int max = list.length - 1;
        while (max >= min) {
            int mid = (min + max) / 2;
            if (list[mid].compareTo(key) < 0) { // key is greater than the mid value
                min = mid + 1; 
                comparisons += 1;
            } else if (list[mid].compareTo(key) > 0) {// key is less than the mid value
                max = mid - 1;
                comparisons += 1;
            } else {
                index = mid; 
                comparisons += 1; 
                found = true;
                break;
            }
        } System.out.println("Comparisons: " + comparisons);
        if (found) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("The key was not found in the array");
        }

    }
    public static void searchArray(String[][]list, String key){
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list [i][j].equals(key)) {
                    System.out.println("The key was found at index [" + i + "] [" + j +"]");
                    found = true;
                    break;
                } 
            }
        } if (!found) {
            System.out.println("The key was not found in the array");
        }
    }
}