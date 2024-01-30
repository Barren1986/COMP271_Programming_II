// Ed Roberts

package cards;

// This are all the attributes of the Card class
	public class Card {
	private int cardNumber;
	private String suit;
	private int suitIndex;
	private String color;
	private int cardRank;
	private String face;
	private String cardImage;
	private int cardsCreated;
	
//These are the methods that will be the actions(behavior) of the Card class	
	public Card(int cardNumber) {
		this.cardNumber = cardNumber;
		createCard();
		cardNumber++; //Increases cardNumber by 1
	}

//This method is used to create the cards in the deck
	private void createCard() {
		this.suitIndex = (cardNumber - 1) / 13;
		this.cardRank = ((cardNumber - 1) % 13) + 1; //Makes it so that the cardNumber starts at 1 and that it will make the rank 1 to 13.
		this.face = getFaceFromRank(cardRank);
		this.cardImage = cardImage;
		this.cardsCreated++; //Created one card at a time
		setSuit();
		setRank();
	}
	
	private void setSuit() {
	switch (suitIndex) {
		case 0:
			this.suit = "s";
			this.color = "b";
			break;
		case 1:
			this.suit = "h";
			this.color = "r";
			break;
		case 2:
			this.suit = "d";
			this.color = "r";
			break;
		case 3:
			this.suit = "c";
			this.color = "b";
			break;
		}
	}
	
	private void setRank() {
	switch (cardRank) {
		case 1:
			this.face = "A";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			this.face = Integer.toString(cardRank);
			break;
		case 10:
			this.face = "T";
			break;
		case 11:
			this.face = "J";
			break;
		case 12:
			this.face = "Q";
			break;
		case 13:
			this.face = "K";
			break;
	}
}
	
	private String getFaceFromRank(int cardRank) {
		return face;
	}

	public String toString() {
		return face + suit;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
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
