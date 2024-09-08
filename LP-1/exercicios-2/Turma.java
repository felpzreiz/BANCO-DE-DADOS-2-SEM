package ex2;

import java.util.Scanner;

public class Turma {
    private String nome;
    private int idade;
    private String materiaFavorita;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMateriaFavorita(String materiaFavorita) {
        this.materiaFavorita = materiaFavorita.toUpperCase();
    }

    public void apresentar(){
        System.out.println("Meu nome é " + nome + ", e eu irei falar sobre " + materiaFavorita);
        switch (materiaFavorita){
            case "GEOGRAFIA":
                System.out.println("A Rússia é o maior país do mundo!");
                break;

            case "MATEMÁTICA":
                System.out.println("Se x = 2, então x ao quadrado é 4");
                break;

            case "PORTUGUÊS":
                System.out.println("Verbos são palavras que indicam ações.");
                break;

                default:
                    System.out.println("Matéria não estudada.");
                    break;
        }
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Turma aluno = new Turma();

        System.out.println("Insira seu nome: ");
        aluno.setNome(sc.next());

        System.out.println("""
                Insira sua matéria favorita:\
                
                Geografia, português ou matemática.""");

        aluno.setMateriaFavorita(sc.next());

        aluno.apresentar();
    }
}
