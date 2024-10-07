package page.exercicio2gui;

import classes.Horda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HordaController implements Initializable {
    Horda barbaro = new Horda();

    @FXML
    private Label labelPontos;

    @FXML
    private Button atacar;

    @FXML
    private Label labelForca;

    @FXML
    private ChoiceBox<String> povoChoiceBox;

    private String[] povo = {"ANGLO-SAXÃO", "SUEVO", "FRANCO"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        povoChoiceBox.getItems().addAll(povo);
        povoChoiceBox.setOnAction(this::getPovoChoice);
    }

    @FXML
    private Label labelAtaque;

    @FXML
    private GridPane ataque;

    @FXML
    private Label labelPovo;

    @FXML
    private TextField txt_2;

    @FXML
    private Button define_forca;


    @FXML
    void definirForca(ActionEvent event) {
        barbaro.setForca(Integer.parseInt(txt_2.getText()));
        labelForca.setText(String.valueOf(barbaro.getForca()));
        labelForca.setVisible(true);
    }

    @FXML
    void atacar(ActionEvent event) {
        labelAtaque.setText(barbaro.atacar());
    }

    void getPovoChoice(ActionEvent event) {
        String povo = povoChoiceBox.getValue();
        barbaro.setEtnia(povo);
        labelPovo.setText(povo);
        labelPovo.setVisible(true);
    }
}
