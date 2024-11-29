package main.java.org.example.employeemanagement;

public class FullTimeEmployee extends Employee{
    private double annualSalary;

    FullTimeEmployee(String name, double annualSalary) {
        super(name, "Full Time Employee");
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateSalary() { return annualSalary; }
}
