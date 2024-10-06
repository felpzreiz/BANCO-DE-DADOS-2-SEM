package classes;

import java.util.Scanner;

public class Missa {
    private String nome;
    private int idade;
    private String santo;
    private double dizimo;

    public void setSanto(String santo) {
        this.santo = santo;
    }

    public void orar(){
        System.out.println(santo + ", rogai por nós. Amém");
    }

    public void entregarDizimo(double valor){
        this.dizimo = this.dizimo + valor;
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Missa fiel = new Missa();

        System.out.print("Digite o santo do qual é o fiel devoto: ");
        fiel.setSanto(sc.next());

        System.out.println("Deseja iniciar uma oração?" +
                "\n1 - SIM" +
                "\n2 - NÃO");

        if (sc.nextInt() == 1){
            fiel.orar();
        }else{
            System.out.print("NÃO");
        }
    }
}
