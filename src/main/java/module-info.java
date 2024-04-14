module com.example.smproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.smproject to javafx.fxml;
    exports com.example.smproject;
}