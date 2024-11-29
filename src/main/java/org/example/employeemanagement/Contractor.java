package main.java.org.example.employeemanagement;

public class Contractor extends Employee {
    private double hourlyRate;
    private int maxHours;

    public Contractor(String name, double hourlyRate, int maxHours){
        super(name, "Contractor");
        this.hourlyRate = hourlyRate;
        this.maxHours = maxHours;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * maxHours;
    }
}
