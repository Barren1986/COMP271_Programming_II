// Ed Roberts
import java.util.Random;

import cards.Cards;
import player.Player;

public class Card_Driver {

	public static void main(String[] args) {
		
	//Create Card Object
	Cards deck = new Cards();
		
	//Array for the deck of cards, 52 (the deck) - Creating the Deck of Cards
	Cards[] cardDeck = new Cards[52];
	
	//This loop loops through each suit and rank and creates those objects
	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	int[] rank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	int cardIndex = 0;

	for (String suit : suits) {
	    for (int ranks = 1; ranks <= 13; ranks++) {
	        cardDeck[cardIndex] = new Cards();
	        cardIndex++;
	    }

	//Print the deck - suit and rank
	for (Cards card : cardDeck) {
	        System.out.println(card);
	    }
	}

	//Method to shuffle cards - array?
	String[] shuffledDeck = new String[cardDeck.length];
	for (int i = 0; i < cardDeck.length; i++) {
		int randomIndex = (int) Math.floor(Math.random() * cardDeck.length);
	}
	
	//Print Card array objects again
	System.out.println(shuffledDeck);
	
	//Create 2 player objects
	Player player1 = new Player();
	Player player2 = new Player();
	
	//Create 2 arrays of type Cards (one for each player) with size 5
	Cards myHand1 = new Cards(5);
	Cards myHand2 = new Cards(5);
	
	//Print the player name and the corresponding hand
    System.out.println("Player 1's Hand:" + myHand1);
    System.out.println("\nPlayer 2's Hand:" + myHand2);
	}

}
