// Ed Roberts
import cards.Card;
import player.Player;

public class Card_Driver {

	// Constants - any method can access - used from Lab8.1 to generate grid output
		static int ROWSIZE = 4; //Each suit has 13 cards
		static int COLSIZE = 13; //There are 4 suits

	public static void main(String[] args) {

	//Create Card Object
	Card myDeck = new Card(52); //Passed the argument 52 to have all 52 cards from the deck.

	//Array for the deck of cards, 52 (the deck) - Creating the Deck of Cards
	Card[] cardDeck = new Card[52];

	//Initialize card objects in the array and prints the array
	for (int i = 0; i < cardDeck.length; i++) {
        cardDeck[i] = new Card(i + 1); // Initialize each card with appropriate card number
    }

    // Print the deck in rows and columns
    for (int row = 0; row < ROWSIZE; row++) {
        for (int col = 0; col < COLSIZE; col++) {
            int index = row * ROWSIZE + col;
            if (index < cardDeck.length) {
                System.out.printf("%-5s", cardDeck[index]); // Print each card
            } else {
                break; // Break the loop if index exceeds the length of the cardDeck array
            }
        }
        System.out.println("\n"); // Start a new line after printing each row
    }

	//Shuffled Deck


	//Print Card array objects again


	//System.out.println(shuffledDeck);

	//Create 2 player objects
	Player player1 = new Player();
	Player player2 = new Player();

	//Create 2 arrays of type Cards (one for each player) with size 5
	//Card myHand1 = new Card();
	//Card myHand2 = new Card();

	//Print the player name and the corresponding hand
   // System.out.println("Tom Riddle's Hand:" + myHand1);
    //System.out.println("\nHarry Potter's Hand:" + myHand2);

	}

}
