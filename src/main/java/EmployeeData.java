import java.sql.*;
import java.util.ArrayList;

public class EmployeeData {
    private static final String URL = "jdbc:postgresql://localhost:5432/employee_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "dataqwe665808";

    Connection conn;
    public Connection connect() throws SQLException {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            if(conn != null) {
                System.out.println("Connected to Database.");
            }
            return conn;
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
        return conn;
    }

    public void createEmployee(Employee employee) {
        String sql = "INSERT INTO employee(name, position, salary, hireDate) VALUES (?, ?, ?, ?)";
        try{
            Connection conn = this.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPosition());
            ps.setDouble(3, employee.getSalary());
            ps.setDate(4, employee.getHireDate());
            ps.executeUpdate();
            System.out.println("Employee created");
        } catch(SQLException e){
            System.out.println(e.toString());
        }
    }

    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        try{
            Connection conn = this.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("position"),
                        rs.getFloat("salary"),
                        rs.getDate("hireDate")
                );
            }
        } catch(SQLException e){
            System.out.println(e.toString());
        }
        return null;
    }

    public ArrayList<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employee";
        ArrayList<Employee> employees = new ArrayList<>();
        try(Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                employees.add(new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("position"),
                        rs.getFloat("salary"),
                        rs.getDate("hireDate")));
            }
        } catch(SQLException e){
            System.out.println(e.toString());
        }
        return employees;
    }

    public void updateEmployee(Employee employee) {
        String sql = "UPDATE employee SET name = ?, position = ?, hireDate = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPosition());
            ps.setDouble(3, employee.getSalary());
            ps.setDate(4, new java.sql.Date(employee.getHireDate().getTime()));
            ps.setInt(5, employee.getId());
            ps.executeUpdate();
            System.out.println("Employee updated");

        } catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        try(Connection conn = this.connect();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Employee deleted");
        } catch(SQLException e){
            System.out.println(e.toString());
        }
    }
}
