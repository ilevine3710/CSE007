package Week10;
import java.util.Scanner;
import java.util.Arrays;

public class MultiAverage{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dimension = getDimension(scan);
        int length = getLength(scan);

        switch(dimension){
            case 1: 
                int[]arrI = new int[length];
                fillArray(arrI);
                System.out.println(Arrays.toString(arrI));
                System.out.println("The average of the above numbers is: "+ findAverage(arrI));
                break;
            case 2: 
                System.out.println("Enter a second dimension");
                int elLength = getLength(scan);
                int arr2D [][] = new int[length][elLength]; 
                fillArray(arr2D);           
                System.out.println(Arrays.toString(arr2D));
                System.out.println(Arrays.deepToString(arr2D));
                System.out.println("The average of the above numbers is: "+ findAverage(arr2D));    
                break;
        }
        scan.close();
    }
    public static int getInt(Scanner scan){
        int num = 0;
        boolean loopControl = true;
        do{
            if(scan.hasNextInt()){
                num = scan.nextInt();
                loopControl = false;
            } else {
                System.out.println("not an int");
                scan.nextLine();
            }
        } while (loopControl);
        return num;
    }
    public static int getLength(Scanner scan){
        System.out.println("Enter the length of the array");
        boolean isValid = false;
        int length = 0;
        String junk = "";
        junk = junk + 1;
        do {
            while (!scan.hasNextInt()) { // Check if the input is an int
            junk = scan.next();
                System.out.println("Invalid length. Enter an integer for the length of the array.");
            } length = scan.nextInt();
            if (length >= 2 && length <= 25){ 
                isValid = true; // Ends do-while loop
                junk = scan.nextLine(); // Gets rid of space after Int is scanned in.
            } else {
                System.out.println("Invalid length. Enter an integer 2-25 for the length of the array");
                isValid = false; // Continues do-while loop
            }
        } while (!isValid);
        return length; 
    }
    public static int getDimension(Scanner scan){
        System.out.println("Enter the dimensions of the array");
        boolean isValid = false;
        int dimension = 0;
        String junk = "";
        junk = junk + 1;
        do {
            while (!scan.hasNextInt()) { // Check if the input is an int
            junk = scan.next();
                System.out.println("Invalid dimension. Enter an integer for the dimension of the array.");
            } dimension = scan.nextInt();
            if (dimension >= 1 && dimension <= 2){ 
                isValid = true; // Ends do-while loop
                junk = scan.nextLine(); // Gets rid of space after Int is scanned in.
            } else {
                System.out.println("Invalid dimension. Enter 1 or 2 for a 1 dimensional array or 2 dimensional array");
                isValid = false; // Continues do-while loop
            }
        } while (!isValid);
        return dimension; 
    }
    public static void fillArray(int[]list){
        for(int i = 0; i<list.length; i++){
            int ran = (int)(Math.random()*100)+1;
            list[i] = ran;
        }
    }
    public static void fillArray(int[][]list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                int ran = (int)(Math.random()*100)+1;
                list[i][j] = ran;
            }
        }
    }
    public static double findAverage(int[]list){
        double avg, sum=0;
        for(int i = 0; i<list.length; i++){
            sum += list[i];
        }
        avg = sum / list.length;
        return avg;
    }
    public static double findAverage(int[][]list){
        double avg = 0;
        double sum = 0;
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                sum += list[i][j];
                count +=1;
            }
        }
        avg = sum / count;
        return avg;
    }
}