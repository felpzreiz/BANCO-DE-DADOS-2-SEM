package org.example;
import java.util.Scanner;

public class Atividade14{
    Scanner ler = new Scanner(System.in);
    int num1;
    int num2;

    public int calcular(){
        if(num1 >= num2){
            return((24-num1) + num2);
        }else{
            return(num2-num1);
        }
    }

    public static void main(String[] args) {
        Atividade14 hora = new Atividade14();

	
	System.out.println("PARA 'MEIA-NOITE' INSIRA 24.");	
        System.out.println("INSIRA O HORARIO DE INICIO (APENAS HORAS):");
        hora.num1 = hora.ler.nextInt();

        System.out.println("INSIRA O HORARIO DE TERMINO (APENAS HORAS):");
        hora.num2 = hora.ler.nextInt();

        System.out.println(hora.calcular());
    }
}