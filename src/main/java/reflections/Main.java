package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        getNewAndPrint(Cat.class);
    }

    public static <T extends Name> T getNewAndPrint(Class<T> clz){
        try {
            Constructor<T> constructor = clz.getConstructor(String.class);
            T the_dog = constructor.newInstance("The dog");
            System.out.println(the_dog);
            return the_dog;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printYossiWithReflections(){
        Person yossi = new Person(20, "Yossi", 99.9);
        Class<? extends Person> aClass = yossi.getClass();
        System.out.println(aClass.getName());
        try {
            System.out.println(aClass.getMethods()[0].invoke(yossi));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}
