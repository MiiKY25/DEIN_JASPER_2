module org.mikel.dein_jasper_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.mikel.dein_jasper_2 to javafx.fxml;
    exports org.mikel.dein_jasper_2;
}