module org.example.employeemanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.employeemanagement to javafx.fxml;
    exports org.example.employeemanagement;
}