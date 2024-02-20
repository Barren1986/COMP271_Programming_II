import frogs.Frog;

public class Lab9_1 {

    public static void main(String[] args) {
        //create frog 1
        Frog frog1 = new Frog();
        int random = (int) (Math.random() * (100 - 1 + 1)) + 1;
        Frog frog2 = new Frog(random);
        System.out.println(frog1);
        System.out.println(frog2);
        double average = ((double) frog1.getAge() + frog2.getAge()) / Frog.getFrogsCreated();
        System.out.println("The average age of the frogs is " + average);
    }

}
