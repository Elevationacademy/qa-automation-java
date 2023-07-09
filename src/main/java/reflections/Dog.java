package reflections;

public class Dog extends Name{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "This is a dog: " + getName();
    }
}
