module com.datasheet.proyectofichatecnicait {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.persistence;


    opens com.datasheet to javafx.fxml;
    exports com.datasheet;
}