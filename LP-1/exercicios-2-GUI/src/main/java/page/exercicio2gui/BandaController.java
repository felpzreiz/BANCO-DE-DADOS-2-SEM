package page.exercicio2gui;

import classes.Banda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BandaController {
    Banda membro = new Banda();

    @FXML
    private Button botao_tocar;

    @FXML
    private Button define_instrumento;

    @FXML
    private Label label_3;

    @FXML
    private TextField txt_1;

    @FXML
    private Label label_nome;

    @FXML
    private Label label_inst;

    @FXML
    private Button define_nome;

    @FXML
    private TextField txt_2;

    @FXML
    private Label label_2;

    @FXML
    private Label label_1;

    @FXML
    private Label label_som;

    @FXML
    void definirNome(ActionEvent event) {
        membro.setNome(txt_1.getText());
        label_3.setText(String.valueOf(membro.getNome()));
        label_3.setVisible(true);
    }

    @FXML
    void definirInstrumento(ActionEvent event) {
        int inst = Integer.parseInt(txt_2.getText());
        membro.setInstrumento(inst);
        label_2.setText(String.valueOf(membro.getInstrumento()));
        label_2.setVisible(true);
    }

    @FXML
    void tocar(ActionEvent event) {
        label_1.setText(String.valueOf(membro.tocar()));
        label_1.setVisible(true);
    }

}
