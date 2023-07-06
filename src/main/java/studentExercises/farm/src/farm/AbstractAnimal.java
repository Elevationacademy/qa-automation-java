package studentExercises.farm.src.farm;

import java.util.concurrent.ThreadLocalRandom;

abstract class AbstractAnimal implements Animal {
    private static int idCounter = 1;
    private final int id;
    private final String gender;
    private final double weight;

    protected AbstractAnimal(String gender, double weight) {
        this.id = idCounter++;
        this.gender = gender;
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("Animal with ID " + id + " is moving.");
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ',';
    }


}