package page.exercicio2gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class InitialController {

    @FXML
    private Button botao_torcida;

    @FXML
    private Button botao_missa;

    @FXML
    private Button botao_colmeia;

    @FXML
    private Button botao_pais;

    @FXML
    private Button botao_equipe;

    @FXML
    private Button bota_matilha;

    @FXML
    private Button botao_horda;

    @FXML
    private Button botao_turma;

    @FXML
    private Button botao_banda;

    @FXML
    private Button botao_time;

    @FXML
    protected void abrirPais() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Pais.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Classe Pais");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void abrirMatilha() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Matilha.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Classe Matilha");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void abrirTime() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Time.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Classe Time");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void abrirTurma() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Turma.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Classe Turma");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void abrirBanda() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Banda.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Classe Banda");
        stage.setScene(scene);
        stage.show();
    }
}

