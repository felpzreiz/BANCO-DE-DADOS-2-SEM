package page.exercicio2gui;

import classes.Torcida;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TorcidaController {
    Torcida torcedor = new Torcida();

    @FXML
    private Label labelNomeDefinido;

    @FXML
    private Button botao_torcer;

    @FXML
    private Label labelTime;

    @FXML
    private TextField txt_1;

    @FXML
    private Label label_nome;

    @FXML
    private Button define_nome;

    @FXML
    private TextField txt_2;

    @FXML
    private Button define_Time;

    @FXML
    private Label labelTimeDefinido;

    @FXML
    private Label labelCanto;

    @FXML
    void definirNome(ActionEvent event) {
        torcedor.setNome(txt_1.getText());
        labelNomeDefinido.setText(torcedor.getNome());
        labelNomeDefinido.setVisible(true);
    }

    @FXML
    void definirTime(ActionEvent event) {
        torcedor.setTime(txt_2.getText());
        labelTimeDefinido.setText(torcedor.getTime());
        labelTimeDefinido.setVisible(true);
    }

    @FXML
    void tocar(ActionEvent event) {
        labelCanto.setVisible(true);
        labelCanto.setText(torcedor.cantar());
    }

}

