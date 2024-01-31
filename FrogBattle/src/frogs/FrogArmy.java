package frogs;

public class FrogArmy {
	
	private Frog[] frogArmy;
	
	public FrogArmy(int frogCount) {
		frogArmy = new Frog[frogCount];
		
		for(int i = 0; i < frogArmy.length; i++) {
			//(int)(Math.random() * end value - start value + 1) + start value
			//Math.random returns double, but casting allows to return as a int
			int randomAge = (int)(Math.random() * (100 - 1 + 1)) + 1;
			frogArmy[i] = new Frog(randomAge);
		}
	}
	
	//Getter
	public Frog[] getFrogArmy() {
		return frogArmy;	
	}
	
	//Not a Getter
	public double getAverageAge() {
		double totalAge = 0;
		
		for(int i = 0; i < frogArmy.length; i++) {
			totalAge += frogArmy[i].getAge();
		}
		
		return totalAge/frogArmy.length;
	}
}
