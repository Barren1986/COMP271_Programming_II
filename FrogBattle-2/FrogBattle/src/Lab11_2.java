import frogs.DartFrog;
import frogs.Frog;
import frogs.FrogArmy;

public class Lab11_2 {

	public static void main(String[] args) {
		FrogArmy chiefs = new FrogArmy (100, "Chiefs" , 10, new DartFrog());
		FrogArmy fortyniners = new FrogArmy (130, "49ers", 20, new Frog());
		
		int attackNum = 0;
		String winner = "";
		
		while(true) {
			int randomChiefFrog = (int)(Math.random() * chiefs.getFrogArmy().length);
			
			int randomFortyNiner = (int)(Math.random() * fortyniners.getFrogArmy().length);
			
			if(attackNum%2==0) 
				chiefs.attack(randomChiefFrog, fortyniners, randomFortyNiner);
				
				if(fortyniners.shouldArmyRetreat()) {
					System.out.println("The 49ers are retreating!");
					
					winner = "Chiefs";
					break;
				}
				
				else
					fortyniners.attack(randomFortyNiner, chiefs, randomChiefFrog);
				
				if(chiefs.shouldArmyRetreat()) {
					System.out.println("The Chiefs are retreating!");
					
					winner = "49ers";
					break;
			
		}

	}
	attackNum++;
	System.out.println("\nThe war has ended and the " + winner + " have triumphed!");
}
	
	
		
		

}