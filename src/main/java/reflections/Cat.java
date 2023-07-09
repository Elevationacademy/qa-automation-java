package reflections;

public class Cat extends Name{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "This is a cat: " + getName();
    }
}
