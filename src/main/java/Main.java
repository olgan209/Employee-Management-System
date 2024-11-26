import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        Employee newEmployee1 = new Employee("Emir", "Developer", 3000.0, new java.sql.Date(new GregorianCalendar(2024, Calendar.NOVEMBER, 21).getTimeInMillis()));
        employeeData.createEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Aman", "Developer", 4000.0, new java.sql.Date(new GregorianCalendar(2024, Calendar.NOVEMBER, 26).getTimeInMillis()));
        employeeData.createEmployee(newEmployee2);
        Employee newEmployee3 = new Employee( "Daniel", "Developer", 3000.0, new java.sql.Date(new GregorianCalendar(2024, Calendar.NOVEMBER, 26).getTimeInMillis()));
        employeeData.createEmployee(newEmployee3);
        Employee newEmployee4 = new Employee("Kris", "Developer", 1000.0, new java.sql.Date(new GregorianCalendar(2024, Calendar.NOVEMBER, 26).getTimeInMillis()));
        employeeData.createEmployee(newEmployee4);

        Employee employee = employeeData.getEmployeeById(1);
        System.out.println(employee);

        for(Employee emp : employeeData.getAllEmployees()){
            System.out.println("Employee list " + emp);
        }

        newEmployee1.setName("Timur");
        newEmployee1.setSalary(9000.0);
        employeeData.updateEmployee(newEmployee1);

        for(Employee emp : employeeData.getAllEmployees()){
            System.out.println("Employee list" + emp);
        }

        employeeData.deleteEmployee(4);
    }
}