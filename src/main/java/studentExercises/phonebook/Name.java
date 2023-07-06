package studentExercises.phonebook;

import java.util.Objects;

public class Name implements Cloneable{

    private String prefix;
    private String firstName;
    private String lastName;

    public Name(String prefix, String firstName, String lastName) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Name newMr(String firstName, String lastName){
        return new Name("Mr", firstName,lastName);
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(prefix, name.prefix) && Objects.equals(firstName, name.firstName) && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Name{" +
                "prefix='" + prefix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    protected Name clone()
    {
        try {
            return (Name) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }
    }

    public int compareTo(Name name) {
        int pre =  prefix.compareTo(name.prefix);
        int first = firstName.compareTo(name.firstName);
        int last = lastName.compareTo(name.lastName);
        if(pre != 0 || first != 0 || last != 0)
        {
            return -1;
        }
        else
            return 0;
    }
}
