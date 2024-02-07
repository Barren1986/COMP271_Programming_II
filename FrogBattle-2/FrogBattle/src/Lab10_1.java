import frogs.Frog;
import frogs.FrogArmy;

public class Lab10_1 {

	public static void main(String[] args) {
		//Create my army with 100 frogs
		FrogArmy myArmy = new FrogArmy(100);
		
		//Display size and average age
		System.out.println("My army size: " + myArmy.getFrogArmy().length);
		System.out.println("The average age of my army is: " + myArmy.getAverageAge());
		
		//Display frog count
		System.out.println("Number of Frogs: " + Frog.getFrogsCreated());
		
		//Create my army with 200 frogs
		FrogArmy yourArmy = new FrogArmy(200);
		
		//Display size and average age
		System.out.println("My army size: " + yourArmy.getFrogArmy().length);
		System.out.println("The average age of your army is: " + yourArmy.getAverageAge());
		
		//Display frog count
		System.out.println("Number of Frogs: " + Frog.getFrogsCreated());
		
		//Print ages of myArmy
		Frog[] temp = myArmy.getFrogArmy();
		
		System.out.println("My Army Ages:");
		for(int i =0; i<temp.length; i++) {
			Frog tempFrog = temp[i];
			if(i!= 0) {
				System.out.print(" ");
				
				if(i%20 == 0) {
					System.out.println();
				}
			}
			
	
			System.out.print(tempFrog.getAge());
		}
				
		
		
	}
}
