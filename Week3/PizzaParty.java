package Week3;
/*Isaac Levine
 * 9/2
 * CSE007 Fall 2022: Lab 1 
 * The purpose of this program is to use values input by the user to calculate the cost of hosting pizza parties on Friday and Saturday nights, and ultimately determines if you can afford to host both parties.  
 */
import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {

        double budget; //this holds the total amount you have to spend on the weekend (we will compare this to the weekendTotal)
        int numFriends1; //this holds the number of people that will join you for pizza on Friday
        int numFriends2; //this holds the number of people that will join you for pizza on Saturday
        double avgSlicePerson1; //this holds the number of slices that the avg person eats on Friday and will be used to calculate the total number of slices (pies) needed
        double avgSlicePerson2; //this holds the number of slices that the avg person eats on Saturday and will be used to calculate the total number of slices (pies) needed
        double costPerPizza1; //this holds the cost for a single pizza on Friday(whole pie; slices not available separately)
        double costPerPizza2; //this holds the cost for a single pizza on Saturday(whole pie; slices not available separately)
        int wholePizzas; //will hold the number of whole pizzas required based on the slices that are estimated
        double totalPizzaCost; //subtotal of cost of pizzas
        double totalTaxOwed; //uses rate below to calculate the tax owed on the total
        double total; //will hold the total owed each night including pizza, tax and delivery
        final int slicePerPizza = 8; //this is the number of slices cut from each pizza
        final double salesTax = .06; //this holds the salesTax rate used for the order (6%)
        final double deliveryFee = 4.99; //this holds the flat delivery fee applied to each order

        Scanner scan = new Scanner(System.in);

        //Getting input for the parties
        System.out.println("PIZZA PARTY PLANNER!");
        System.out.println("Enter your budget:");
        budget = scan.nextDouble();
        System.out.println("Enter how many Friends are coming on Friday:");
        numFriends1 = scan.nextInt();
        System.out.println("Enter the average number of slices each person will eat on Friday:");
        avgSlicePerson1 = scan.nextDouble();
        System.out.println("Enter enter the cost of one Pizza pie on Friday:");
        costPerPizza1 = scan.nextDouble();
        System.out.println("Enter how many Friends are coming on Saturday:");
        numFriends2 = scan.nextInt();
        System.out.println("Enter the average number of slices each person will eat on Saturday:");
        avgSlicePerson2 = scan.nextDouble();
        System.out.println("Enter enter the cost of one Pizza pie on Saturday:");
        costPerPizza2 = scan.nextDouble();

        //Calculating the costs of the party on Friday
        double slices = (numFriends1+1) * avgSlicePerson1;
        double pizzas = slices/slicePerPizza; 
        wholePizzas = (int) (Math.ceil(pizzas));
        totalPizzaCost =  costPerPizza1 * wholePizzas;
        totalTaxOwed = totalPizzaCost * salesTax;
        total = totalPizzaCost + totalTaxOwed + deliveryFee;

        //Holding variables that will be changed later
        int PizzasFri = wholePizzas;
        double totalFri = total;
        
        // Display the total costs for Friday
        System.out.println();
        System.out.printf("Friday Night Party");
        System.out.println();
        System.out.print(wholePizzas);
        System.out.printf(" Pizzas: $%.2f", totalPizzaCost);
        System.out.println();
        System.out.printf("Tax: $%.2f", totalTaxOwed);
        System.out.println();
        System.out.printf("Delivery: $%.2f", deliveryFee);
        System.out.println();
        System.out.printf("Total: $%.2f", total);
        System.out.println();
    
        //Calculating the costs of the party on Saturday
        slices = (numFriends2+1) * avgSlicePerson2;
        pizzas = slices/slicePerPizza; 
        wholePizzas = (int) (Math.ceil(pizzas));
        totalPizzaCost =  costPerPizza2 * wholePizzas;
        totalTaxOwed = totalPizzaCost * salesTax;
        total = totalPizzaCost + totalTaxOwed + deliveryFee;

        // Testing if they are able to afford the cost of the pizza
        boolean x = budget>(totalFri+total);

        // Display the total costs for Saturday
        System.out.println();
        System.out.printf("Saturday Night Party");
        System.out.println();
        System.out.print(wholePizzas);
        System.out.printf(" Pizzas: $%.2f", totalPizzaCost);
        System.out.println();
        System.out.printf("Tax: $%.2f", totalTaxOwed);
        System.out.println();
        System.out.printf("Delivery: $%.2f", deliveryFee);
        System.out.println();
        System.out.printf("Total: $%.2f", total);
        System.out.println();

        // Display total costs for both parties
        System.out.println();
        System.out.println("Weekend Total:");
        System.out.print(PizzasFri+wholePizzas);
        System.out.printf(" Pizzas for $%.2f",totalFri+total);
        System.out.println();
        System.out.println("Can you afford these parties?: " + x);
        
        scan.close();
    }
}
