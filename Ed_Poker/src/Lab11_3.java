import java.util.ArrayList;
import cards.Card;

public class Lab11_3 {

	public static void main(String[] args) {
		ArrayList<Integer> deck = new ArrayList<>();
		
        // Initialize standard card objects in the array
        for (int i = 1; i < 53; i++) {
            deck.add(i); // Initialize each card with appropriate card number            
        }
        
        System.out.println("Deck before shuffle");
        printDeck(deck);
        
        System.out.println("\nDeck after Shuffle");
        ShuffledDeck(deck);	// Call the method to shuffle the deck
        printDeck(deck);	//Prints the shuffled deck
        
        // Create two arrays to be the players hands
        int[] player1 = new int[5];
        int[] player2 = new int[5];
        
        // Deal 5 cards alternately to player1 and player2
        for (int i = 0; i < 5; i++) {
            player1[i] = deck.remove(0); // Remove the top card from the deck and add it to player1's hand
            player2[i] = deck.remove(0); // Remove the top card from the deck and add it to player2's hand
        }
        
        //Print the player's hands
        System.out.println("\nPlayer 1 hand: ");
        printHand(player1);
        
        System.out.println("\nPlayer 2 hand: ");
        printHand(player2);
        
        System.out.println("\nDeck after cards dealt");
        printDeck(deck);
        
}
	
    // Print Method: Prints an array of cards in a formatted way
    public static void printDeck(ArrayList<Integer> deck) {
        // Loop through the deck of cards
        for (int col = 0; col < deck.size(); col++) {
            // Print each card followed by a tab
            System.out.print(deck.get(col) + "\t");
            
            // Check if it's time to start a new line (after every 13 cards)
            if ((col + 1) % 13 == 0) {
                System.out.print("\n"); // Start a new line after printing each row
            }
        }
    }
	
	public static void ShuffledDeck(ArrayList<Integer> deck) {
	    Integer temp;
	    int randomIndex;
	 // Loop through the deck of cards in reverse order
	    for (int i = deck.size() - 1; i >= 0; i--) {
	    	// Generate a random index within the range of the deck
	    	randomIndex = (int)(Math.random() * deck.size());
	    	
	    	// Swap the current card with a card at the random index
	    	temp = deck.get(i);
	    	deck.set(i, deck.get(randomIndex));
	    	deck.set(randomIndex, temp);	//Taking temp value and setting it at the deck to random Index
	    	}
	    
	    
	    }
	
    // Method to print a player's hand
    public static void printHand(int[] hand) {
        for (int card : hand) {
            System.out.print(card + " ");
        }
        System.out.println();
    }
}

