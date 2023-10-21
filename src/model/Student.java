package model;

public class Student {

    private String firstName;
    private String lastName;

    public Student() {
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // nested static class! static can be only nested! (not inner)
    public static class Hello {
        public void displayHello() {
            System.out.println("Hello");
        }
    }

    // inner class
    /*public class InnerClass {
        public void display() {
            System.out.println("Hello");
        }
    }*/

    public void printFullName() { // pl. ki jár órára, ki nem ... ilyet tudnék elképzelni
        System.out.println(getFirstName() + " " + getLastName());
    }

    public void attendingSchool() {
        System.out.println(getFirstName() + " " + getLastName() + " is attending school.");
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
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' + // vagy a this.firstName
                ", lastName='" + getLastName() + '\'' + // vagy a this.lastName
                '}';
    }
}
