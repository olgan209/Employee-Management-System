import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        Employee newEmployee1 = new Employee("Emir", "Developer", 3000.0, new Date(2024,10,21));
        employeeData.createEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Aman", "Developer", 4000.0, new Date(2024,10,26));
        employeeData.createEmployee(newEmployee2);
        Employee newEmployee3 = new Employee("Daniel", "Developer", 3000.0, new Date(2024,10,26));
        employeeData.createEmployee(newEmployee3);
        Employee newEmployee4 = new Employee("Kris", "Developer", 1000.0, new Date(2024,10,26));
        employeeData.createEmployee(newEmployee4);

        Employee employee = employeeData.getEmployeeById(1);
        System.out.println(employee);

        ArrayList<Employee> list = employeeData.getAllEmployees();
        System.out.println("Employee list" + list);

        newEmployee1.setName("Timur");
        newEmployee1.setSalary(9000.0);
        employeeData.updateEmployee(newEmployee1);
        list = employeeData.getAllEmployees();
        System.out.println("Updated employee list" + list);

        employeeData.deleteEmployee(4);
    }
}
//Delete an employee from the database using deleteEmployee().