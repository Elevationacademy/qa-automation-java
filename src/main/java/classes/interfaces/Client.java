package classes.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());
        for (Animal animal : animals) {
            animal.move();
        }

    }
}
