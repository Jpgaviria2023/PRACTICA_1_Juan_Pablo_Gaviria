package BeingsOfTheEarth;

import SkyBeings.SkyBeing;

public class Human extends LivingBeing implements EarthBeing, SkyBeing {

    public void born() {
        System.out.println("Human born.");
    }

    public void grow() {
        System.out.println("Human grow.");
    }

    public void respawn() {
        System.out.println("Human respawn.");
    }

    public void die() {
        System.out.println("Human die.");
    }

    public void fly() {
        System.out.println("Human fly.");
    }

    public void changeDimension() {
        System.out.println("Human change dimension.");
    }
}

