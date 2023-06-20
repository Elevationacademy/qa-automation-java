package classes.interfaces;

public class Cat implements Animal, HasFur{

    @Override
    public void move() {
        System.out.println("Cat is moving");

    }

    @Override
    public void sleep() {
        throw new RuntimeException("Cats can't sleep");
    }


    @Override
    public void groom() {
        System.out.println("prrrrrrrrrrrrr");
    }
}
