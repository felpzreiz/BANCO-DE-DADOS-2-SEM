package classes;

import java.util.Scanner;

public class Turma {
    private String nome;
    private int idade;
    private String materiaFavorita;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMateriaFavorita(String materiaFavorita) {
        this.materiaFavorita = materiaFavorita.toUpperCase();
    }

    public String getMateriaFavorita() {
        return materiaFavorita;
    }

    public String apresentar() {
        String apresentacao = ("Meu nome é " + nome + ", e eu irei falar sobre " + materiaFavorita);
        switch (materiaFavorita) {
            case "GEOGRAFIA":
                return (apresentacao + ". A Rússia é o maior país do mundo!");

            case "MATEMÁTICA":
                return (apresentacao + ". Se x = 2, então x ao quadrado é 4");

            case "PORTUGUÊS":
                return (apresentacao + ". Verbos são palavras que indicam ações.");

            default:
                return ("Matéria não estudada.");
        }
    }
}
