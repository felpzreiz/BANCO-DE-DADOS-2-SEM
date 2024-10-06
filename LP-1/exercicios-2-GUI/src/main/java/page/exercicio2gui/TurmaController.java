package page.exercicio2gui;

import classes.Turma;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TurmaController {
    Turma aluno = new Turma();

    @FXML
    private Button botao_tocar;

    @FXML
    private Label labelDisciplina;

    @FXML
    private Label labelNomeDefinido;

    @FXML
    private TextField txt_1;

    @FXML
    private Button define_disciplina;

    @FXML
    private Label label_nome;

    @FXML
    private Button define_nome;

    @FXML
    private TextField txt_2;

    @FXML
    private Label labelApresentacao;

    @FXML
    private Label labelDisciplinaDefinida;

    @FXML
    void definirNome(ActionEvent event) {
        aluno.setNome(txt_1.getText());
        labelNomeDefinido.setText(aluno.getNome());
        labelNomeDefinido.setVisible(true);
    }

    @FXML
    void definirDisciplina(ActionEvent event) {
        aluno.setMateriaFavorita(txt_2.getText());
        labelDisciplinaDefinida.setText(aluno.getMateriaFavorita());
        labelDisciplinaDefinida.setVisible(true);
    }

    @FXML
    void tocar(ActionEvent event) {
        labelApresentacao.setVisible(true);
        labelApresentacao.setText(aluno.apresentar());
    }

}

