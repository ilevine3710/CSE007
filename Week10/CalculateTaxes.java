package Week10;
/*Isaac Levine
 * 10/21
 * CSE007 Fall 2022: Lab 9
 * The purpose of this program is to calculate the federal taxes owed by from the inputs of the users wage, interest, unemployment compensation, marital status, and taxes withheld
 */

import java.util.Scanner; 

public class CalculateTaxes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your wages, interest, unemployment comp, status, and taxes withheld");
        double wages = getDouble (scan);
        double interest = getDouble (scan);
        double unemployComp = getDouble (scan);
        int status = getInt(scan);
        double withheld = getDouble (scan);
        int AGI = computeAGI (wages, interest, unemployComp, status, withheld);
        int deduction = getDeduction (status);
        int taxable = getTaxable (AGI, deduction);
        int calcTax = calcTax(taxable, status);
        int finalTax = calcTaxDue(calcTax, withheld);
        System.out.printf( "AGI: $%,d\n", AGI); 
        System.out.printf( "Deduction: $%,d\n", deduction);
        System.out.printf( "Taxable Income: $%,d\n", taxable);
        System.out.printf( "Federal Tax: $%,d\n", calcTax);
        System.out.printf( "Tax Due: $%,d\n", finalTax);
        
    }
    public static double getDouble(Scanner scan) {
        boolean isValid = false;
        double x;
        int junkInt = 0;
        String junk = "";
        junk = junk + 1;
        junkInt = junkInt + 1;
        do {
            while (!scan.hasNextDouble()) { // Check if the input is a double
                if (scan.hasNextInt()) {
                    junkInt = scan.nextInt();// Gets rid of int scanned in
                    System.out.println("Not an accepted value. Please enter a double instead of an integer.");
                } else {
                    junk = scan.next(); // Gets rid of string scanned in
                    System.out.println("Not an accepted value. Please enter a number.");
                }
            } x = scan.nextDouble();
            if (x < 0) { // Checks if the double is negative
                System.out.println("Not in the valid range. Enter a number greater than or equal to 0.");
            } else {
                isValid = true;
            }
        } while (!isValid); // Continues until correct value is entered    
        return x;
    } 
    public static int getInt(Scanner scan) {
        boolean isValid = false;
        int x;
        String junk = "";
        junk = junk + 1;
        System.out.println("Enter a number for your status: (0=dependent, 1=single, and 2=married)");
        do {
            while (!scan.hasNextInt()) { // Check if the input is an int
            junk = scan.next();
                System.out.println("Not a status number. (0=dependent, 1=single, and 2=married)");
            } x = scan.nextInt();
            if (x >= 0 && x <= 2){ // Checks if the rating is in the correct range
                isValid = true; // Ends do-while loop
                junk = scan.nextLine(); // Gets rid of space after Int is scanned in.
            } else {
                System.out.println("Invalid status number. (0=dependent, 1=single, and 2=married)");
                isValid = false; // Continues do-while loop
            }
        } while (!isValid);
        return x;
    }
    public static int computeAGI(double wages, double interest, double unemployComp, int status, double withheld) {
        return (int) (wages + interest + unemployComp);
    }
    public static int getDeduction(int status) {
        int deduction = 6000;
        switch (status) {
            case (0): // Dependent
                deduction = 6000;
                break; 
            case (1): // Single
                deduction = 12000;
                break; 
            case (2): // Married
                deduction = 24000;
                break; 
            default:
                break;
        }
        return deduction;
    } 
    public static int getTaxable(int AGI, int deduction) {
        int x = AGI - deduction;
        if (x < 0) { // If government owes money
            x = 0;
        }
        return x;
    } 
    public static int calcTax(int taxable, int status) {
        double tax;
        if (status != 2) { // Not married
            if (taxable <= 10000) {  // Taxable income brackets, income ranges are taxed differently
                tax = taxable * 0.10;
            } else if (taxable > 10001 && taxable <= 40000) {
                tax = 1000 + (taxable - 10000) * 0.12;
            } else if (taxable > 40000 && taxable <= 85000 ) {
                tax = 4600 + (taxable - 40000) * 0.22;
            } else {
                tax = 14500 + (taxable - 85000) * 0.24;
            }
        } else { // Married
            if (taxable <= 20000) {
                tax = taxable * 0.10;
            } if (taxable > 20000 && taxable <= 80000) {
                tax = 2000 + (taxable - 20000) * 0.12;
            } else {
                tax = 9200 + (taxable - 80000) * 0.22;
            }
        } return (int) (Math.round(tax));
    } 
    public static int calcTaxDue(int taxOwed, double taxPaid) {
        return (int) (taxOwed - taxPaid); // tax owed is the calcTax, tax paid is the withheld value
    }
}