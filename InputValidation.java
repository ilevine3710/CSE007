import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        boolean isValid = false;
        int x = 0;
        String junk = "";
        junk = junk + 1;
        do {
            while (!scan.hasNextInt()) { 
            junk = scan.next();
                System.out.println("");
            } x = scan.nextInt();
            if (x >= 1 && x <= 9){ 
                isValid = true;
                junk = scan.nextLine();
            } else {
                System.out.println("");
                isValid = false; 
            }
        } while (!isValid);

        scan.close();
    }
}
