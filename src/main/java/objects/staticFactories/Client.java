package objects.staticFactories;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.newTankOrRaceCar();
        System.out.println(vehicle);
    }
}
