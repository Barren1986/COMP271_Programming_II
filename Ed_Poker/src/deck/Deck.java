package deck;

import java.util.ArrayList;
import cards.Card;

public class Deck {
	// ArrayList to hold the cards in the deck
    private final ArrayList<Card> cards;
    // ArrayList to hold the cards that have been used
    private final ArrayList<Card> usedCards;
    
    // Constructor to create a new deck with a specified size
    public Deck(int deckSize) {
    	
    // Initialize the ArrayLists
        cards = new ArrayList<>();
        usedCards = new ArrayList<>();
        
        // Add card to the deck
        for (int i = 1; i <= deckSize; i++) {
        	cards.add(new Card(i));
        }
    }
    
    // Method to shuffle the deck
    public void shuffleDeck() {
	    Card temp;
	    int randomIndex;
	 // Loop through the deck of cards in reverse order
	    for (int i = cards.size() - 1; i >= 0; i--) {
	    	// Generate a random index within the range of the deck
	    	randomIndex = (int)(Math.random() * cards.size());
	    	
	    	// Swap the current card with a card at the random index
	    	temp = cards.get(i);
	    	cards.set(i, cards.get(randomIndex));
	    	cards.set(randomIndex, temp);	//Taking temp value and setting it at the deck to random Index
	    	}
	    }

    // Loops through the usedCards and ArrayList; removes each Card and adds it to the cards Array List
    public void restack() {
    	for (int i = usedCards.size() - 1; i >= 0; i--) {
    		Card card = usedCards.remove(i);	// Get the card from usedCards
			cards.add(card);	// Add the card to cards
    	}
    	shuffleDeck();    	
	}
    
    public Card dealCard(int index) {
    	// Remove the Card at the specified index and return it
		return cards.remove(index);
	}
    
    public Card getCard(int index) {
		Card card = cards.get(index);
		return card;
	}
    
    public void addUsedCards(Card card) {
    	usedCards.add(card);
	}
    
    // Converts the cards ArrayList to an array and returns it
    public Card[] getCards() {
        Card[] cardArray = new Card[cards.size()]; 
        for (int i = 0; i < cards.size(); i++) {
            cardArray[i] = cards.get(i);
        }
        return cardArray;
    }

    
    public Card[] getUsedCards() {
        Card[] usedCardArray = new Card[usedCards.size()];
        return usedCards.toArray(usedCardArray);
    }
	
	public String toString() {
	    StringBuilder result = new StringBuilder("Deck: \n");

	// Print the cards in 13 columns
	    int count = 0;
	    for (Card card : cards) {
	        result.append(card.toString()).append("\t");
	        count++;
	        if (count % 13 == 0) {
	            result.append("\n");
	        }
	    }

	    // If there are used cards, print them in 13 columns
	    if (!usedCards.isEmpty()) {
	        result.append("\nUsed Cards: \n");
	        count = 0;
	        for (Card card : usedCards) {
	            result.append(card.toString()).append("\t");
	            count++;
	            if (count % 13 == 0) {
	                result.append("\n");
	            }
	        }
	    }

	    return result.toString();
	}
}

