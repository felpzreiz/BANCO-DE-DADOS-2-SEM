package org.example;
import java.util.Scanner;

public class Atividade11{
    Scanner ler = new Scanner(System.in);
    double num1;
    double num2;

    public void calcular(){
        if((num2-num1) >= 16){
            System.out.println("ESSE ANO VOCE PODERÁ VOTAR!");
        }else{
            System.out.println("ESSE ANO VOCE AINDA NÃO PODERÁ VOTAR!");
        }
    }

    public static void main(String[] args) {
        Atividade11 pessoa = new Atividade11();

        System.out.println("INSIRA O ANO DE NASCIMENTO:");
        pessoa.num1 = pessoa.ler.nextInt();

        System.out.println("INSIRA O ANO ATUAL:");
        pessoa.num2 = pessoa.ler.nextInt();

        pessoa.calcular();
    }
}