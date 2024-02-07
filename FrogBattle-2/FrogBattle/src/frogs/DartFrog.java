package frogs;

public class DartFrog extends Frog{
	private int poisonLevel;
	
	
	public DartFrog() {
		
	}
	
	public DartFrog(int age, String army) {
		super(age,army);
		super.setHealth(30);
		poisonLevel = (int)Math.random() *(6-2+1) + 2;
	}
	@Override
	public void damage(int damageAmount) {
		int health = super.getHealth() - damageAmount/2;
		super.setHealth(health);
	}

	public int getPoisonLevel() {
		return poisonLevel;
	}
}
