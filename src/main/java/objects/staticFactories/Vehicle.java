package objects.staticFactories;

public class Vehicle {
    private final int id;
    private double speed;
    private double weight;


    public Vehicle(int id) {
        this.id = id;
    }

    public void move() {
        System.out.println("I'm moving");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
