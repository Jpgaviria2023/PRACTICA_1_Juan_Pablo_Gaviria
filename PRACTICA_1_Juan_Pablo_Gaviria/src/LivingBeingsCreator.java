import BeingsOfTheEarth.*;
import SkyBeings.*;
import java.util.Scanner;

public class LivingBeingsCreator implements Creator {
    private Scanner scanner;

    public LivingBeingsCreator() {
        this.scanner = new Scanner(System.in);
    }

    public LivingBeing createBeing() {
        System.out.println("¿Qué tipo de ser vivo quieres crear? (earth/sky/human)");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("earth")) {
            Dog terrestre = new Dog();
            terrestre.born();
            terrestre.grow();
            terrestre.respawn();
            terrestre.die();
            return terrestre;

        } else if (type.equalsIgnoreCase("sky")) {
            Angel aereo = new Angel();
            aereo.fly();
            aereo.changeDimension();
            return aereo;

        } else if (type.equalsIgnoreCase("human")) {
            Human humano = new Human();
            humano.born();
            humano.grow();
            humano.respawn();
            humano.reproduce();
            humano.fly();
            humano.changeDimension();
            humano.die();
            return humano;
        }

        return null;
    }

    public static void main(String[] args) {
        LivingBeingsCreator creator = new LivingBeingsCreator();
        LivingBeing newBeing = creator.createBeing();
        System.out.println("Se ha creado un ser vivo: " + newBeing);
    }

}
