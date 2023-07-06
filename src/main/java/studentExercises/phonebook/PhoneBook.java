package studentExercises.phonebook;

import java.util.ArrayList;

public class PhoneBook {

    private String name;
    private ArrayList<Contact> contact;

    public PhoneBook(String name, ArrayList<Contact> contact) {
        this.name = name;
        this.contact = new ArrayList<Contact>();
    }
}
