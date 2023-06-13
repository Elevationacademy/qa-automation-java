package objects.staticFactories;

public class Tank extends Vehicle{
    public Tank(int id) {
        super(id);
    }

    public void shoot(){
         System.out.println("Shooting!");
     }
}




