package org.mikel.dein_jasper_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación que extiende {@link Application}.
 * Inicia la interfaz gráfica para la visualización de informes.
 */
public class InformeApplication extends Application {

    /**
     * Metodo de inicio de la aplicación JavaFX.
     * Carga la interfaz desde el archivo FXML y configura la escena principal.
     *
     * @param stage la ventana principal de la aplicación.
     * @throws IOException si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/informe.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Informes");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * Metodo principal que lanza la aplicación JavaFX.
     *
     * @param args argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
