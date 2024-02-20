package frogs;

public class Frog {
    private final String id;
    private int age;
    private int health = 40;
    private final String army;
    private static int frogsCreated;

    public Frog() {
        this(4, "Basic");

    }

    public Frog(int age, String army) {
        this.age = age;
        this.army = army;

        frogsCreated++;
        id = "Frog" + frogsCreated;
    }

    public void damage(int damageAmount) {
        health -= damageAmount;
    }

    public boolean isDead() {
        return health <= 0;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getArmy() {
        return army;
    }

    public String toString() {
        return id;
    }
}
