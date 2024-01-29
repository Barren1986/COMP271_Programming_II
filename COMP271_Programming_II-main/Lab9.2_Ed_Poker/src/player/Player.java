package player;

public class Player {
	private String id;
	private String name;
	private int bank;
	
	public Player(String id, String name, int bank) {
		this.id = id;
		this.name = name;
		this.bank = bank;
	}
	
	public Player(String id, String name) {
		this(id, name, 1000);
	}
	
	public Player() {
		this("00000", "Guest", 1000);
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
