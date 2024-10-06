package page.exercicio2gui;

import classes.Time;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TimeController {
    Time time = new Time();

    @FXML
    private Label labelPontos;

    @FXML
    private Label labelPontosDefinido;

    @FXML
    private Button define_libero;

    @FXML
    private Label labelLibDefinido;

    @FXML
    private TextField txt_1;

    @FXML
    private TextField txt_2;

    @FXML
    private Button torcer;

    @FXML
    private Button define_nome1;

    @FXML
    private Label labelLibero;

    @FXML
    private Label labelTorcer;

    @FXML
    void definirNome(ActionEvent event) {
        time.setLibero(txt_1.getText());
        labelLibDefinido.setVisible(true);
        labelLibDefinido.setText(time.getLibero());
    }

    @FXML
    void definirPontos(ActionEvent event) {
        time.setPontos(Integer.parseInt(txt_2.getText()));
        labelPontosDefinido.setVisible(true);
        labelPontosDefinido.setText(String.valueOf(time.getPontos()));
    }

    @FXML
    void torcer(ActionEvent event) {
        labelTorcer.setVisible(true);
        labelTorcer.setText(time.torcer());
    }

}

