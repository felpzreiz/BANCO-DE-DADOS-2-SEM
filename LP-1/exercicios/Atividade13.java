package org.example;
import java.util.Scanner;

public class Atividade13{
    Scanner ler = new Scanner(System.in);
    double num1;
    double num2;

    public void calcular(){
        if(num1 > num2){
            System.out.println(num2 + " , " + num1);
        }else{
            System.out.println(num1 + " , " + num2);
        }
    }

    public static void main(String[] args) {
        Atividade13 numero = new Atividade13();

        System.out.println("INSIRA UM NUMERO:");
        numero.num1 = numero.ler.nextInt();

        System.out.println("INSIRA OUTRO NUMERO:");
        numero.num2 = numero.ler.nextInt();

        numero.calcular();
    }
}