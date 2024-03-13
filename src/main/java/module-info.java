module com.example.core_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens DemoJava to javafx.fxml;
    exports DemoJava;
}