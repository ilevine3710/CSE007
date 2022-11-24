/*Isaac Levine
 * 11/11/2022
 * CSE007 Fall 2022: Lab 11
 * The purpose of this program is to create a calculator object and use it to solve equations
 */
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Calculator calc = new Calculator();

        System.out.println("Equation: (7x + y - 13) / 14");
        System.out.println("Enter an number for the variable x: ");
        double x = inputValidDouble(scan);
        System.out.println("Enter an number for the variable y: ");
        double y = inputValidDouble(scan);

        printValue(calc);
        calc.add(7.0);
        printValue(calc);
        calc.multiply(x);
        printValue(calc);
        calc.add(y);
        printValue(calc);
        calc.subtract(13.0);
        printValue(calc);
        calc.divide(4.0);
        printValue(calc);
        System.out.println("Total # of Operations: " + calc.getOperations());
        calc.clear();
        printValue(calc);
        calc.clearOp();

        
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        System.out.println("Equation: (4xzy ^ 3 + (2 + y) ^ x - 7z) / (5xy + 4z - x)");
        System.out.println("Enter an number for the variable x: ");
        int x1 = inputValidInt(scan);
        System.out.println("Enter an number for the variable y: ");
        y = inputValidDouble(scan);
        System.out.println("Enter an number for the variable z: ");
        double z = inputValidInt(scan);
        

        System.out.println();
        calc1.add(y); // y
        printValue(calc1);
        calc1.power(3); // y ^ 3
        printValue(calc1);
        calc1.multiply(4); // 4y ^ 3
        printValue(calc1);
        calc1.multiply(x1); // 4xy ^ 3
        printValue(calc1);
        calc1.multiply(z); // 4xzy ^ 3, 5 operations
        printValue(calc1); 

        calc2.add(2); // 2
        printValue(calc2);
        calc2.add(y); // 2 + y
        printValue(calc2);
        calc2.power(x1); // (2 + y) ^ x
        printValue(calc2);
        calc1.add(calc2.getValue()); // 4xzy ^ 3 + (2 + y) ^ x, 4 operations
        printValue(calc1);
        calc2.clear();

        calc2.add(7); // 7
        printValue(calc2);
        calc2.multiply(z); // 7z
        printValue(calc2);
        calc1.subtract(calc2.getValue()); // 4xzy ^ 3 + (2 + y) ^ x - 7z, 3 operations
        printValue(calc1);
        calc2.clear();
        

        calc2.add(5); // 5
        printValue(calc2);
        calc2.multiply(x1); // 5x
        printValue(calc2);
        calc2.multiply(y); // 5xy, 3 operations
        printValue(calc2); 

        calc3.add(4); // 4
        printValue(calc3);
        calc3.multiply(z); // 4z
        printValue(calc2);
        calc2.add(calc3.getValue()); //5xy + 4z, 3 operations
        printValue(calc2);
        calc3.clear();

        calc3.add(x1); // x
        printValue(calc3);
        calc2.subtract(calc3.getValue()); // 5xy + 4z - x, 2 operations
        printValue(calc2);
        calc3.clear();

        calc1.divide(calc2.getValue()); // 4xzy ^ 3 + (2 + y) ^ x - 7z) / (5xy + 4z - x), 1 operation
        printValue(calc1);
        System.out.println("Total # of Operations: " + calc1.getOperations());

        scan.close();
    }
    /* Pre-Conditions: Scanner in the argument
     * Post-Conditions: Returns input validated double
     */
    public static double inputValidDouble (Scanner scan) {
        double i = 0;
        String junk = "";
        junk = junk + 1;
        while (!scan.hasNextDouble()) {
            junk = scan.next();
            System.out.println("Invalid input, enter an number.");
        } i = scan.nextDouble();
        return i;
    } 
    /* Pre-Conditions: Scanner in the argument
    *  Post-Conditions: Returns input validated int
    */
    public static int inputValidInt (Scanner scan) {
        int i = 0;
        String junk = "";
        junk = junk + 1;
        while (!scan.hasNextInt()) {
            junk = scan.next();
            System.out.println("Invalid input, enter an integer.");
        } i = scan.nextInt();
        return i;
    }
    /* Pre-Conditions: Calculator object in the argument
    *  Post-Conditions: Void method, prints method from Calculator class that returns the current value in the calculator
    */
    public static void printValue (Calculator calc) {
        System.out.println("Current Value: " + calc.getValue());
    }
}
