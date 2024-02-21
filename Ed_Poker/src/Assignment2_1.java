
import cards.Card;
import cards.UnoCard;
import player.Player;

public class Assignment2_1 {

    public static void main(String[] args) {
        // Array that creates the deck of standard cards, 52 cards in total
        Card[] cardDeck = new Card[52];
                
        // Array that creates the deck of Uno Cards, 108 cards in total
        UnoCard[] unoDeck = new UnoCard[108];
                
        // Initialize standard card objects in the array
        for (int i = 0; i < cardDeck.length; i++) {
            cardDeck[i] = new Card(i + 1); // Initialize each card with appropriate card number
        }

        // Initialize unoDeck with 108 Uno cards
        for (int i = 0; i < unoDeck.length; i++) {
        	unoDeck[i] = new UnoCard(i + 1);
            }

        // Print the standard deck of cards
        System.out.println("Standard Deck");
        printDeck(cardDeck);
        
        // Shuffle the standard deck of cards
        shuffleDeck(cardDeck);
        System.out.println();
        
        // Print the shuffled standard deck of cards
        System.out.println("Shuffled Standard Deck");
        printDeck(cardDeck);
        
        // Print the unshuffled Uno deck of cards
        System.out.println();
        System.out.println("Standard Uno Deck");
        printDeck(unoDeck);
        
        // Shuffle the Uno deck of cards
        shuffleDeck(unoDeck);
        System.out.println();
        
        // Print the shuffled Uno deck of cards
        System.out.println();
        System.out.println("Shuffled Uno Deck");
        printDeck(unoDeck);
        
        // Create 2 player objects - Player 1 object and Player 2 object from Player Class
        Player player1 = new Player("9765467", "FastFreddy", 2650);
        Player player2 = new Player("2435573", "OneEyedJack", 1400);
                
        // Deal cards to player 1
        for (int i = 0; i < 7; i++) {
            player1.getHand().addCard(unoDeck[i]);
        }
        
        // Deal cards to player 2
        for (int i = 7; i < 12; i++) {
            player2.getHand().addCard(cardDeck[i]);
        }
        
        // Print player 1 hand
        printHand(player1.getHand().getCards(), player1);
        
        // Print player 2 hand
        printHand(player2.getHand().getCards(), player2);
        
    }
    
    // Shuffle Method: Shuffles an array of cards
    public static void shuffleDeck(Card[] cardDeck) {
        Card temp; // Temporary variable used for swapping
        int randomIndex; // Variable to store a random index

        // Loop through the deck of cards in reverse order
        for (int i = cardDeck.length - 1; i >= 0; i--) {
            // Generate a random index within the range of the deck
            randomIndex = (int) (Math.random() * cardDeck.length);
            
            // Swap the current card with a card at the random index
            temp = cardDeck[i];
            cardDeck[i] = cardDeck[randomIndex];
            cardDeck[randomIndex] = temp;
        }
    }

    // Print Method: Prints an array of cards in a formatted way
    public static void printDeck(Card[] cardDeck) {
        // Loop through the deck of cards
        for (int col = 0; col < cardDeck.length; col++) {
            // Print each card followed by a tab
            System.out.print(cardDeck[col] + "\t");
            
            // Check if it's time to start a new line (after every 13 cards)
            if ((col + 1) % 13 == 0) {
                System.out.print("\n"); // Start a new line after printing each row
            }
        }
    }

    
    // Method to print player's hand
    public static void printHand( Card[] hand, Player player) {
        String playerName = player.getName(); // Get the player's name
        System.out.println("\n\n" + playerName + "'s" + " Hand: " ); // Print player's name and "Hand:"
        for (int i = 0; i < hand.length; i++) {
            Card card = hand[i]; // Get the current card from the hand
            System.out.print(card + " "); // Print the card followed by a space
        }
        System.out.println(); // Move to the next line
    }

}
