public class Card {
    private int rank;
    private int suit;
    private String [] rankName = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] suitName = {"C","H","S","D"};
    public Card (int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    /* Pre-condition: Object must exist and have been initialized with 2 integer arguments
     * Post-condition: Returns the rank of the object, set by the constructor
     */
    public int getRank() {
        return rank;
    } 
    /* Pre-condition: Object must exist and have been initialized with 2 integer arguments
     * Post-condition:Returns the suit of the object, set by the constructor
     */
    public int getSuit() {
        return suit;
    } 
    /* Pre-condition: Object must exist and have been initialized with 2 integer arguments
     * Post-condition: Returns the rankName string array
     */
    public String [] getRankName() {
        return rankName;
    }
    /* Pre-condition: Object must exist and have been initialized with 2 integer arguments
     * Post-condition: Returns the suitName string array
     */
    public String [] getSuitName() {
        return suitName;
    }
    /* Pre-condition: rank must be an index of rankName (0-12), suit must be an index of suitName (0-3)
     * Post-condition: Void method, no variable set to the method
     */
    public void print() {
        System.out.print(getRankName()[rank] + getSuitName()[suit] + " "); // Prints rank next to suit, indicating the exact card
    }
}
