package page.exercicio2gui;

import classes.Missa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MissaController {
    Missa fiel = new Missa();

    @FXML
    private Button define_Santo;

    @FXML
    private TextField txt_1;

    @FXML
    private TextField txt_2;

    @FXML
    private Button define_dizimo;

    @FXML
    private Button reza;

    @FXML
    private Label message;

    @FXML
    private Label oracao;

    @FXML
    void definirSanto(ActionEvent event) {
        fiel.setSanto(txt_1.getText());
    }

    @FXML
    void definirDizimo(ActionEvent event) {
        fiel.entregarDizimo(Double.parseDouble(txt_2.getText()));
        message.setVisible(true);
    }

    @FXML
    void rezar(ActionEvent event) {
        oracao.setText(fiel.orar());
    }
}
