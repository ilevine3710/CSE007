public class CheckingAccount extends BankAccount {
    protected static int numChecking = 0;
    public CheckingAccount (String owner, double balance) {
        super(owner,balance);
        numChecking++;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public static int getNumChecking () {
        return numChecking;
    }
    

    @Override
    /* Pre-condition: 
     * Post-condition: 
     */
    public String toString() {
        return "Checking \t" + super.toString();
    }
}
