package classes.abstractClass;

public class Cow extends Animal{

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("This animal is a cow");
    }
}
