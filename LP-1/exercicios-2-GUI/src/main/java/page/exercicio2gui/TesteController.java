package page.exercicio2gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TesteController{

    @FXML
    private TextField txt_1;

    @FXML
    private TextField txt_2;

    @FXML
    private Button somar;

    @FXML
    private Label label_1;

    @FXML
    void somar(ActionEvent event) {
        int numeroInteiro = Integer.parseInt(txt_1.getText()) + Integer.parseInt(txt_2.getText());
        label_1.setText(String.valueOf(numeroInteiro));
        label_1.setVisible(true);
    }

}

