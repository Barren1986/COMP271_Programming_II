package frogs;

public class FrogArmy {

		private Frog[] frogArmy;
		private int retreatAmount;
		private int killedFrogs=0;
		
		public FrogArmy (int frogCount, String army, int retreatAmount, Frog frog) {
			frogArmy = new Frog[frogCount];
			this.retreatAmount=retreatAmount;
			
			//add instances of Frog to the array
			for(int i=0; i<frogArmy.length; i++) {
				int random = (int)(Math.random() * (100 - 1 + 1)) + 1;
				
				if(frog instanceof DartFrog) {
					frogArmy[i] = new DartFrog(random, army);
				}
				else
				frogArmy[i] = new Frog(random, army);
			}
		}
		public void attack(int attackerIndex, FrogArmy attackedArmy, int attackedFrogIndex) {
			Frog[] attackedFrogs = attackedArmy.getFrogArmy();
			Frog attackedFrog = attackedFrogs[attackedFrogIndex];
			Frog attackingFrog = frogArmy[attackerIndex];
			
			//Determine damage
			int randomDamage= (int)(Math.random()* (attackedFrog.getHealth()-1)) + 1;
			if(attackingFrog instanceof DartFrog) {
				randomDamage += ((DartFrog)attackingFrog).getPoisonLevel();
				
			}
			attackedFrog.damage(randomDamage);
			
			if(attackedFrog.isDead()){
				System.out.println(attackingFrog + " from " + attackingFrog.getArmy() + " has killed " + attackedFrog + " from " + attackedFrog.getArmy());
				attackedArmy.increaseKilledFrogs();
			}
		}
		public void increaseKilledFrogs() {
			 killedFrogs ++;
		}
		public boolean shouldArmyRetreat() {
			if(frogArmy.length - killedFrogs <= retreatAmount)
				return true;
			else
				return false;
		}
		
		

		public Frog[] getFrogArmy() {
			return frogArmy;
		}
		public double getAverageAge() {
			double totalAge = 0;
			
			for(int i =0; i<frogArmy.length; i++) {
				totalAge += frogArmy[i].getAge();
			}
			
			return totalAge/frogArmy.length;
		}
}
