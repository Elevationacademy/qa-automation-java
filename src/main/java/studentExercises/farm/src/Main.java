package studentExercises.farm.src;

import studentExercises.farm.src.farm.AnimalType;
import studentExercises.farm.src.farm.Farmer;

public class Main {
    public static void main(String[] args) {
        Farmer farmer=new Farmer();
        farmer.requestAnimal(AnimalType.Dog);
        farmer.requestAnimal(AnimalType.Cow);
        farmer.requestAnimal(AnimalType.Horse);
        farmer.requestAnimal(AnimalType.Dog);
        farmer.requestAnimal(AnimalType.Horse);
        farmer.requestAnimal(AnimalType.Dog);
        farmer.requestAnimal(AnimalType.Cow);
        System.out.println(farmer);
        farmer.makeAnimalMove(farmer.getAnimals().get(4));
    }
}