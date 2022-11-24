public class Calculator {
    private double value = 0;
    private static int operations = 0;

    /* Pre-Conditions: Double as argument
     * Post-Conditions: Void method. Add the argument to the value, increments operations
     */
    public void add(double val)  {
        value += val;
        operations ++;
    }
    /* Pre-Conditions: Double as argument
     * Post-Conditions: Void method. Subtracts the argument from the value, increments operations
     */
    public void subtract(double val){
        value -= val;
        operations ++;
    }
    /* Pre-Conditions: Double as argument
     * Post-Conditions: Void method. Multiplies the argument to the value, increments operations
     */
    public void multiply(double val) {
        value *= val;
        operations ++;
    }
    /* Pre-Conditions: Double as argument
     * Post-Conditions: Void method. Divides the argument from the value, increments operations
     */
    public void divide(double val) {
        value /= val;
        operations ++;
    }
    /* Pre-Conditions: Int as argument
     * Post-Conditions: Void method. Puts value to the power of the argument, increments operations
     */
    public void power (int val) {
        double x = value; // Hold value to be multiplied multiple times
        if (val != 0) {
            if (val < 0) {
                val *= -1;
                x = 1 / value;
            } while (val > 1) {
                value *= x;
                val--;
            }
        } else {
            value = 1;
        } operations++;
    }
    /* Pre-Conditions: None
     * Post-Conditions: Void method. Sets value to 0.
     */
    public void clear() {
        value = 0;
    } 
    /* Pre-Conditions: None
     * Post-Conditions: Void method. Sets operations to 0.
     */
    public void clearOp () {
        operations = 0;
    }
    /* Pre-Conditions: None
     * Post-Conditions: Returns the double value.
     */
    public double getValue() {
        return value;
    } 
    /* Pre-Conditions: None
     * Post-Conditions: Returns the int operations.
     */
    public int getOperations () {
        return operations;
    }
}
