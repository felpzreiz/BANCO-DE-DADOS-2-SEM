package org.example;
import java.util.Scanner;

public class Atividade8 {
    Scanner ler = new Scanner(System.in);
    int num1;

    public void comparar(){
        if(num1 >= 0){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }
    }

    public static void main(String[] args) {
        Atividade8 teste = new Atividade8();

        System.out.println("INSIRA UM NÚMERO QUALQUER: ");
        teste.num1 = teste.ler.nextInt();

        teste.comparar();
    }
}
