package org.example;
import java.util.Scanner;

public class Atividade10{
    Scanner ler = new Scanner(System.in);
    double num1;
    double num2;

    public void calcular(){
        double media = (num1 + num2)/2;
        if(media < 6){
            System.out.println("Média final: " + media +"\nAluno REPROVADO!");
        }else{
            System.out.println("Média final: " + media +"\nAluno APROVADO!");
        }
    }

    public static void main(String[] args) {
        Atividade10 nota = new Atividade10();

        System.out.println("QUAL FOI A PRIMEIRA NOTA? ");
        nota.num1 = nota.ler.nextInt();

        System.out.println("QUAL FOI A SEGUNDA NOTA? ");
        nota.num2 = nota.ler.nextInt();

        nota.calcular();
    }
}