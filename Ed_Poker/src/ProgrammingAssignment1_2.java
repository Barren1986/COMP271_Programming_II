// Ed Roberts


// Import classes
import java.util.Arrays;
import cards.Card;
import player.Player;
import hand.Hand;


public class ProgrammingAssignment1_2 {
	
	// Constants - any method can access - used from Lab8.1 to generate grid output
		static int COLSIZE = 13; //There are 4 suits

	// Main Method
	public static void main(String[] args) {
		
		//Array that creates the deck of cards, 52 (the deck)
		Card[] cardDeck = new Card[52];
		
		//Creates Hand Objects
		Hand hand = new Hand();

		//Initialize card objects in the array
		for (int i = 0; i < cardDeck.length; i++) {
	        cardDeck[i] = new Card(i + 1); // Initialize each card with appropriate card number
	    }
		
		// Print a message indicating the deck is shuffled
		System.out.println("Shuffled Deck: ");
		
		// Shuffle the deck of cards
		ShuffledDeck(cardDeck);
		
		// Print the shuffled deck of cards
		printCardDeck(cardDeck);
		
		//Create 2 player objects
		Player player1 = new Player("9765467", "FastFreddy", 2650);
		Player player2 = new Player("2435573", "OneEyedJack", 1400);
		
		//Array for the player1 hand that creates the objects
		Card[] playerHand1 = new Card[5];
		
		//Array for the player2 hand that creates the objects
		Card[] playerHand2 = new Card[5];
		
		// Loop to deal 5 cards to each player alternately
		for (int i = 0; i < 5; i++) {
			// Deal a card to player 1
			player1.getHand().addCard(cardDeck[i * 2]);		   

			// Deal a card to player 2
			player2.getHand().addCard(cardDeck[i * 2 + 1]);
		}
		
		// Evaluate player 1's hand
		player1.getHand().evaluateHand();
		String player1Hand = player1.getHand().getHandDescr();

		// Evaluate player 2's hand
		player2.getHand().evaluateHand();
		String player2Hand = player2.getHand().getHandDescr();
		
		//Print the player name and their hand
		System.out.println();
		System.out.print("5 Card Poker");
		
		//Print the player name and their hand - evaluate hand
		System.out.println("\nPlayer 1: " + player1.getName() + "'s Hand - " + Arrays.toString(player1.getHand().getCards()) + " - " + player1Hand);
		System.out.println("Player 2: " + player2.getName() + "'s Hand - " + Arrays.toString(player2.getHand().getCards()) + " - " + player2Hand);
		
		// Compare hands to determine the winner or if it's a tie - 5 Card Poker
		int comparisonResult = player1.getHand().compareHand(player2.getHand());		 

		// Print the result
		if (comparisonResult == 1) {
		    System.out.println("Winner: " + player1.getName());
		} else if (comparisonResult == -1) {
		    System.out.println("Winner: " + player2.getName());
		} else {
		    System.out.println("It's a tie!");
		}
		
		//Print the player name and their hand - Deuces Wild
		System.out.println();
		System.out.print("Deuces Wild");
		
		//Compare hands to determine the winner or if it's a tie - Deuces Wild
		// Evaluate player 1's hand
		player1.getHand().evaluateHand("DeucesWild");
		String player1HandDescr = player1.getHand().getHandDescr();

		// Evaluate player 2's hand
		player2.getHand().evaluateHand("DeucesWild");
		String player2HandDescr = player2.getHand().getHandDescr();
		
		// Print each player's name, hand, and hand description
		System.out.println("\nPlayer 1: " + player1.getName() + "'s Hand - " + Arrays.toString(player1.getHand().getCards()) + " - " + player1HandDescr);
		System.out.println("Player 2: " + player2.getName() + "'s Hand - " + Arrays.toString(player2.getHand().getCards()) + " - " + player2HandDescr);

		// Compare hands to determine the winner or if it's a tie
		int comparisonResultDeuces = player1.getHand().compareHand(player2.getHand(), "DeucesWild");

		// Print the result
		if (comparisonResultDeuces == 1) {
		    System.out.println("Winner: " + player1.getName());
		} else if (comparisonResultDeuces == -1) {
		    System.out.println("Winner: " + player2.getName());
		} else {
		    System.out.println("It's a tie!");
		}
		
	}
	
	// Method to print player's hand
	public static void printHand( Card[] hand, Player player) {
		String playerName = player.getName();
		System.out.println("\n\n" + playerName + "'s" + " Hand: " );
		for (int i = 0; i < hand.length; i++) {
			Card card = hand[i];
			System.out.print(card + " ");
		}
		System.out.println();
	}
	
	public static void printHandDeuces( Card[] hand, Player player) {
		String playerName = player.getName();
		System.out.println("\n\n" + playerName + "'s" + " Hand: " );
		for (int i = 0; i < hand.length; i++) {
			Card card = hand[i];
			System.out.print(card + " ");
		}
		System.out.println();
	}	
	
	//Method to shuffle the deck of cards
	public static void ShuffledDeck(Card[] cardDeck) {
    Card temp;
    int randomIndex;
 // Loop through the deck of cards in reverse order
    for (int i = cardDeck.length - 1; i >= 0; i--) {
    	// Generate a random index within the range of the deck
    	randomIndex = (int)(Math.random() * cardDeck.length);
    	
    	// Swap the current card with a card at the random index
    	temp = cardDeck[i];
    	cardDeck[i] = cardDeck[randomIndex];
    	cardDeck[randomIndex] = temp;
    	}
    }
	
    // Print the deck in rows and columns
	public static void printCardDeck(Card[] cardDeck) {
        for (int col = 0; col < cardDeck.length; col++) {
        	System.out.print(cardDeck[col] + "\t");
        if ((col + 1) % 13 == 0) {
        	System.out.print("\n"); // Start a new line after printing each row
        	}
        }
	}
	
	

}
