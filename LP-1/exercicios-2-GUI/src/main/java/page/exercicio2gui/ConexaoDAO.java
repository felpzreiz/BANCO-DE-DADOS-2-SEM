package page.exercicio2gui;

import java.sql.*;

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

    public static String getCachorro(Statement stm) {
        String nomeCachorro = "";
        try {
            ResultSet result = stm.executeQuery("SELECT nome FROM matilha ORDER BY id DESC LIMIT 1");
            while (result.next()) { // result.next() roda enquanto existirem dados no banco.
                String nome = result.getString("nome");

                nomeCachorro = nome;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nomeCachorro; //
    }

    public static Double getDizimo(Statement stm) {
        Double totalDizimo = 0.0;
        try {
            ResultSet result = stm.executeQuery("SELECT SUM(valor) AS soma FROM missa");
            while (result.next()) { // result.next() roda enquanto existirem dados no banco.
                Double dizimo = Double.parseDouble(result.getString("soma"));

                totalDizimo = dizimo;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalDizimo; //
    }
}
