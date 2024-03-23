package BeingsOfTheEarth;


public class Dog extends LivingBeing implements EarthBeing {
    public void born() {
        System.out.println("Dog born.");
    }

    public void grow() {
        System.out.println("Dog grow.");
    }

    public void respawn() {
        System.out.println("Dog respawn.");
    }

    public void die() {
        System.out.println("Dog die.");
    }

    public void setName() {
        System.out.println("Set name for Dog.");
    }
}

