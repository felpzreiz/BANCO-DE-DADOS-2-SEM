package page.exercicio2gui;

import classes.Colmeia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ColmeiaController {
    Colmeia abelha = new Colmeia();

    @FXML
    private Label funcao;

    @FXML
    private Label idade;

    @FXML
    private Label total;

    @FXML
    private Label prod;

    @FXML
    private Button botaoFuncao;

    @FXML
    private TextField txt_1;

    @FXML
    private TextField txt_2;

    @FXML
    private Button botaoIdade;

    @FXML
    private Button botaoProd;

    @FXML
    private Label label_1;

    @FXML
    private TextField txt_3;

    @FXML
    private Button calcular;

    @FXML
    void defineFuncao(ActionEvent event) {
        abelha.setFuncao(txt_1.getText());
        funcao.setText(abelha.getFuncao());
        funcao.setVisible(true);
    }

    @FXML
    void defineIdade(ActionEvent event) {
        abelha.setIdade(Integer.parseInt(txt_2.getText()));
        idade.setText(String.valueOf(abelha.getIdade()));
        idade.setVisible(true);
    }

    @FXML
    void defineProd(ActionEvent event) {
        abelha.setProducaoDia(Integer.parseInt(txt_3.getText()));
        prod.setText(String.valueOf(abelha.getProducaoDia()));
        prod.setVisible(true);
    }

    @FXML
    void calcularTotal(ActionEvent event) {
        total.setText(String.valueOf(abelha.prodTotal()));
        total.setVisible(true);
    }
}
