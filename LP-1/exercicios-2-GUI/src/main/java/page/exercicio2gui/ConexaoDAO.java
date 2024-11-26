package page.exercicio2gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDAO {
    public static Statement conectarBanco() throws SQLException {
        Conexao conexao = new Conexao();
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ex2",
                "usuario", "1234");
        ;
        conexao.conexaoBD();
        Statement stm = con.createStatement();
        return (stm);
    }

    public static void inserirCachorro(Statement stm, String nome) {
        String insereCachorro = "INSERT INTO matilha(nome) VALUES ('" + nome + "')";

        try {
            stm.executeUpdate(insereCachorro);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirSanto(Statement stm, String nome, Double dizimo) {
        String insereSanto = "INSERT INTO missa(santo, valor) VALUES ('" + nome + "','" + dizimo + "')";

        try {
            stm.executeUpdate(insereSanto);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirTorcida(Statement stm, String nome, String time) {
        String insereTorcida = "INSERT INTO torcida(torcedor, time) VALUES ('" + nome + "','" + time + "')";

        try {
            stm.executeUpdate(insereTorcida);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirEquipe(Statement stm, String nome, String cla, String elemento) {
        String insereEquipe = "INSERT INTO equipe(nome, cla, elemento) VALUES ('" + nome + "','" + cla + "','" + elemento + "')";

        try {
            stm.executeUpdate(insereEquipe);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
