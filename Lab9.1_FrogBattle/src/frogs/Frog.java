package frogs;

public class Frog {
	private String id;
	private int age;
	private static int frogsCreated;
	
	public Frog() {	//This will set the age to 4, no matter what
		age = 4;
		frogsCreated++;
		id = "Frog" + frogsCreated;
	}
	
	public Frog(int age) {	//This will be age to whatever we set
		this.age = age;
		frogsCreated++;
		id = "Frog" + frogsCreated;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getFrogsCreated() {
		return frogsCreated;
	}
	
	public String toString() {
		return id + " is " + age + " years old.";
	}
}
