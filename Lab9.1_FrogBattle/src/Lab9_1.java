import frogs.Frog;

public class Lab9_1 {

	public static void main(String[] args) {
		//create frog 1
		Frog frog1 = new Frog();
		
		//create frog 2
		//(int)(Math.random() * end value - start value + 1) + start value
		//Math.random returns double, but casting allows to return as a int
		int randomAge = (int)(Math.random() * (100 - 1 + 1)) + 1;
		Frog frog2 = new Frog(randomAge);
		
		//Print the frogs
		System.out.println(frog1.toString());
		System.out.println(frog2);
		
		//Print the average age
		double average = ((double)frog1.getAge() + frog2.getAge() / Frog.getFrogsCreated());
		System.out.println("The average age of the frogs is " + average);

	}

}
