package models;

public class Golfer {
    private String firstName;
    private String lastName;
    private int age;
    private int id;

    public Golfer(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
    }

    public Golfer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
