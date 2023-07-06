package studentExercises.farm.src.farm;

import java.util.ArrayList;
import java.util.List;

public class Farmer {
    private final List<Animal> animals;
    private Farm farm;

    public List<Animal> getAnimals() {
        return animals;
    }

    public Farmer()
    {
        animals=new ArrayList<>();
        farm=new Farm();
    }
    public void makeAnimalMove(Animal animal) {
        animal.move();
    }
    public void requestAnimal(AnimalType animalType) {
        this.animals.add(farm.provideAnimal(animalType));
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "animals=" + animals +
                '}';
    }
}
