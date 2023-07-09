package reflections;

import java.util.concurrent.ThreadLocalRandom;

public class Person {
    private int age;
    private String name;
    private double weight;

    public Person(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public static Person getRandom(){
        return new Person(
                ThreadLocalRandom.current().nextInt(99),
                "shuki",
                ThreadLocalRandom.current().nextDouble(30,230)
        );
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
