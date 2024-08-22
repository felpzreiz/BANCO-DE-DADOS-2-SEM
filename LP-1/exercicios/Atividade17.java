package org.example;
import java.util.Scanner;

public class Atividade17{
    Scanner ler = new Scanner(System.in);
    double p1, e1, e2, api, x, sub;

    public void calcular(){
        double media = (p1*0.6+((e1+e2)/2)*0.4)*0.5+(Math.max(((p1*0.6+((e1+e2)/2)*0.4)-5.9),0)/((p1*0.6+((e1+e2)/2)*0.4)-5.9))*(api*0.5)+x+(sub*0.2);
        System.out.println("MEDIA FINAL:" + media);
    }

    public static void main(String[] args) {
        Atividade17 nota = new Atividade17();

        System.out.println("INSIRA A NOTA DA P1:");
        nota.p1 = nota.ler.nextDouble();

        System.out.println("INSIRA A NOTA DE E1:");
        nota.e1 = nota.ler.nextDouble();

        System.out.println("INSIRA A NOTA DE E2:");
        nota.e2 = nota.ler.nextDouble();

        System.out.println("INSIRA A NOTA DA API:");
        nota.api = nota.ler.nextDouble();

        System.out.println("INSIRA A NOTA DE EXERCICIOS:");
        nota.x = nota.ler.nextDouble();

        System.out.println("INSIRA A NOTA DA SUB:");
        nota.sub = nota.ler.nextDouble();

        nota.calcular();
    }
}
