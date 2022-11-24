public class Deck {
    private Card [] deck;
    private static int nextCard = -1;
    public Deck () {
        deck = new Card [52];
        int i = 0;
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
                deck [i] = new Card (k,j); // Creates card object for each index of the deck
                i++; // Increments for each index of deck
            }
        }
    } 
    /* Pre-condition: deck must exist and have a length of 52
     * Post-condition: Void method, no variable set to the method
     */
    public void shuffle() {
        for (int i = 0; i < 52; i++) {
            int x = (int)(Math.random() * (deck.length - 1)); // Random index number of the deck
            Card temp = deck [0]; // Swaps the values at the indices the random number and 0
            deck [0] = deck [x]; 
            deck [x] = temp;
        }
    } 
    /* Pre-condition: None
     * Post-condition: nextCard increments, there are more cards in the deck, returns the next card in the deck
     */
    public Card dealCard() {
        checkDeck();
        nextCard++;
        return deck [nextCard];  
    } 
    /* Pre-condition: None
     * Post-condition: Void method, no variable set to the method. Print all cards in deck
     */
    public void print() {
        for (int i = 0; i < 52; i++) {
            deck[i].print();
        } System.out.println();
    }
    /* Pre-condition: 
     * Post-condition: Void method, no variable set to the method, ends program if the end of deck is reached
     */
    public void checkDeck() {
        if (nextCard == 51) { // 51 is last index of deck
            System.out.println("No more cards");
            System.exit(0); // Quits program
        } 
    }
}
