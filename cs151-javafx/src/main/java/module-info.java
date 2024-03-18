module com.example.something {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.something to javafx.fxml;
    exports com.example.something;
}