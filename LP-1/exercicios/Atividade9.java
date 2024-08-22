package org.example;
import java.util.Scanner;

public class Atividade9 {
    Scanner ler = new Scanner(System.in);
    int num1;

    public void calcular(){
        if(num1 < 12){
            System.out.println("Total: R$" + num1 * 1.30);
        }else{
            System.out.println("Total: R$" + num1 * 1);
        }
    }

    public static void main(String[] args) {
        Atividade9 macas = new Atividade9();

        System.out.println("QUANTAS MAÇAS FORAM COMPRADAS? ");
        macas.num1 = macas.ler.nextInt();

        macas.calcular();
    }
}
