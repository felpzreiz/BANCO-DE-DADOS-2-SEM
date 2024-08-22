package org.example;
import java.util.Scanner;

public class Atividade7 {
    Scanner ler = new Scanner(System.in);
    int num1;

    public void comparar(){
        if(num1 > 10){
            System.out.println("É MAIOR DO QUE 10!");
        }else{
            System.out.println("NÃO É MAIOR DO QUE 10!");
        }
    }

    public static void main(String[] args) {
        Atividade7 teste = new Atividade7();

        System.out.println("INSIRA UM NÚMERO QUALQUER: ");
        teste.num1 = teste.ler.nextInt();

        teste.comparar();
    }
}
