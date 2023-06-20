package objects.staticFactories;

public class RaceCar extends Vehicle {

    protected RaceCar(int id, double speed, double weight) {
        super(id, speed, weight);
    }


    public void goFast() {
        System.out.println("Vrooooom!");
    }
}
