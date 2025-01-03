package org.mikel.dein_jasper_2.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.mikel.dein_jasper_2.bbdd.ConexionBBDD;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class InformeController {

    @FXML
    private ToggleGroup radioInforme;

    @FXML
    private RadioButton rdPersona;

    @FXML
    private RadioButton rdPersonaCalculo;

    @FXML
    private RadioButton rdPersonaSubinforme;

    @FXML
    void accionAceptar(ActionEvent event) {
        // Obtiene el RadioButton seleccionado
        RadioButton selectedRadio = (RadioButton) radioInforme.getSelectedToggle();

        if (selectedRadio == rdPersona) {
            abrirInformePersona();
        } else if (selectedRadio == rdPersonaCalculo) {
            abrirInformePersonaCalculo();
        } else {
            abrirInformePersonaSubinforme();
        }
    }

    @FXML
    void accionCancelar(ActionEvent event) {
        Stage stage = (Stage) rdPersona.getScene().getWindow();
        stage.close();
    }

    public void abrirInformePersona(){
        ConexionBBDD db;
        try {
            // Crear una nueva conexión a la base de datos
            db = new ConexionBBDD();

            // Cargar el archivo Jasper del informe
            InputStream reportStream = db.getClass().getResourceAsStream("/jasper/Personas.jasper");

            // Verificar si el archivo fue encontrado
            if (reportStream == null) {
                System.out.println("Archivo NO encontrado");
                return;
            }

            // Cargar el informe Jasper
            JasperReport report = (JasperReport) JRLoader.loadObject(reportStream);

            // Parámetros del informe (vacío si no necesitas pasar parámetros)
            Map<String, Object> parameters = new HashMap<>();

            // Llenar el informe con datos
            JasperPrint jprint = JasperFillManager.fillReport(report, parameters, db.getConnection());

            // Mostrar el informe
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setVisible(true);

        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos:");
            e.printStackTrace();
        } catch (JRException e) {
            System.err.println("Error al procesar el informe Jasper:");
            e.printStackTrace();
        }
    }

    public void abrirInformePersonaCalculo(){

    }

    public void abrirInformePersonaSubinforme(){

    }

}
