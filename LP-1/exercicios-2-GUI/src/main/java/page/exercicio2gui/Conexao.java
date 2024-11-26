package page.exercicio2gui;

import java.sql.*;

public class Conexao {

    public void conexaoBD(){
        try {
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ex2",
                    "usuario", "1234"); // DRIVER E ACESSOS AO BANCO DE DADOS.
            if (conexao != null) {
                Statement stm = conexao.createStatement();
            }else{
                System.out.println("Erro ao conectar ao Banco de Dados!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
