package org.example;
import java.util.Scanner;

public class Atividade5 {
    Scanner ler = new Scanner(System.in);
    double numCarros, valorTotal, comissao, salarioFixo;

    public double calcular(){
        return (salarioFixo + (numCarros * comissao) + (valorTotal * 0.05));
    }

    public static void main(String[] args) {
        Atividade5 salario = new Atividade5();

        System.out.println("INSIRA SEU SALÁRIO FIXO: ");
        salario.salarioFixo = salario.ler.nextDouble();

        System.out.println("INSIRA O NÚMERO DE CARROS VENDIDOS : ");
        salario.numCarros = salario.ler.nextDouble();

        System.out.println("INSIRA O VALOR DA COMISSÃO POR CARRO: ");
        salario.comissao = salario.ler.nextDouble();

        System.out.println("INSIRA O VALOR TOTAL VENDIDO: ");
        salario.valorTotal = salario.ler.nextDouble();

        System.out.println("SALARIO FINAL: R$ " + salario.calcular());
    }
}
