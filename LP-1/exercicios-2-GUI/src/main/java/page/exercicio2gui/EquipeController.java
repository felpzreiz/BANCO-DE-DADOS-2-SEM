package page.exercicio2gui;

import classes.Equipe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EquipeController implements Initializable{
    Equipe ninja = new Equipe();

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] cla =  {"Uzumaki", "Uchiha", "Hyuuga"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(cla);
        myChoiceBox.setOnAction(this::getClaChoice);

        ElementChoiceBox.getItems().addAll(elemento);
        ElementChoiceBox.setOnAction(this::getElementChoice);
    }

    public void getClaChoice(ActionEvent event) {
        String cla = myChoiceBox.getValue();
        labelCla.setText(cla);
        labelCla.setVisible(true);
    }

    @FXML
    private Label labelCla;

    @FXML
    private TextField txt_1;

    @FXML
    private Button define_nome;

    @FXML
    private Label labelNome;

    @FXML
    private ChoiceBox<String> ElementChoiceBox;
    private String[] elemento = {"Fogo", "Terra", "Água", "Raio", "Vento"};

    public void getElementChoice(ActionEvent event) {
        String elemento = ElementChoiceBox.getValue();
        labelElemento.setText(elemento);
        labelElemento.setVisible(true);
    }

    @FXML
    private Label labelElemento;

    @FXML
    void definirNome(ActionEvent event) {
        ninja.setNome(txt_1.getText());
        labelNome.setText(ninja.getNome());
        labelNome.setVisible(true);
    }

}
