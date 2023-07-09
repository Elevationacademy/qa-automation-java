package streams;

import reflections.Dog;
import reflections.Person;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 90; i++) {
            persons.add(Person.getRandom());
        }

        Stream count = persons.stream().filter(person -> person.getWeight() > 100)
                .filter(person -> person.getAge()<50).limit(5);


    }

    public static void teardown(){
        TearDownManager tearDownManager = new TearDownManager();
        //create user
        tearDownManager.addTask(()-> {System.out.println("Delete user");});
        //Login
        //Create shopping cart
        tearDownManager.addTask(()-> {System.out.println("Clear cart");});
        //Add items
        tearDownManager.addTask(()-> {System.out.println("remove items");});
        tearDownManager.runAll();
    }
}
