package player;

import hand.Hand;


// Attributes of the Player Class
public class Player {
	private String id;
	private String name;
	private int bank;
	private Hand hand; // Aggregate relationship between Hand and Player class
	
	
// Constructor of the Player Class
	public Player(String id, String name, int bank) {
		this.id = id;
		this.name = name;
		this.bank = bank;
		this.hand = new Hand(); // Creates the instance of Hand for each Player
	}
	
	public Player(String id, String name) {
		this(id, name, 1000);
	}
	
	public Player() {
		this("00000", "Guest", 1000);
	}
	
	public Hand getHand() { // Each player needs to get a Hand
		return hand;
	}

	public int getBank() {
		return bank;
	}

	public void setBank(int bank) {
		this.bank = bank;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Player " + name + ", id: " + id + " has a bank of " + bank;
	}
	
}
