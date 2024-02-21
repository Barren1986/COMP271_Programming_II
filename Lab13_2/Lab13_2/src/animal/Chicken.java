package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {

	public Chicken() {}

	@Override
	public String sound() {
		return "Cluck cluck";
	}

	@Override
	public String howToEat() {
		return "Fried or Beer-Battered";
	}

}
