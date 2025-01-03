package org.mikel.dein_jasper_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InformeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/informe.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(InformeApplication.class.getResource("fxml/informe.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Informes");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}