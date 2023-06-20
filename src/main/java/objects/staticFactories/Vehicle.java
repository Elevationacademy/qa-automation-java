package objects.staticFactories;

import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {
    protected final int id;
    protected double speed;
    protected double weight;


    protected Vehicle(int id, double speed, double weight) {
        this.id = id;
        this.speed = speed;
        this.weight = weight;
    }

    public static Vehicle newTankOrRaceCar() {
        int id = ThreadLocalRandom.current().nextInt(100);
        double speed = ThreadLocalRandom.current().nextDouble(200);
        double weight = ThreadLocalRandom.current().nextDouble(9999);
        if(ThreadLocalRandom.current().nextBoolean()){
            return new Tank(id,speed,weight);
        }else{
            return new RaceCar(id, speed,weight);
        }
    }

    public static Vehicle newWithId(int id) {
        return new Vehicle(id, 0, 0);
    }

    public static Vehicle newRandom() {
        return new Vehicle(ThreadLocalRandom.current().nextInt(100),
                ThreadLocalRandom.current().nextDouble(200),
                ThreadLocalRandom.current().nextDouble(9999));
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", speed=" + speed +
                ", weight=" + weight +
                '}'+ this.getClass();
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

    public int getId() {
        return id;
    }
}
