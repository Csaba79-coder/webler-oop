package model;

import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private Student student;
    private List<Student> students; // List<T> students; -> T = type
    private ArrayList<Student> models;
    private Student[] studs;

    // default constructor (ha nincs paraméteres, van autómatikusan, ha van, ezt létre kell hozni!)
    public School() {

    }

    // paraméteres konstruktor
    public School(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School [name=" + getName() + "]"; // getName() helyett this.name is lehet
    }
}
