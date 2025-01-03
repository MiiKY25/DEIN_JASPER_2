package org.mikel.dein_jasper_2.controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

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

    }

    public void abrirInformePersonaCalculo(){

    }

    public void abrirInformePersonaSubinforme(){

    }

}
