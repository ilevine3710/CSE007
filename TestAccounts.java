import java.util.Scanner; //TODO: Pre/Post conditions

public class TestAccounts {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        BankAccount [] accounts = new BankAccount [10];
        accounts[0] = new CheckingAccount("William Burst", 10000);
        accounts[1] = new SavingsAccount("Lara Stevens", 75000,0.0925);
        accounts[2] = new CheckingAccount("Nathan Steward", 24900);
        accounts[3] = new SavingsAccount("Isabel Truman ", 89250,0.105);
        accounts[4] = new SavingsAccount("Andrew Sullivan", 12734,0.121);
        accounts[5] = new CheckingAccount("George Duck ", 29990);
        accounts[6] = new SavingsAccount("Emma Stevens", 31250,0.0889);

        boolean end = false;
        do {
            System.out.println("Select an operation: ");
            System.out.println("\t1: display accounts");
            System.out.println("\t2: find accounts");
            System.out.println("\t3: sort accounts by owner name");
            System.out.println("\t4: exit");

            boolean isValid = false;
            String junk;
            int choice = 0;
            do {
                while (!scan.hasNextInt()) {
                    junk = scan.next();
                    System.out.println("Invalid choice. Please enter a 1, 2, 3 or 4.");
                }
                choice = scan.nextInt();
                if (choice >= 1 && choice <= 4) {
                    junk = scan.nextLine();
                    isValid = true;
                } else {
                    System.out.println("Invalid choice. Please enter a 1, 2, 3 or 4.");
                }
            } while (!isValid);

            switch (choice) {
                case(1):
                    printAccounts(accounts);
                    break;
                case(2):
                    findAccount(accounts,scan);
                    break;
                case(3):
                    sortAccounts(accounts);
                    break;
                case(4):
                    end = true;
                    break;
                default:
                    break;
            }
        } while (!end);
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public static void printAccounts (BankAccount [] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                System.out.println(accounts[i].toString());
            }
        } System.out.println("Banking Accounts: " + BankAccount.getNumAccounts());
        System.out.println("Checking Accounts: " + CheckingAccount.getNumChecking());
        System.out.println("Savings Accounts: " + SavingsAccount.getNumSavings());
    }
     /* Pre-condition: 
     * Post-condition: 
     */
    public static void findAccount (BankAccount [] accounts, Scanner scan) {
        double balance = 0;
        String junk = "";
        System.out.println("Enter a balance to search for: ");
        while (!scan.hasNextDouble()) { 
            junk = scan.next();
            System.out.println("Invalid balance. Pleaser enter a number for the balance you would like to search for.");
        } balance = scan.nextDouble();
     
        boolean found = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                if (balance == accounts [i].getBalance()) {
                    System.out.println("The following account has a balance of $" + balance + ": ");
                    System.out.println(accounts[i].toString());
                    found = true;
                    break;
                }
            }
        } if (!found) {
            System.out.println("An account with the balance of $" + balance + " was not found.");
        }
    } 
     /* Pre-condition: 
     * Post-condition: 
     */
    public static void sortAccounts (BankAccount [] accounts) {
        for (int i = 0; i < accounts.length; i++) { 
            if (accounts[i] != null) {
                int j = i;
                while (j > 0 && accounts [j].getOwner().compareTo(accounts[j - 1].getOwner()) < 0) {
                    BankAccount temp = accounts [j];
                    accounts [j] = accounts [j - 1];
                    accounts [j - 1] = temp;
                    j -= 1; 
                }
            } 
        }
        printAccounts (accounts);
    }
}
