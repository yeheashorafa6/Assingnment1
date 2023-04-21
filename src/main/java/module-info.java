module com.example.assingmnent1pro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assingmnent1pro to javafx.fxml;
    exports com.example.assingmnent1pro;
}