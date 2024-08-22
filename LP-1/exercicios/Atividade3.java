package org.example;

public class Atividade3 {
    double num1;
    double num2;

    public Atividade3(double sal, double reaj){
        this.num1 = sal;
        this.num2 = reaj;
    }

    public void reajust(){
        double novoSal = num1 + (num1*num2);
        System.out.println("Novo Salário: " + novoSal);
    }

    public static void main(String[] args) {
        Atividade3 salario = new Atividade3(1420, 0.5);
        salario.reajust();
    }
}
