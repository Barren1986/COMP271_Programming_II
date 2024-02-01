import frogs.Frog;
import frogs.FrogArmy;

public class Lab10_1 {

	public static void main(String[] args) {
		// 1. Create myArmy with 100 frogs
		FrogArmy myArmy = new FrogArmy(100);
		
		// 2. Display the size and the average age of myArmy
		System.out.println("My army size: " + myArmy.getFrogArmy().length);
		System.out.println("My army average age: " + myArmy.getAverageAge());

		// 3. Display the total number of frogs created.
		System.out.println("Number of frogs: " + Frog.getFrogsCreated());
		
		// 4. Create yourArmy with 200 frogs.
		FrogArmy yourArmy = new FrogArmy(200);
		
		// 5. Display the size and average age of yourArmy.
		System.out.println("Your army size: " + yourArmy.getFrogArmy().length);
		System.out.println("You army average age: " + yourArmy.getAverageAge());
		
		// 6. Display the total number of frogs.
		System.out.println("The total number of frogs are: " + Frog.getFrogsCreated() );
		
		// 7. Print the ages of the myArmy frogs in columns of 20.
		Frog[] temp = myArmy.getFrogArmy();
		
		System.out.println("My Army Ages: ");
		for(int i = 0; i < temp.length; i++) {
			Frog tempFrog = temp[i];
			
			if(i != 0) {
				System.out.print(" ");
				
				if(i % 20 == 0) {
					System.out.println();
				}
			}
			
			System.out.print(tempFrog.getAge());
			
		}
	}

}
