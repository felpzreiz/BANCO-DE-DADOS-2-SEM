package org.example;
import java.util.Scanner;

public class Atividade15{
    Scanner ler = new Scanner(System.in);
    double valor;
    int horas;


    public double calcular(){
        if(horas > 160){
            return((valor*(horas - 160))*1.5 + valor * 160);
        }else{
            return(valor*horas);
        }
    }

    public static void main(String[] args) {
        Atividade15 empregado;
        empregado = new Atividade15();
	
        System.out.println("INSIRA O VALOR DA SUA HORA:");
        empregado.valor = empregado.ler.nextDouble();

        System.out.println("INSIRA O NUMERO DE HORAS TRABALHADAS:");
        empregado.horas = empregado.ler.nextInt();

        System.out.println(empregado.calcular());
    }
}