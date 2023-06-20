package classes.interfaces;

import java.io.Serializable;

public class Dog implements Animal, Cloneable {
    @Override
    public void move() {
        System.out.println("Dog is moving");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
