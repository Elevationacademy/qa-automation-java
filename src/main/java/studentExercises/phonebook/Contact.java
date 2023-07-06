package studentExercises.phonebook;

import java.util.Objects;

public class Contact implements Cloneable, Comparable<Contact>{

    private Name name;
    private PhoneNumber phoneNumber;

    public Contact(Name name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name.toString() +
                ", phoneNumber=" + phoneNumber.toString() +
                '}';
    }

    @Override
    protected Contact clone() {
        return new Contact(name.clone(), phoneNumber.clone());
    }

    public int compareTo(Contact contact) {
        int result = name.compareTo(contact.name);
        if(result == 0)
        {
            return phoneNumber.compareTo(contact.phoneNumber);
        }
        else{
            return result;
        }
    }
}
