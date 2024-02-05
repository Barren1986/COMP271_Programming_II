// Ed Roberts

import cards.Card;
import player.Player;

public class ProgrammingAssignment1_1 {

	// Constants - any method can access - used from Lab8.1 to generate grid output
	static int COLSIZE = 13; //There are 4 suits

	public static void main(String[] args) {

	//Array that creates the deck of cards, 52 (the deck)
	Card[] cardDeck = new Card[52];

	//Initialize card objects in the array
	for (int i = 0; i < cardDeck.length; i++) {
        cardDeck[i] = new Card(i + 1); // Initialize each card with appropriate card number
    }
	
	System.out.println("Deck before Shuffle");
	printCardDeck(cardDeck);
	
	System.out.println("Deck after Shuffle");
	ShuffledDeck(cardDeck);
	printCardDeck(cardDeck);
	
	//Create 2 player objects
	Player player1 = new Player("Player 1: ", "Beckett's  ", 1000);
	Player player2 = new Player("Player 2: ", "Mathius's ", 1000);

	//Create 2 arrays of type Cards (one for each player) with size 5
	Card[] playerHand1 = new Card[5];
	Card[] playerHand2 = new Card[5];
		
	//Deal 5 card hand by using modulus
	for(int i = 0; i < 10; i++) {
		int playerHands = i % 2;
		if(playerHands == 0) {
			// even
			playerHand1[i/2] = cardDeck[i];
		} else {
			//odd
			playerHand2[i/2] = cardDeck[i];
			}
			
		}

	//Print the player name and the corresponding hand
	printHand(playerHand1, player1);
	printHand(playerHand2, player2);
	
	}
	
	//Shuffled Deck
	public static void ShuffledDeck(Card[] cardDeck) {
    Card temp;
    int randomIndex;
    for (int i = cardDeck.length - 1; i >= 0; i--) {
    	randomIndex = (int)(Math.random() * cardDeck.length);
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
	
	public static void printHand( Card[] hand, Player player) {
		String playerName = player.getName();
		System.out.println("\n\n" + playerName + "Hand: " );
		
		for (int i = 0; i < hand.length; i++) {
			System.out.print(hand[i] + "\t");
		}
	}
}
