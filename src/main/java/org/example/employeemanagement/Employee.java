package main.java.org.example.employeemanagement;

public abstract class Employee {
    public String name;
    public String type;

    Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() { return name; }
    public String getType() { return type; }

    abstract double calculateSalary();
}
