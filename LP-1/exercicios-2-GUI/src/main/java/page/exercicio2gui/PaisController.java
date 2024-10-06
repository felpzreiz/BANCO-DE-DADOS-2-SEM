package page.exercicio2gui;

import classes.Paises;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PaisController {
    Paises pais = new Paises("Angola", 355.9, 106.8, 124.7);

    @FXML
    private TextField txt_2;

    @FXML
    private Button somar;

    @FXML
    private Label label_1;

    @FXML
    void somar(ActionEvent event) {
        double pib = Integer.parseInt(txt_2.getText());
        pais.setPib(pib);
        label_1.setText(String.valueOf(pais.pibPerCapta()));
        label_1.setVisible(true);
    }

}
