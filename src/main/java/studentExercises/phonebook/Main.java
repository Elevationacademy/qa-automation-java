package studentExercises.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Name name = Name.newMr("Ahmad", "Sharabati");
        PhoneNumber phoneNumber =new PhoneNumber(972, 537783971);
        Name name1 = Name.newMr("Ahmad", "Sharabati");
        PhoneNumber phoneNumber1 =new PhoneNumber(972, 537783971);
        Contact contact = new Contact(name, phoneNumber);
        Contact contact1 = new Contact(name1, phoneNumber1);


        Contact clone = contact.clone();
        clone.getName().setFirstName("Yossi");
//        System.out.println(contact);
//        System.out.println(contact1.compareTo(contact));
        System.out.println(contact);
        System.out.println(clone);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(clone);
        contacts.add(contact);
        contacts.add(contact1);
        Collections.sort(contacts);


    }
}
