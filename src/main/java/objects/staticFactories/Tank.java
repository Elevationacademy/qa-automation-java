package objects.staticFactories;

public class Tank extends Vehicle{


    protected Tank(int id, double speed, double weight) {
        super(id, speed, weight);
    }

    public static Tank fromRaceCar(RaceCar car){
        return new Tank(car.getId(),car.getSpeed(), car.getWeight());
    }
    public void shoot(){
         System.out.println("Shooting!");
     }

    @Override
    public String toString() {
        return "Tank{" +
                "id=" + id +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}




