module org.mikel.dein_jasper_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires net.sf.jasperreports.core;

    opens org.mikel.dein_jasper_2.controladores to javafx.fxml;
    opens org.mikel.dein_jasper_2 to javafx.fxml;
    exports org.mikel.dein_jasper_2;
}