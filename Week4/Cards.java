package Week4;
import java.lang.Math; 

public class Cards {
    public static void main(String[] args) {
        // Generating a random card number
        int cardNumber = (int)(Math.random() * 52);

        // Declares string variables suitName and cardIdentity
        String suitName;
        String cardIdentity = "";

        int suit = cardNumber / 13;
        
        // Assigned the suit name based on the card number
        if(suit == 0) {
            suitName = "diamonds";
        } else if (suit == 1) {
            suitName = "clubs";
        } else if (suit == 2) {
            suitName = "hearts";
        } else {
            suitName = "spades";
        }

        int card = (cardNumber+1) % 13;

        switch(card) {
            case 0:
                cardIdentity = "King";
                break;
            case 1:
                cardIdentity = "Ace";
                break;
            case 2:
            case 3:    
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                cardIdentity = card + ""; 
                break;
            case 11:
                cardIdentity = "Jack";
                break;
            case 12:
                cardIdentity = "Queen";
                break;
        }
        System.out.println("Your card, number " + cardNumber + ", is the " + cardIdentity + " of " + suitName);
    }
}
