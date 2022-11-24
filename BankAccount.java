public class BankAccount {
    private String number = "";
    private String owner;
    private double balance;
    protected static int numAccounts = 0;

    public BankAccount (String owner, double balance) {
        for (int i = 0; i < 10; i++) {
            number += (int)(Math.random() * 10);
        }
        this.owner = owner;
        this.balance = balance;
        numAccounts++;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public String getNumber () {
        return number;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public String getOwner () {
        return owner;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public double getBalance () {
        return balance;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public void deposit(double amount) { 
        balance += amount;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public boolean withdraw (double amount) { 
        if (amount > balance) {
            return false;
        } else {
            balance-=amount;
            return true;
        }
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public static int getNumAccounts() {
        return numAccounts;
    }

    @Override
    
    /* Pre-condition: 
     * Post-condition: 
     */
    public String toString () {
        return String.format("%-10s\t%-30s\t%-10.2f",number, owner, balance);
    }
}  
