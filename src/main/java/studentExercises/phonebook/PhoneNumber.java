package studentExercises.phonebook;

import java.util.Objects;

public class PhoneNumber implements Cloneable{

    private int AreaCode;
    private int number;

    public PhoneNumber(int areaCode, int number) {
        this.AreaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return AreaCode;
    }

    public void setAreaCode(int areaCode) {
        AreaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return AreaCode == that.AreaCode && number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(AreaCode, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "AreaCode=" + AreaCode +
                ", number=" + number +
                '}';
    }

    @Override
    protected PhoneNumber clone()
    {
        try {
            return (PhoneNumber) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }
    }

    public int compareTo(PhoneNumber ph)
    {
        int result = Integer.compare(AreaCode, ph.AreaCode);
        if(result == 0)
        {
            return Integer.compare(number, ph.number);
        }
        else{
            return result;
        }
    }

}
