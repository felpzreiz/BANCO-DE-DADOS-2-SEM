module page.exercicio2gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens page.exercicio2gui to javafx.fxml;
    exports page.exercicio2gui;
}