package Factory;

import java.util.Objects;

//name,lastname,age,phonenumbeer,mutahasis,where live
public class Staff {
    private String name;
    private String lastName;
    private int age;
    private int phoneNumber;
    private String specialist;
    private String proffesion;

    public Staff(String fabName, String address, int phoneNumber){}

    public Staff(String name, String lastName, int age, int phoneNumber, String specialist, String proffesion) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.specialist = specialist;
        this.proffesion = proffesion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return age == staff.age && phoneNumber == staff.phoneNumber && Objects.equals(name, staff.name) && Objects.equals(lastName, staff.lastName) && Objects.equals(specialist, staff.specialist) && Objects.equals(proffesion, staff.proffesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, phoneNumber, specialist, proffesion);
    }
}
