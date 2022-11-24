public class SavingsAccount extends BankAccount{
    protected static int numSavings = 0;
    public double Yinterest;
    public SavingsAccount (String owner, double balance, double Yinterest) {
        super(owner,balance);
        this.Yinterest = Yinterest;
        numSavings++;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public double getYInterest () {
        return Yinterest;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public double getMInterest () {
        return Yinterest / 12;
    } 
    /* Pre-condition: 
     * Post-condition: 
     */
    public void setYInterest (int newInterest) {
        Yinterest = newInterest;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public double applyInterest () {
        double interestEarned = ((Yinterest / 12) / 100) * super.getBalance();
        return interestEarned;
    }
    /* Pre-condition: 
     * Post-condition: 
     */
    public static int getNumSavings () {
        return numSavings;
    }
    

    @Override
    /* Pre-condition: 
     * Post-condition: 
     */
    public String toString() {
        return "Savings \t" + super.toString();
    }
}
