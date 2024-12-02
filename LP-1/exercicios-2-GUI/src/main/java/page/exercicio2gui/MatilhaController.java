package page.exercicio2gui;

import classes.Matilha;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.sql.Statement;

public class MatilhaController {
    Statement stm = ConexaoDAO.conectarBanco();

    Matilha cachorro = new Matilha();

    @FXML
    private Label labelNomeDefinido;

    @FXML
    private Button botao_latir;

    @FXML
    private Button botao_correr;

    @FXML
    private TextField txt_1;

    @FXML
    private Button define_nome;

    @FXML
    private Label labelNome;

    @FXML
    private Label labelNome2;

    @FXML
    private Label lastName;

    @FXML
    private Label labelCorrida;

    @FXML
    private Label labelLatido;

    public MatilhaController() throws SQLException {
    }

    public void initialize() throws SQLException {
        lastName.setText(ConexaoDAO.getCachorro(stm));
    }

    @FXML
    void definirNome(ActionEvent event) {
        cachorro.setNome(txt_1.getText());
        labelNomeDefinido.setText(cachorro.getNome());
        labelNomeDefinido.setVisible(true);
        if (txt_1.getText() != null) {
            ConexaoDAO.inserirCachorro(stm, txt_1.getText());
        }
    }

    @FXML
    void latir(ActionEvent event) {
        labelLatido.setVisible(true);
        labelLatido.setText(cachorro.latir());
    }

    @FXML
    void correr(ActionEvent event) {
        labelCorrida.setVisible(true);
        labelCorrida.setText(cachorro.correr());
    }
}