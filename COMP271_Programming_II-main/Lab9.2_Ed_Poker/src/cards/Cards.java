// Ed Roberts

package cards;

// This are all the attributes of the Card class
public class Cards {
	private int cardNumber;
	private String[] suit;
	private int suitIndex;
	private String color;
	private int cardRank;
	private String face;
	private String cardImage;
	private int cardsCreated;
	
// no-arg constructor
	public Cards() {
	}
	
//These are the methods that will be the actions(behavior) of the Card class	
	public Cards( int cardNumber) {
		cardNumber = 0; //Sets the cardNumber at 0.
		this.cardNumber = cardNumber;
		createCard();
		cardNumber++; //Increases cardNumber by 1
	}

//This method is used to create the cards in the deck
	public void createCard() {
		this.suitIndex = (cardNumber - 1) / 13;
		String[] suits = {"s", "h", "d", "c"}; //This array connects to the integer array for the suits
		int[] suitIndex = {0, 1, 2, 3};
		this.suit = suits;
		this.cardRank = (cardNumber - 1) % 13 + 1; //Makes it so that the cardNumber starts at 1 and that it will make the rank 1 to 13.
		this.face = getFaceFromRank(cardRank);
		this.cardImage = cardImage;
		this.cardsCreated = 1;
	}
	
	private String getFaceFromRank(int cardRank) {
		return null;
	}

	public String toString() {
		return face + " of " + suit;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String[] getSuit() {
		return suit;
	}

	public void setSuit(String[] suit) {
		this.suit = suit;
	}

	public int getSuitIndex() {
		return suitIndex;
	}

	public void setSuitIndex(int suitIndex) {
		this.suitIndex = suitIndex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCardRank() {
		return cardRank;
	}

	public void setCardRank(int cardRank) {
		this.cardRank = cardRank;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getCardImage() {
		return cardImage;
	}

	public void setCardImage(String cardImage) {
		this.cardImage = cardImage;
	}

	public int getCardsCreated() {
		return cardsCreated;
	}

	public void setCardsCreated(int cardsCreated) {
		this.cardsCreated = cardsCreated;
	}
}
