module com.example.javafxsimplecomponents {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsimplecomponents to javafx.fxml;
    exports com.example.javafxsimplecomponents;
    exports com.example.javafxsimplecomponents.controllers;
    opens com.example.javafxsimplecomponents.controllers to javafx.fxml;
}