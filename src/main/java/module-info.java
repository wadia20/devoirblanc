module com.example.devoirblanc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.devoirblanc to javafx.fxml;
    exports com.example.devoirblanc;
}