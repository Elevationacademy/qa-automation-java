package objects;

public class RaceCar extends Vehicle {
    public RaceCar(int id) {
        super(id);
    }

    public void goFast() {
        System.out.println("Vrooooom!");
    }
}
