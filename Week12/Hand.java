public class Hand {
    private Card[] hand;
    public int count = 0;
    public Hand (int size) {
        hand = new Card [size]; 
    }
    /* Pre-condition: None
     * Post-condition: Void method, no variable set to the method. Print all cards in hand
     */
    public void display() {
        System.out.print("Current Hand: ");
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) { // For empty spaces in the hand array
                hand[i].print();
            }
        } System.out.println();
    }
    /* Pre-condition: Card object in method argument
     * Post-condition: Void method, no variable set to the method. Increments count
     */
    public void addCard(Card card) {
        hand[count] = card;
        count++;
    }
    /* Pre-condition: None
     * Post-condition: Returns integer for the total hand value
     */
    public int getValue() {
        int total = 0;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) { // For empty spaces in the hand array
                if (hand[i].getRank() < 10) { // Indices less than 10, A-9
                    total += (hand[i].getRank() + 1); 
                } else { // 10 - K
                    total += 10;
                }
            }
        } return total;
    } 
}
