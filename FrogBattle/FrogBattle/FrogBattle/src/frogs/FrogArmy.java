package frogs;

import java.util.ArrayList;

public class FrogArmy {

    // private Frog[] frogArmy;
    private final ArrayList<Frog> frogArmy = new ArrayList<Frog>();
    private final int retreatAmount;
    //private int killedFrogs=0;

    public FrogArmy(int frogCount, String army, int retreatAmount, Frog frog) {    //Size 0, did not create Frog yet
        //frogArmy = new Frog[frogCount];
        this.retreatAmount = retreatAmount;

        for (int i = 0; i < frogCount; i++) {
            int randomAge = (int) (Math.random() * (100 - 1 + 1)) + 1;

            if (frog instanceof DartFrog) {
                //frogArmy[i] = new DartFrog(random, army);
                frogArmy.add(new DartFrog(randomAge, army));
            } else
                //frogArmy[i] = new Frog(random, army);
                frogArmy.add(new Frog(randomAge, army));
        }
    }

    public void attack(int attackerIndex, FrogArmy attackedArmy, int attackedFrogIndex) {
        //Get attacked Frog
        Frog[] attackedFrogs = attackedArmy.getFrogArmy();
        Frog attackedFrog = attackedFrogs[attackedFrogIndex];

        //Get attacking Frog
        //Frog attackingFrog = frogArmy[attackerIndex];
        Frog attackingFrog = frogArmy.get(attackerIndex);

        //Determine damage
        int randomDamage = (int) (Math.random() * (attackedFrog.getHealth() - 1)) + 1;
        if (attackingFrog instanceof DartFrog) {
            randomDamage += ((DartFrog) attackingFrog).getPoisonLevel();

        }
        attackedFrog.damage(randomDamage);

        if (attackedFrog.isDead()) {
            System.out.println(attackingFrog + " from " + attackingFrog.getArmy() + " has killed " + attackedFrog + " from " + attackedFrog.getArmy());
            //attackedArmy.increaseKilledFrogs();
            attackedArmy.removeDeadFrog(attackedFrogIndex);
        }
    }
    //public void increaseKilledFrogs() {
    //killedFrogs ++)

    private void removeDeadFrog(int attackedFrogIndex) {
        frogArmy.remove(attackedFrogIndex);
    }

    public boolean shouldArmyRetreat() {
        //if(frogArmy.size() - killedFrogs <= retreatAmount)
        return frogArmy.size() < retreatAmount;
    }


    public Frog[] getFrogArmy() {
        //return frogArmy;

        //Converts ArrayList to an Array
        Frog[] frogArray = new Frog[frogArmy.size()];
        frogArmy.toArray(frogArray);

        return frogArray;

    }

    public double getAverageAge() {
        double totalAge = 0;

        for (int i = 0; i < frogArmy.size(); i++) {
            //totalAge += frogArmy[i].getAge();
            totalAge += frogArmy.get(i).getAge();
        }

        //return totalAge/frogArmy.length;
        return totalAge / frogArmy.size();
    }
}
