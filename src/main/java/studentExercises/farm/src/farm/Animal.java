package studentExercises.farm.src.farm;

public interface Animal {
    void move();
    String getGender();
    int getId();
    double getWeight();
    AnimalType getType();
    Animal mate(Animal partner);
}