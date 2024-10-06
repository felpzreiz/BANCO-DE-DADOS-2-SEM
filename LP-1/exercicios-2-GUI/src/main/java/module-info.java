module page.exercicio2gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens page.exercicio2gui to javafx.fxml;
    exports page.exercicio2gui;
}